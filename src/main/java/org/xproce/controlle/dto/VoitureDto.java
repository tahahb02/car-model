package org.xproce.controlle.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class VoitureDto {
    Long id_voiture;
    String model;
    String color;
    String matricul;
    double price;
}
