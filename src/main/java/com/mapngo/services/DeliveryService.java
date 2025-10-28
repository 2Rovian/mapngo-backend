package com.mapngo.services;

import com.mapngo.dtos.request.DeliveryRequestDto;
import com.mapngo.dtos.response.DeliveryResponseDto;
import com.mapngo.entities.DeliveryEntity;
import com.mapngo.mappers.DeliveryMapper;
import com.mapngo.repositories.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<DeliveryResponseDto> getAllDeliveries() {
        List<DeliveryEntity> deliveries = deliveryRepository.findAll();
//      return deliveries.stream().map(deliveryEntity -> deliveryMapper.EntityToResponse(deliveryEntity)).toList
//      return deliveries.stream().map(deliveryMapper::EntityToResponse).toList();
        return deliveryMapper.ListEntityToResponse(deliveryRepository.findAll());
    }

    public String deleteAllDeliveries() {
        deliveryRepository.deleteAll();
        return "it's over, he knows";
    }
}
