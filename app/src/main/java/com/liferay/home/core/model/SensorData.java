package com.liferay.home.core.model;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Akos Thurzo
 */
public class SensorData {
	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private Double value;

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
