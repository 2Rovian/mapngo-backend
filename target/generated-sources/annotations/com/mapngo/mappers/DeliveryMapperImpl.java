package com.mapngo.mappers;

import com.mapngo.dtos.request.DeliveryRequestDto;
import com.mapngo.dtos.response.DeliveryResponseDto;
import com.mapngo.entities.DeliveryEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-28T18:27:50-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Ubuntu)"
)
@Component
public class DeliveryMapperImpl implements DeliveryMapper {

    @Override
    public DeliveryEntity RequestDtoToEntity(DeliveryRequestDto deliveryRequestDto) {
        if ( deliveryRequestDto == null ) {
            return null;
        }

        DeliveryEntity deliveryEntity = new DeliveryEntity();

        deliveryEntity.setClientName( deliveryRequestDto.clientName() );
        deliveryEntity.setWeightKg( deliveryRequestDto.weightKg() );
        deliveryEntity.setStreet( deliveryRequestDto.street() );
        deliveryEntity.setNeighbourhood( deliveryRequestDto.neighbourhood() );
        deliveryEntity.setComplement( deliveryRequestDto.complement() );
        deliveryEntity.setCity( deliveryRequestDto.city() );
        deliveryEntity.setState( deliveryRequestDto.state() );
        deliveryEntity.setCountry( deliveryRequestDto.country() );
        deliveryEntity.setLatitude( deliveryRequestDto.latitude() );
        deliveryEntity.setLongitude( deliveryRequestDto.longitude() );

        return deliveryEntity;
    }

    @Override
    public DeliveryResponseDto EntityToResponse(DeliveryEntity deliveryEntity) {
        if ( deliveryEntity == null ) {
            return null;
        }

        Long id = null;
        String clientName = null;
        Double weightKg = null;
        String street = null;
        String neighbourhood = null;
        String complement = null;
        String city = null;
        String state = null;
        String country = null;
        Double latitude = null;
        Double longitude = null;

        id = deliveryEntity.getId();
        clientName = deliveryEntity.getClientName();
        weightKg = deliveryEntity.getWeightKg();
        street = deliveryEntity.getStreet();
        neighbourhood = deliveryEntity.getNeighbourhood();
        complement = deliveryEntity.getComplement();
        city = deliveryEntity.getCity();
        state = deliveryEntity.getState();
        country = deliveryEntity.getCountry();
        latitude = deliveryEntity.getLatitude();
        longitude = deliveryEntity.getLongitude();

        DeliveryResponseDto deliveryResponseDto = new DeliveryResponseDto( id, clientName, weightKg, street, neighbourhood, complement, city, state, country, latitude, longitude );

        return deliveryResponseDto;
    }

    @Override
    public List<DeliveryResponseDto> ListEntityToResponse(List<DeliveryEntity> deliveryEntities) {
        if ( deliveryEntities == null ) {
            return null;
        }

        List<DeliveryResponseDto> list = new ArrayList<DeliveryResponseDto>( deliveryEntities.size() );
        for ( DeliveryEntity deliveryEntity : deliveryEntities ) {
            list.add( EntityToResponse( deliveryEntity ) );
        }

        return list;
    }

    @Override
    public List<DeliveryEntity> ListRequestDtoToEntity(List<DeliveryRequestDto> deliveryRequestDtos) {
        if ( deliveryRequestDtos == null ) {
            return null;
        }

        List<DeliveryEntity> list = new ArrayList<DeliveryEntity>( deliveryRequestDtos.size() );
        for ( DeliveryRequestDto deliveryRequestDto : deliveryRequestDtos ) {
            list.add( RequestDtoToEntity( deliveryRequestDto ) );
        }

        return list;
    }
}
