package com.liferay.home.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String googleId;

	@OneToMany
	private List<Device> devices;

	public User(String name, String googleId) {
		this.name = name;
		this.googleId = googleId;
	}

	public User() {
	}

	public Long getId() {
		return id;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", name='" + name + '\'' +
			", googleId='" + googleId + '\'' +
			", devices=" + devices +
			'}';
	}

}
