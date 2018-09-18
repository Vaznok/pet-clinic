package spring.vlasenko.petclinic.service.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.Pet;
import spring.vlasenko.petclinic.repository.PetRepository;
import spring.vlasenko.petclinic.service.PetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
    private final PetRepository petRepository;

    @Autowired
    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet obj) {
        return petRepository.save(obj);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public void delete(Pet obj) {
        petRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
