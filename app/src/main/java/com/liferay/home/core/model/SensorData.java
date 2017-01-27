package com.liferay.home.core.model;


import javax.persistence.*;

/**
 * @author Akos Thurzo
 */
@Entity
public class SensorData {

	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Device device;
	@Enumerated(EnumType.STRING)
	private SensorType type;
	private Double value;

	public SensorData(Device device, SensorType type, Double value) {
		this.device = device;
		this.type = type;
		this.value = value;
	}
	public SensorData() {
	}

	@Override
	public String toString() {
		return "SensorData{" +
			"id=" + id +
			", device=" + device +
			", type=" + type +
			", value=" + value +
			'}';
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SensorType getType() {
		return type;
	}

	public void setType(SensorType type) {
		this.type = type;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public enum SensorType {
		HUMIDITY, TEMPERATURE
	}

}
