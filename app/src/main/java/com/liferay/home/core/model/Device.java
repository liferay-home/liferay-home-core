package com.liferay.home.core.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@Entity
public class Device {

	@Id
	@GeneratedValue
	private Long id;
	private String description;
	@Column(unique = true)
	private String serialNumber;
	@Enumerated(EnumType.STRING)
	private DeviceType type;
	private String name;
	@OneToMany
	private List<Location> locations = new ArrayList<>();
	@OneToMany
	private List<SensorData> sensorData = new ArrayList<>();

	public Device(String description, String serialNumber, DeviceType type, String name, List<Location> locations, List<SensorData> sensorData) {
		this.description = description;
		this.serialNumber = serialNumber;
		this.type = type;
		this.name = name;
		this.locations = locations;
		this.sensorData = sensorData;
	}

	public Device() {
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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

	@Override
	public String toString() {
		return "Device{" +
			"id=" + id +
			", type=" + type +
			", name='" + name + '\'' +
			", description='" + description + '\'' +
			'}';
	}

	public enum DeviceType {
		HOME, PHONE;
	}

}
