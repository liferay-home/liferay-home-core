package com.liferay.home.core.service;

import com.liferay.home.core.model.SensorData;

/**
 * Created by kocsi on 2017. 01. 27..
 */
public interface SensorDataService {

	public SensorData save(SensorData sensorData);

	public Iterable<SensorData> fetchAll();

}
