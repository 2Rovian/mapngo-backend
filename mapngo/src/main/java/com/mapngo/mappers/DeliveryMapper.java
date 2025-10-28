package com.mapngo.mappers;

import com.mapngo.dtos.request.DeliveryRequestDto;
import com.mapngo.dtos.response.DeliveryResponseDto;
import com.mapngo.entities.DeliveryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DeliveryMapper {

    @Mapping(target = "id", ignore = true)
    DeliveryEntity RequestDtoToEntity(DeliveryRequestDto deliveryRequestDto);
    DeliveryResponseDto EntityToResponse(DeliveryEntity deliveryEntity);

}
