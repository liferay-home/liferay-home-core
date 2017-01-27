package com.liferay.home.core.repository;

import com.liferay.home.core.model.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@RepositoryRestResource(path = "/devices")
public interface DeviceRepository extends CrudRepository<Device, Long> {

	public Device findBySerialNumber(
		@Param("serialNumber") String serialNumber);

}
