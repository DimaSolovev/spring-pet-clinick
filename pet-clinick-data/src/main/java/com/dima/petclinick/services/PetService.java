package com.dima.petclinick.services;

import com.dima.petclinick.model.Owner;
import com.dima.petclinick.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
