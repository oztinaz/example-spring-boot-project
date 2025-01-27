package com.example.demo1.controller;

import com.example.demo1.service.Demo1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/demo1")
@RestController
@Slf4j
public class Demo1Controller {

    private final Demo1Service demo1Service;

    public Demo1Controller(Demo1Service demo1Service) {
        this.demo1Service = demo1Service;
    }

    @GetMapping("/random")
    public ResponseEntity<Integer> random() {
        log.info("DEMO 1 CONTROLLER");
        return ResponseEntity.ok(demo1Service.generateRandomInt());
    }
}
