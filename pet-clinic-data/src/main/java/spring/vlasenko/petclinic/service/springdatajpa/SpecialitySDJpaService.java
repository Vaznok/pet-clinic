package spring.vlasenko.petclinic.service.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.Specialty;
import spring.vlasenko.petclinic.repository.SpecialityRepository;
import spring.vlasenko.petclinic.service.SpecialityService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    @Autowired
    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Specialty findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty obj) {
        return specialityRepository.save(obj);
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialityRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public void delete(Specialty obj) {
        specialityRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
