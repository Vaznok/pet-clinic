package spring.vlasenko.petclinic.service.map;

import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.Vet;
import spring.vlasenko.petclinic.service.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj);
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
