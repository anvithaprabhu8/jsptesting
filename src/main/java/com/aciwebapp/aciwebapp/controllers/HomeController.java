package com.aciwebapp.aciwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller         //if multiple contolllers then addr equest mapping along with controller to identufy
public class HomeController {
	     @RequestMapping("/home")
         public String ViewHomePage() {
        	   return "home.jsp";
         }
}
