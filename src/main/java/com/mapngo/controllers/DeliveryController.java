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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<List<DeliveryResponseDto>> getAllDeliveries(){
        return ResponseEntity.ok(deliveryService.getAllDeliveries());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<DeliveryResponseDto> postDelivery(@RequestBody DeliveryRequestDto deliveryRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(deliveryService.postDelivery(deliveryRequestDto));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping
    public ResponseEntity<?> deleteAllDeliveries(){
        return ResponseEntity.ok(deliveryService.deleteAllDeliveries());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDeliveryById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(deliveryService.deleteDeliveryById(id));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public ResponseEntity<ResponseEntity<?>> updateDelivery(
            @RequestBody DeliveryRequestDto delivery,
            @PathVariable Long id
            ) {
        return ResponseEntity.ok().body(deliveryService.updateDelivery(id, delivery));
    }
}

