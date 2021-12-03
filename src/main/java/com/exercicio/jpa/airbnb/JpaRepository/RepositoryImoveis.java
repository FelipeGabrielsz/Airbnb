package com.exercicio.jpa.airbnb.JpaRepository;

import com.exercicio.jpa.airbnb.Imoveis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryImoveis extends JpaRepository<Imoveis, Long> {

    //Criando Metodo para recuperar apenas os Status no controller
    public Imoveis findByStatus(String status);

}
