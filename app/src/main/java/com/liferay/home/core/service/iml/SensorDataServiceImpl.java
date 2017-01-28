package com.liferay.home.core.service.iml;

import com.liferay.home.core.model.Device;
import com.liferay.home.core.repository.DeviceRepository;
import com.liferay.home.core.service.SensorDataService;
import com.liferay.home.core.model.SensorData;
import com.liferay.home.core.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;


/**
 * Created by kocsi on 2017. 01. 27..
 */
@Service
@Transactional
public class SensorDataServiceImpl implements SensorDataService {

	@Override
	public Iterable<SensorData> fetchByDeviceId(long deviceId) {
		Device device = deviceRepository.findOne(deviceId);

		if (Objects.isNull(device)) {
			System.out.println("Unable to find device with id " + deviceId);
		}

		return sensorDataRepository.findByDevice(device);
	}

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

	@Autowired
	private DeviceRepository deviceRepository;

}
