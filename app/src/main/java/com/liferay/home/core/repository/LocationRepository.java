package com.liferay.home.core.repository;

import com.liferay.home.core.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@RepositoryRestResource(path = "locations")
public interface LocationRepository extends CrudRepository<Location, Long> {
}
