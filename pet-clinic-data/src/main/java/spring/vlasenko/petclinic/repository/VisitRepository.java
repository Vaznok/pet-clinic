package spring.vlasenko.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import spring.vlasenko.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
