package com.liferay.home.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@Entity
public class User {

	public Long getId() {
		return id;
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

	public User(String name, String googleId) {
		this.name = name;
		this.googleId = googleId;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", name='" + name + '\'' +
			", googleId='" + googleId + '\'' +
			'}';
	}

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String googleId;

}
