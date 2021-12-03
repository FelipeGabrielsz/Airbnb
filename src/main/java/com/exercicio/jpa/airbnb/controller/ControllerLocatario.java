package com.exercicio.jpa.airbnb.controller;

import com.exercicio.jpa.airbnb.JpaRepository.RespositoryLocatario;
import com.exercicio.jpa.airbnb.Locatario;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerLocatario {


    RespositoryLocatario repositoryLocatario;

    @GetMapping("/locatario")
    public List<Locatario> getAllUserLocatario(){
        return repositoryLocatario.findAll();
    }

    @GetMapping("/locatario/{user}/{senha}")
    public Locatario getLocatarioByID(@PathVariable(required = true) String user, String senha){

        return repositoryLocatario.findByUser(user);
    }

    @PostMapping("/locatario")
    public Locatario saveLocatario(@RequestBody Locatario locatario){
        return repositoryLocatario.save(locatario);
    }

    @DeleteMapping("/locatario/{id}")
    public void deleteLocatario(@PathVariable(required = true) Long id){
        repositoryLocatario.deleteById(id);
    }

}
