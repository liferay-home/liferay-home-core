package com.liferay.home.core.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@Entity
public class Device {

	public enum DeviceType {
		HOME, PHONE
	}

	public DeviceType getType() {
		return type;
	}

	public void setType(DeviceType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Id
	@GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	private DeviceType type;
	private String name;

	@OneToMany
	private List<SensorData> sensorDataList = new ArrayList<>();

	public Device(DeviceType type, String name, String description) {
		this.type = type;
		this.name = name;
		this.description = description;
	}

	public Device() {
	}

	@Override
	public String toString() {
		return "Device{" +
			"id=" + id +
			", type=" + type +
			", name='" + name + '\'' +
			", description='" + description + '\'' +
			'}';
	}

	private String description;

}
