package com.liferay.home.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeDeployController {

    @RequestMapping("/")
    public ModelAndView hello() {
        return new ModelAndView("layout");
    }

}