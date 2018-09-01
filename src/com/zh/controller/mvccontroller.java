package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mvccontroller {
	
	@RequestMapping("spring")
public String welcome() {
	return "springmvc";
}
}
