package spring.vlasenko.petclinic.service;

import spring.vlasenko.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
