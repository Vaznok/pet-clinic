package spring.vlasenko.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import spring.vlasenko.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
