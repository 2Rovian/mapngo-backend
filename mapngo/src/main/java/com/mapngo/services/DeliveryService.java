package com.mapngo.services;

import com.mapngo.dtos.request.DeliveryRequestDto;
import com.mapngo.dtos.response.DeliveryResponseDto;
import com.mapngo.entities.DeliveryEntity;
import com.mapngo.mappers.DeliveryMapper;
import com.mapngo.repositories.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;
    private final DeliveryMapper deliveryMapper;

    public DeliveryService(DeliveryRepository deliveryRepository, DeliveryMapper deliveryMapper) {
        this.deliveryRepository = deliveryRepository;
        this.deliveryMapper = deliveryMapper;
    }

    public DeliveryResponseDto postDelivery(DeliveryRequestDto delivery) {
        DeliveryEntity entity = deliveryMapper.RequestDtoToEntity(delivery);
        DeliveryEntity savedEntity = deliveryRepository.save(entity);
        return deliveryMapper.EntityToResponse(savedEntity);
    }
}
