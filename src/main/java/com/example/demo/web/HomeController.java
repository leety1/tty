package com.example.demo.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.azure.spring.cloud.feature.manager.FeatureManager;

@Controller
@ConfigurationProperties("controller")
public class HomeController {
	private  FeatureManager featureManager;
	
	public HomeController(FeatureManager featureManager) {
		this.featureManager = featureManager;
	}
	
	@RequestMapping("/index2")
	public String getIndex() {
		return "index2";
	}
	
	@RequestMapping("/index3")
	public String getFashion() {
		return "index3";
	}
}