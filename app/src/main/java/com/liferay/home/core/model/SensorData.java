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
	private String type;
	private Double value;

	public SensorData(Device device, String type, Double value) {
		this.device = device;
		this.type = type;
		this.value = value;
	}

	public SensorData() {
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	@Override
	public String toString() {
		return "SensorData{" +
			"id=" + id +
			", type='" + type + '\'' +
			", value=" + value +
			'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
