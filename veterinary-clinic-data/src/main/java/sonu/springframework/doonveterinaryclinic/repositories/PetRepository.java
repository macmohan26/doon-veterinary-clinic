package sonu.springframework.doonveterinaryclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sonu.springframework.doonveterinaryclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
