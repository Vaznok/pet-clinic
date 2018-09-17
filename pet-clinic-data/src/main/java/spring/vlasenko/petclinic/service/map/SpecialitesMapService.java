package spring.vlasenko.petclinic.service.map;

import spring.vlasenko.petclinic.model.Specialty;
import spring.vlasenko.petclinic.service.SpecialitesService;

import java.util.Set;

public class SpecialitesMapService extends AbstractMapService<Specialty, Long> implements SpecialitesService {
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
