package com.liferay.home.core.repository;

import com.liferay.home.core.model.Device;
import com.liferay.home.core.model.SensorData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author Akos Thurzo
 */
@RepositoryRestResource(path = "/sensor-data")
public interface SensorDataRepository extends CrudRepository<SensorData, Long> {

	List<SensorData> findByDevice(Device device);

}
