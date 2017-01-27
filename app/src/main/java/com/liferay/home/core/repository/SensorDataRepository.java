package com.liferay.home.core.repository;

import com.liferay.home.core.model.SensorData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Akos Thurzo
 */
public interface SensorDataRepository extends CrudRepository<SensorData, Long> {
}
