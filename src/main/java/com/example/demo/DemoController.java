package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class DemoController {
    private static final Logger log = LoggerFactory.getLogger(DemoController.class);
    @GetMapping("/orders")
    public List<Order> getOrders(@RequestHeader Map<String, String> RequestHeader) {

        log.info("request {}", RequestHeader);
        return Arrays.asList(
                new Order(1L, "book", 1234.00),
                new Order(2L, "cars", 1224.00),
                new Order(3L, "disk", 1244.00));
    }
}
