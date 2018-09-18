package spring.vlasenko.petclinic.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.Specialty;
import spring.vlasenko.petclinic.service.SpecialityService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialityService {
    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty obj) {
        return super.save(obj);
    }

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Specialty obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
