package com.ramalho.apostasApp.controller;

import com.ramalho.apostasApp.entity.Partida;
import com.ramalho.apostasApp.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partida")
public class PartidaController {

    @Autowired
    private PartidaService service;

    @PostMapping
    public ResponseEntity salvar(@RequestBody Partida partida){
        return service.salvar(partida);
    }

    @GetMapping
    public ResponseEntity buscarTodos(){
        return service.buscarTodos();
    }
}
