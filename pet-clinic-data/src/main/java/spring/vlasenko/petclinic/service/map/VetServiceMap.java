package spring.vlasenko.petclinic.service.map;

import spring.vlasenko.petclinic.model.Vet;
import spring.vlasenko.petclinic.service.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    Vet save(Long id, Vet obj) {
        return super.save(id, obj);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    void delete(Vet obj) {
        super.delete(obj);
    }
}
