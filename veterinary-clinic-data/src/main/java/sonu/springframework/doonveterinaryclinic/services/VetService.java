package sonu.springframework.doonveterinaryclinic.services;

import sonu.springframework.doonveterinaryclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
