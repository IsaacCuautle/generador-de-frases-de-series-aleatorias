package com.aluracursos.screenmatch_frases.services;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.models.Frase;
import com.aluracursos.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFrase() {
        Frase frase = repository.obtenerFrase();
        return new FraseDTO(
                frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonaje(),
                frase.getPoster()
        );
    }
}
