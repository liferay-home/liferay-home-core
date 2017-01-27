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
	private long longitude;
	private long latitude;

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
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

	public Location(long longitude, long latitude, Device device) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.device = device;
	}

	@ManyToOne
	private Device device;

}
