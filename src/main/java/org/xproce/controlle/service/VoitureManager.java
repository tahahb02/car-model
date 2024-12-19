package org.xproce.controlle.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.xproce.controlle.dao.entities.Voiture;
import org.xproce.controlle.dao.repositories.VoitureRepository;
import org.xproce.controlle.dto.VoitureDto;
import org.xproce.controlle.mapper.VoitureMapper;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class VoitureManager implements VoitureService {

    private final VoitureRepository voitureRepository;
    private final VoitureMapper voitureMapper;


    @Override
    public VoitureDto saveVoiture(VoitureDto voitureDto) {

        Voiture voiture = voitureMapper.fromVoitureDtoToVoiture(voitureDto);

        voiture = voitureRepository.save(voiture);

        return voitureMapper.fromVoitureToVoitureDto(voiture);
    }


    @Override
    public List<VoitureDto> getVoitureByModel(String model) {
        List<Voiture> voitures = voitureRepository.findByModel(model);
        List<VoitureDto> voitureDtos = new ArrayList<>();
        for (Voiture voiture : voitures) {
            voitureDtos.add(voitureMapper.fromVoitureToVoitureDto(voiture));
        }
        return voitureDtos;
    }


    @Override
    public List<VoitureDto> saveCars(List<VoitureDto> carDTOs) {
        List<Voiture> voitures = new ArrayList<>();
        for (VoitureDto voitureDto : carDTOs) {
            voitures.add(voitureMapper.fromVoitureDtoToVoiture(voitureDto));
        }
        voitures = voitureRepository.saveAll(voitures);
        List<VoitureDto> voitureDtos = new ArrayList<>();
        for (Voiture voiture : voitures) {
            voitureDtos.add(voitureMapper.fromVoitureToVoitureDto(voiture));
        }
        return voitureDtos;
    }
}
