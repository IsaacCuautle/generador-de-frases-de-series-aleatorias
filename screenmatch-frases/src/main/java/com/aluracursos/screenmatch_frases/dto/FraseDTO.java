package com.aluracursos.screenmatch_frases.dto;

import com.aluracursos.screenmatch_frases.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;

public record FraseDTO(
        String titulo,
        String frase,
        String personaje,
        String poster
)
{

}
