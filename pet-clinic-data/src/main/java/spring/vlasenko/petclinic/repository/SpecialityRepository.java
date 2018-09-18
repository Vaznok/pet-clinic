package spring.vlasenko.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import spring.vlasenko.petclinic.model.Specialty;

public interface SpecialityRepository extends CrudRepository<Specialty, Long> {
}
