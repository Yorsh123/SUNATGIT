package com.electronicbulling.bulling.repository;

import com.electronicbulling.bulling.entity.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends MongoRepository<Client, Integer> {
    Optional<Client> findByTipoDoc(String tipoDoc);
}
