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

import com.example.demo.model.EmailValidater;



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
  //curl.exe -X POST -H "Content-Type: application/json" -d '{\"email\": \"alan@ias.edu\"}' http://localhost:8081/email-address-valid 
  @PostMapping(path="/email-address-valid")
  @ResponseStatus(HttpStatus.CREATED)
  public String isEmailValid(@RequestBody Map<String, Object> data) {
    String email = (String) data.get("email");
    EmailValidater emailValidater = new EmailValidater();
    boolean result = emailValidater.checkEmail(email);
    if (result) {
      return "Email VALID check: " + email + " is " + data + "\n";
    } else {
      return "Email INVALID check: " + email + " is " + data + "\n";
    }
  }
}
