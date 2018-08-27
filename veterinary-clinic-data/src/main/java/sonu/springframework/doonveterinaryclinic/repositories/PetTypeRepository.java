package sonu.springframework.doonveterinaryclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sonu.springframework.doonveterinaryclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
