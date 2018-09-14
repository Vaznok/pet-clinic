package spring.vlasenko.petclinic.service.map;

import org.springframework.stereotype.Service;
import spring.vlasenko.petclinic.model.Owner;
import spring.vlasenko.petclinic.service.OwnerService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner obj) {
        return super.save(obj);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    void delete(Owner obj) {
        super.delete(obj);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return map.values().stream().filter(owner -> owner.getLastName().equals(lastName)).findFirst().get();
    }
}
