package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

   /* @GetMapping("/")
    public Map<String, Object> root() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Spring Boot REST API is running!");
        response.put("status", "UP");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }*/
   @GetMapping("/")
   public  Map<String ,Object > root() {
       Map<String ,Object> response = new HashMap<>();
       response.put("status", "UP");
       response.put("message", "Spring Boot REST API is running!");
       response.put("timestamp", System.currentTimeMillis());
       return response;
   }

    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}
