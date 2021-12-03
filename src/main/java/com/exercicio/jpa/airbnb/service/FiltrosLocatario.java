package com.exercicio.jpa.airbnb.service;

import com.exercicio.jpa.airbnb.JpaRepository.RespositoryLocatario;
import com.exercicio.jpa.airbnb.Locatario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FiltrosLocatario {

    RespositoryLocatario repositoryLocatario;
    Locatario locatario;


}
