package spring.vlasenko.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import spring.vlasenko.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
