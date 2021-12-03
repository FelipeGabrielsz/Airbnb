package com.exercicio.jpa.airbnb.JpaRepository;

import com.exercicio.jpa.airbnb.Locator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryLocator extends JpaRepository<Locator, Long> {

    //Criando uma busca por user e senha
    public Locator findByUser(String user);
}
