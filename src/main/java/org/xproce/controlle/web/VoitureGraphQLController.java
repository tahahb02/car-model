package org.xproce.controlle.web;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.xproce.controlle.dto.VoitureDto;
import org.xproce.controlle.service.VoitureService;

import java.util.List;

public class VoitureGraphQLController {

    private VoitureService VoitureService ;

    @MutationMapping
    public VoitureDto saveVoiture(@Argument VoitureDto Voiture){
        return VoitureService.saveVoiture(Voiture);
    }


    @QueryMapping
    public List<VoitureDto> getVoitureByModel(@Argument String model){
        return VoitureService.getVoitureByModel(model);
    }


}
