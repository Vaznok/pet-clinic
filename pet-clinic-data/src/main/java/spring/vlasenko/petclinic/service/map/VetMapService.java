package spring.vlasenko.petclinic.service.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.Specialty;
import spring.vlasenko.petclinic.model.Vet;
import spring.vlasenko.petclinic.service.SpecialityService;
import spring.vlasenko.petclinic.service.VetService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialitesService;

    @Autowired
    public VetMapService(SpecialityService specialitesService) {
        this.specialitesService = specialitesService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet obj) {

        if (obj.getSpecialties().size() > 0) {
            obj.getSpecialties().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Specialty savedSpecialty = specialitesService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(obj);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
