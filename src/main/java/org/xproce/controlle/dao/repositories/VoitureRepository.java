package org.xproce.controlle.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.controlle.dao.entities.Voiture;

import java.util.List;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    public List<Voiture> findByModel(String model);

}
