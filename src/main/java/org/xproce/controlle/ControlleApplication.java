package org.xproce.controlle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.controlle.dto.VoitureDto;
import org.xproce.controlle.service.VoitureService;

import java.util.List;

@SpringBootApplication
public class ControlleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlleApplication.class, args);
    }

    @Bean
    CommandLineRunner start(VoitureService voitureService) {
        return args -> {

            voitureService.saveCars(
                    List.of(
                            VoitureDto.builder().model("model1").matricul("a23b56").color("black").price(200000).build(),
                            VoitureDto.builder().model("model2").matricul("b67887e2").color("green").price(340000).build(),
                            VoitureDto.builder().model("model3").matricul("789tt3267").color("red").price(70000).build(),
                            VoitureDto.builder().model("model4").matricul("23tg657").color("black").price(2100000).build()
                    )
            );
        };
    }
}
