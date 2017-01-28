package com.liferay.home.core.controller;

import com.liferay.home.core.model.SensorData;
import com.liferay.home.core.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@RestController
public class DevicePlanController {

	@RequestMapping("/giveMeOrder")
	public String getOrder(@RequestParam(value = "deviceId") Long deviceId) {
		Iterable<SensorData> sensorDataList = sensorDataService.fetchByDeviceId(
			deviceId);

		Iterator<SensorData> sensorDataIterator = sensorDataList.iterator();

		SensorData sensorData = null;

		while(sensorDataIterator.hasNext()) {
			sensorData = sensorDataIterator.next();
		}

		if (sensorData == null) {
			return "NOOP";
		}

		Double value = sensorData.getValue();

		System.out.println("########Latest device data: " + value);

		if (value < 50) {
			return "HEAT";
		}

		return "COOL";
	}

	@Autowired
	SensorDataService sensorDataService;

}
