package com.dima.petclinick.services;

import com.dima.petclinick.model.Owner;
import com.dima.petclinick.model.Vet;
import jdk.vm.ci.meta.Value;

import java.util.Set;

public class VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
