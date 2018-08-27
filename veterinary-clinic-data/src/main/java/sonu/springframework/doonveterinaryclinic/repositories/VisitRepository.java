package sonu.springframework.doonveterinaryclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sonu.springframework.doonveterinaryclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
    
}
