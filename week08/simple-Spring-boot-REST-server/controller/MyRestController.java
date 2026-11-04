package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.RequestBody;  


@RestController 
public class MyRestController {

  @GetMapping(path="/")
  @ResponseStatus(HttpStatus.OK)
  public String getRoot() {
      return "Good day!";
  }

//curl.exe -X POST -H "Content-Type: application/json" -d '{\"data\": \"Testing this endpoint\"}' http://localhost:8081/for-curl-data 
  @PostMapping("/for-curl-data")
  @ResponseStatus(HttpStatus.CREATED)
  public String sayHiBack(@RequestBody Map<String, Object> data) {
    return "Received: " + data.get("data");
  }


  //  curl.exe -X POST -H "Content-Type: application/json" http://localhost:8081/say-hi-back?data=Hi_there
  @PostMapping(path="/say-hi-back")
  @ResponseStatus(HttpStatus.CREATED)
  public String say_hi_back(@RequestParam(value = "data", // @RequestBody  @RequestParam
    defaultValue = "Enjoy␣your␣day!\n") String data) {
    return "Echo: " + data;
  }
  //curl.exe -X POST -H "Content-Type: application/json" http://localhost:8081/email-address-valid?email="alan@ias.edu"
  //curl.exe -X POST -H "Content-Type: application/json" http://localhost:8081/email-address-valid?email="alan@iasedu"
  @PostMapping(path="/email-address-valid")
  @ResponseStatus(HttpStatus.CREATED)
  public String isEmailValid(@RequestParam(value = "email") String email) {
    String data = "";
    if (email.contains("@") && email.contains(".")) {
      data = "Valid email address.";
    } else {
      data = "Invalid email address.";
    }   
    return "Email check: " + email + " is " + data + "\n";
  }
}
