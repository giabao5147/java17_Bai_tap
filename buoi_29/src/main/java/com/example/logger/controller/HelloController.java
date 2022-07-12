package com.example.logger.controller;

import com.example.logger.LoggerApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(LoggerApplication.class);

    @RequestMapping("/hello")
    public ResponseEntity<?> hello() {
        logger.info("Hello from spring boot");
        return new ResponseEntity("Hello", HttpStatus.OK);
    }
}
