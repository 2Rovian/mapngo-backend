package com.mapngo.dtos.request;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record DeliveryRequestDto(
        String clientName,
        Double weightKg,
        String street,
        String neighbourhood,
        String complement,
        String city,
        String state,
        String country,
        Double latitude,
        Double longitude
) {
}

