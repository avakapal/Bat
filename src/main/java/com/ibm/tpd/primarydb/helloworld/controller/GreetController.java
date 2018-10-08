package com.ibm.tpd.primarydb.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author SangitaPal
*
*/

@RestController
public class GreetController {
   
    @RequestMapping("/greeting")
    public String greet(){
       
        return "Hello World...have a good day!";
    }
}