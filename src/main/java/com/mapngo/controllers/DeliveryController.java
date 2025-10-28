package com.mapngo.controllers;

import com.mapngo.dtos.request.DeliveryRequestDto;
import com.mapngo.dtos.response.DeliveryResponseDto;
import com.mapngo.services.DeliveryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public ResponseEntity<List<DeliveryResponseDto>> getAllDeliveries(){
        return ResponseEntity.ok(deliveryService.getAllDeliveries());
    }

    @PostMapping
    public ResponseEntity<DeliveryResponseDto> postDelivery(@RequestBody DeliveryRequestDto deliveryRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(deliveryService.postDelivery(deliveryRequestDto));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAllDeliveries(){
        return ResponseEntity.ok(deliveryService.deleteAllDeliveries());
    }

}

