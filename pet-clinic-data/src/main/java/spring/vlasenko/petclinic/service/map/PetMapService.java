package spring.vlasenko.petclinic.service.map;

import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.Pet;
import spring.vlasenko.petclinic.service.PetService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    void delete(Pet obj) {
        super.delete(obj);
    }
}
