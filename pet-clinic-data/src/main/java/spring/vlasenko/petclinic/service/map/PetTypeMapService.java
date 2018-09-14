package spring.vlasenko.petclinic.service.map;

import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.PetType;
import spring.vlasenko.petclinic.service.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType obj) {
        return super.save(obj);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType obj) {
        super.map.remove(obj);
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }
}
