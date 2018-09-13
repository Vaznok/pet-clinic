package spring.vlasenko.petclinic.service.map;

import spring.vlasenko.petclinic.model.Owner;
import spring.vlasenko.petclinic.service.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    Owner save(Long id, Owner obj) {
        return super.save(id, obj);
    }

    @Override
    public Owner save(Owner obj) {
        return super.save(obj.getId(), obj);
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
