package spring.vlasenko.petclinic.service.map;

import spring.vlasenko.petclinic.model.Pet;
import spring.vlasenko.petclinic.service.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    Pet save(Long id, Pet obj) {
        return super.save(id, obj);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj.getId(), obj);
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
