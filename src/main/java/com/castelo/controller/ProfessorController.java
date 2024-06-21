package com.castelo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.castelo.dto.ProfessorDto;
import com.castelo.modelo.Professor;

public class ProfessorController {

    @GetMapping(value = "/")
    public String imprimir(){
        return "chegou aqui...";
    }

    @PostMapping(value = "/api/professor/")
    public void create(ProfessorDto professorDto){

        Professor professor = professorDto.novoProfessor();
        System.out.println(professor.toString());
    }
    
}
