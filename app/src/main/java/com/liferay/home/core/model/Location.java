package com.liferay.home.core.model;

import javax.persistence.*;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@Entity
public class Location {

	@Id
	@GeneratedValue
	private Long id;
	private Double longitude;
	private Double latitude;

	@ManyToOne
	private Device device;

	public Location(Double longitude, Double latitude, Device device) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.device = device;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLongitude() {
		return longitude;

	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Location() {
	}

	@Override
	public String toString() {
		return "Location{" +
			"id=" + id +
			", longitude=" + longitude +
			", latitude=" + latitude +
			", device=" + device +
			'}';
	}

}
