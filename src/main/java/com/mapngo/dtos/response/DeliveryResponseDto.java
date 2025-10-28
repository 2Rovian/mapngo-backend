package com.mapngo.dtos.response;

public record DeliveryResponseDto(
        Long id,
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
