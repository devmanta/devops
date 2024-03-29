package com.devmanta.devops.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> init() {
        return ResponseEntity.ok("GOOD JOB !!!");
    }

    @GetMapping("/gogo")
    public ResponseEntity<String> gogo() {
        return ResponseEntity.ok("KEEP GOING !!!");
    }

}
