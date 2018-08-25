package sonu.springframework.doonveterinaryclinic.services.map;

import org.springframework.stereotype.Service;
import sonu.springframework.doonveterinaryclinic.model.Speciality;
import sonu.springframework.doonveterinaryclinic.services.SpecialtiesService;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {

        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
