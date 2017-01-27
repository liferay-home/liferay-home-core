package io.wedeploy.example;

import com.liferay.home.core.model.SensorData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = SensorData.class)
public class WeDeployController {

    public WeDeployController() {

    }

    public static void main(String[] args) {
        SpringApplication.run(WeDeployController.class, args);
    }

    @RequestMapping("/")
    public ModelAndView hello() {
        return new ModelAndView("layout");
    }

}