package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("logger")
    public String logger() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");

        return "called logger";
    }

    @GetMapping("logger2")
    public String logger2() {
        Logger logger = Logger.getLogger(String.valueOf(getClass()));
        logger.warning("warn");

        return "callded logger2";
    }

}
