package spring.vlasenko.petclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {
    T findById(ID id);

    T save(T obj);

    Set<T> findAll();
}
