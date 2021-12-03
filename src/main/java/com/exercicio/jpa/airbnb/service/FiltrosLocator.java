package com.exercicio.jpa.airbnb.service;

import com.exercicio.jpa.airbnb.JpaRepository.RepositoryLocator;
import com.exercicio.jpa.airbnb.Locator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FiltrosLocator {

    RepositoryLocator repositoryLocator;
    Locator locator;

}
