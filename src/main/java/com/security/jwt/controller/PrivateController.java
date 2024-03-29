package com.security.jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/private")
public class PrivateController {

    @GetMapping
    public String getMessage(HttpServletRequest request) {
        System.out.println("Private call");
        return "Hello from private API controller";
    }
}
