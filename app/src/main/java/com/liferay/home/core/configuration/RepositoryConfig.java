package com.liferay.home.core.configuration;

import com.liferay.home.core.model.Device;
import com.liferay.home.core.model.Location;
import com.liferay.home.core.model.SensorData;
import com.liferay.home.core.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * Created by kocsi on 2017. 01. 27..
 */
@Configuration
@Import(RepositoryRestMvcConfiguration.class)
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(
		RepositoryRestConfiguration config) {

		//config.setBasePath("/sdr-api");
		//config.setReturnBodyOnCreate(Boolean.TRUE);
		//config.setReturnBodyOnUpdate(Boolean.TRUE);
		config.exposeIdsFor(Device.class);
		config.exposeIdsFor(Location.class);
		config.exposeIdsFor(SensorData.class);
		config.exposeIdsFor(User.class);
		//config.useHalAsDefaultJsonMediaType(false);
		//config.setDefaultMediaType(MediaType.APPLICATION_JSON);
	}

}
