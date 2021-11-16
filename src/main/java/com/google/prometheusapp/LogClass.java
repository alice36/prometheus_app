package com.google.prometheusapp;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogClass {
    private static int num = 0;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(LogClass.class);

    public LogClass() {
        logger.info("log is working");
    }

    @GetMapping("count")
    public int getName() {
        logger.info("log info is working");
        return ++num;
    }

}
