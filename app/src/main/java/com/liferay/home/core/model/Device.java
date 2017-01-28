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
	private DeviceStatus status;
	@ManyToOne
	private User user;
	@Enumerated(EnumType.STRING)
	private DeviceType type;
	private String name;
	@OneToMany
	private List<Location> locations = new ArrayList<>();
	@OneToMany
	private List<SensorData> sensorData = new ArrayList<>();

	public Device(String description, String serialNumber, DeviceStatus status, User user, DeviceType type, String name, List<Location> locations, List<SensorData> sensorData) {
		this.description = description;
		this.serialNumber = serialNumber;
		this.status = status;
		this.user = user;
		this.type = type;
		this.name = name;
		this.locations = locations;
		this.sensorData = sensorData;
	}

	public Device() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DeviceStatus getStatus() {
		return status;
	}

	public void setStatus(DeviceStatus status) {
		this.status = status;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public List<SensorData> getSensorData() {
		return sensorData;
	}

	public void setSensorData(List<SensorData> sensorData) {
		this.sensorData = sensorData;
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
			", description='" + description + '\'' +
			", serialNumber='" + serialNumber + '\'' +
			", status=" + status +
			", user=" + user +
			", type=" + type +
			", name='" + name + '\'' +
			", locations=" + locations +
			", sensorData=" + sensorData +
			'}';
	}

	public enum DeviceStatus {
		ACTIVE, INACTIVE
	}

	public enum DeviceType {
		HOME, PHONE;
	}

}
