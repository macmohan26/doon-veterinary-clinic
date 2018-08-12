package sonu.springframework.doonveterinaryclinic.services;

import sonu.springframework.doonveterinaryclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
