package com.exercicio.jpa.airbnb.controller;

import com.exercicio.jpa.airbnb.Imoveis;
import com.exercicio.jpa.airbnb.JpaRepository.RepositoryImoveis;
import com.exercicio.jpa.airbnb.Locator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerCadastroImoveis {

    RepositoryImoveis repositoryImoveis;

    @GetMapping("/locator/imoveis")
    public List<Imoveis> getAllUserLocatario(){

        return repositoryImoveis.findAll();
    }

    @GetMapping("/locator/imoveis/{status}")
    public Imoveis getLocatorByID(@PathVariable(required = true) String status){
        return repositoryImoveis.findByStatus(status);
    }

    @PostMapping("/locator/imoveis")
    public Imoveis saveLocator(@RequestBody Imoveis imovel){
        return repositoryImoveis.save(imovel);
    }

    @DeleteMapping("/locator/imoveis/{id}")
    public void deleteLocator(@PathVariable(required = true) Long id){
        repositoryImoveis.deleteById(id);
    }
}
