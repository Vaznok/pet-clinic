package spring.vlasenko.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import spring.vlasenko.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
