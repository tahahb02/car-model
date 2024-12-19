package org.xproce.controlle.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Voiture {
    @Id
    @GeneratedValue
    Long id_voiture;
    String model;
    String color;
    String matricul;
    double price;
}
