package com.example.demo.magazine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.HomeController;
@RestController
public class magazineController {
	
	@RequestMapping(value="/Lv",method = RequestMethod.GET)
	public String getFashion() {
		return "index3";
	}
	
}
