package com.dt2.petmania.controllers;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetRepository repository;

    public PetController(PetRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public List<Pet> listar() {
        return (List<Pet>) repository.findAll();
    }


    @PostMapping
    public Pet criar(@RequestBody Pet p) {
        return repository.save(p);
    }


    @DeleteMapping("/{nome}")
    public void deletar(@PathVariable String nome) {
        repository.deleteById(nome);
    }
}