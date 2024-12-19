package org.xproce.controlle.service;

import org.xproce.controlle.dto.VoitureDto;

import java.util.List;



public interface VoitureService {
    VoitureDto saveVoiture(VoitureDto VoitureDTO);

    List<VoitureDto> getVoitureByModel(String model);

    List<VoitureDto> saveCars(List<VoitureDto> carDTOs);
}
