package com.mapngo.controllers;

import com.mapngo.dtos.request.DeliveryRequestDto;
import com.mapngo.dtos.response.DeliveryResponseDto;
import com.mapngo.services.DeliveryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @PostMapping
    public ResponseEntity<DeliveryResponseDto> postDelivery(@RequestBody DeliveryRequestDto deliveryRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(deliveryService.postDelivery(deliveryRequestDto));
    }
}

