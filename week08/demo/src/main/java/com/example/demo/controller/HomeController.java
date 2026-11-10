package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.RequestBody;  


@RestController 
public class HomeController {
  @GetMapping("/")
  public String home() {
    return "Hello wonderful Spring Boot!\n\n"; 
  }

  @GetMapping("/other-endpoint")
  public String homeOther() {
    return "Hello wonderful from OTHER-ENDPOINT!\n\n"; 
  }

  @PostMapping(path="/say-hi-back", consumes="application/json")
  @ResponseStatus(HttpStatus.CREATED)
  public String say_hi_back(@RequestParam(value = "data", // @RequestBody  @RequestParam
    defaultValue = "Enjoy␣your␣day!\n") String data) {
  return "Echo: " + data;
  }
}