package com.liferay.home.core.controller;

import com.liferay.home.core.model.SensorData;
import com.liferay.home.core.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeDeployController {

    @Autowired
    SensorDataService sensorDataService;

    @RequestMapping("/")
    public ModelAndView hello() {
        return new ModelAndView("layout");
    }

}