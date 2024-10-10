package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "called hello";
    }

    @GetMapping("logger")
    public String logger() {
        log.error("ERROR!!");
        log.warn("WARN!!");
        log.info("INFO!!");
        log.debug("DEBUG!!");
        log.trace("TRACE!!");
        
        return "called logger";
    }

    @GetMapping("/logger2")
    public String logger2() {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.warn("warn");
        logger.info("info");

        return "called logger2";
    }

}