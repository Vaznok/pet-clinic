package spring.vlasenko.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import spring.vlasenko.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
