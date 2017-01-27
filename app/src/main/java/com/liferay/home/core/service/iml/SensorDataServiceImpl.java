package com.liferay.home.core.service.iml;

import com.liferay.home.core.service.SensorDataService;
import com.liferay.home.core.model.SensorData;
import com.liferay.home.core.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@Service
public class SensorDataServiceImpl implements SensorDataService {

	@Override
	public SensorData save(SensorData sensorData) {
		return sensorDataRepository.save(sensorData);
	}

	@Override
	public Iterable<SensorData> fetchAll() {
		return sensorDataRepository.findAll();
	}


	@Autowired
	private SensorDataRepository sensorDataRepository;

}
