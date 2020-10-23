package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "dummy-management")
public class DummyController {

    @GetMapping("")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World from demo-dummy module");
    }

}
