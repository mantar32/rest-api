package com.example.restapi.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<Map<String, Object>> handleError(HttpServletRequest request) {
        Map<String, Object> errorResponse = new HashMap<>();
        
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        String errorMessage = (String) request.getAttribute("javax.servlet.error.message");
        String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
        
        errorResponse.put("status", statusCode != null ? statusCode : HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorResponse.put("error", HttpStatus.valueOf(statusCode != null ? statusCode : HttpStatus.INTERNAL_SERVER_ERROR.value()).getReasonPhrase());
        errorResponse.put("message", errorMessage != null ? errorMessage : "An error occurred");
        errorResponse.put("path", requestUri != null ? requestUri : "unknown");
        
        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(statusCode != null ? statusCode : HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }
}
