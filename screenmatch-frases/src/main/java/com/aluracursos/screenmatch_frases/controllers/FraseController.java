package com.aluracursos.screenmatch_frases.controllers;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService service;


    @GetMapping("/series/frases")
    public FraseDTO obtenerFrase()
    {
        return service.obtenerFrase();
    }
}
