package com.dt2.petmania.repositories;

import com.dt2.petmania.entities.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, String> {
}