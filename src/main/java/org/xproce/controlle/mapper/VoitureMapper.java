package org.xproce.controlle.mapper;

import org.modelmapper.ModelMapper;
import org.xproce.controlle.dao.entities.Voiture;
import org.xproce.controlle.dto.VoitureDto;
import org.springframework.stereotype.Component;

@Component
public class VoitureMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Voiture fromVoitureDtoToVoiture(VoitureDto voitureDto) {
        return mapper.map(voitureDto, Voiture.class);
    }

    public VoitureDto fromVoitureToVoitureDto(Voiture voiture) {
        return mapper.map(voiture, VoitureDto.class);
    }
}
