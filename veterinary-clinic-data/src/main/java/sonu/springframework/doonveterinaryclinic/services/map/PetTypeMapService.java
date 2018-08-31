package sonu.springframework.doonveterinaryclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sonu.springframework.doonveterinaryclinic.model.PetType;
import sonu.springframework.doonveterinaryclinic.services.PetTypeService;

import java.util.Set;
 @Service
 @Profile({"default","map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {

    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);

    }
}
