package com.exercicio.jpa.airbnb.JpaRepository;

import com.exercicio.jpa.airbnb.Locatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespositoryLocatario extends JpaRepository<Locatario, Long> {

    //Criando uma busca por user e senha
    public Locatario findByUser(String user);
}
