package com.rajIt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	 @RequestMapping(value = "/login",method = RequestMethod.GET)
 public String viewLogin(ModelMap map) {
	 
	 return "login";
 }
}
