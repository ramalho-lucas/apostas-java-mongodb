package com.ramalho.apostasApp.service;

import com.ramalho.apostasApp.entity.Partida;
import com.ramalho.apostasApp.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository repository;

    public ResponseEntity salvar(Partida partida){
        try {
            repository.save(partida);
            return new ResponseEntity("Partidada salva com sucesso", HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity("Erro ao salvar partida", HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity buscarTodos(){
        return  new ResponseEntity(repository.findAll(), HttpStatus.OK);
    }
}
