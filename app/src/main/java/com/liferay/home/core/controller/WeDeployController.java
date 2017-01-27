package com.liferay.home.core.controller;

import com.liferay.home.core.model.SensorData;
import com.liferay.home.core.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeDeployController {

    @Autowired
    SensorDataRepository sensorDataRepository;

    @RequestMapping("/")
    public ModelAndView hello() {

        sensorDataRepository.save(new SensorData("test", 1.0d));

        System.out.print("Sensor Data: ");

        sensorDataRepository.findAll().forEach(System.out::println);

        return new ModelAndView("layout");
    }

}