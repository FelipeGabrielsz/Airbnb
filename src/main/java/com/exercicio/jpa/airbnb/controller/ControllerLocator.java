package com.exercicio.jpa.airbnb.controller;

import com.exercicio.jpa.airbnb.JpaRepository.RepositoryLocator;
import com.exercicio.jpa.airbnb.Locatario;
import com.exercicio.jpa.airbnb.Locator;
import com.exercicio.jpa.airbnb.service.FiltrosLocator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerLocator {

    RepositoryLocator repositoryLocator;
    FiltrosLocator filtro;

    @GetMapping("/locator")
    public List<Locator> getAllUserLocatario(){
        return repositoryLocator.findAll();
    }

    @GetMapping("/locator/{user}/{senha}")
    public Locator getLocatorByID(@PathVariable(required = true) String user, String senha){

        return repositoryLocator.findByUser(user);
    }

    @PostMapping("/locator")
    public Locator saveLocator(@RequestBody Locator locator){
        return repositoryLocator.save(locator);
    }

    @DeleteMapping("/locator/{id}")
    public void deleteLocator(@PathVariable(required = true) Long id){
        repositoryLocator.deleteById(id);
    }
}
