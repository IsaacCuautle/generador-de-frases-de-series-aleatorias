package com.aluracursos.screenmatch_frases.models;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personaje;
    private String poster;


    public String getTitulo() {
        return titulo;
    }


    public String getFrase() {
        return frase;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getPoster() {
        return poster;
    }

}
