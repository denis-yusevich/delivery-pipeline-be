package com.example.delivery.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pipeline")
public class DeliveryController {

    @GetMapping("/message")
    public String getMessage() {
        return "Delivered by pipeline!";
    }
}
