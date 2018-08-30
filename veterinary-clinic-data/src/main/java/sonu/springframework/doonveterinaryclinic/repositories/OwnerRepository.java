package sonu.springframework.doonveterinaryclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sonu.springframework.doonveterinaryclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
