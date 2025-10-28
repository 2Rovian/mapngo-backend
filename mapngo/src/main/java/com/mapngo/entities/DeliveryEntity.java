package com.mapngo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_deliveries")
@AllArgsConstructor @NoArgsConstructor
@Data
public class DeliveryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_name", nullable = false)
    private String clientName;   // Nome do cliente

    @Column(name = "weight", nullable = false)
    private Double weightKg;     // Peso em kg

    @Column(name = "street", nullable = false)
    private String street;       // Logradouro

    @Column(name = "neighborhood", nullable = false)
    private String neighbourhood; // Bairro

    @Column(name = "complement", nullable = true)
    private String complement;   // Complemento

    @Column(name = "city", nullable = false)
    private String city;         // Cidade

    @Column(name = "state", nullable = false)
    private String state;        // Estado

    @Column(name = "country", nullable = false)
    private String country;      // País

    @Column(name = "latitude", nullable = false)
    private Double latitude;     // Latitude

    @Column(name = "longitude", nullable = false)
    private Double longitude;    // Longitude
}
