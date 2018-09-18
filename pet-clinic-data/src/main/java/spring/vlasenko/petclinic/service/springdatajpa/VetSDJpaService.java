package spring.vlasenko.petclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.Vet;
import spring.vlasenko.petclinic.repository.VetRepository;
import spring.vlasenko.petclinic.service.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet obj) {
        return vetRepository.save(obj);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void delete(Vet obj) {
        vetRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
