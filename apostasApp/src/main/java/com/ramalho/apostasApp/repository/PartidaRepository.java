package com.ramalho.apostasApp.repository;

import com.ramalho.apostasApp.entity.Partida;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends MongoRepository<Partida, Integer> {
}
