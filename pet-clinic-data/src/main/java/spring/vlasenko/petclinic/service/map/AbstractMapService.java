package spring.vlasenko.petclinic.service.map;

import spring.vlasenko.petclinic.model.BaseEntity;

import java.util.*;

abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T obj) {
        if (obj != null) {
            if(obj.getId() == null) {
                obj.setId(getNextId());
            }
            map.put(obj.getId(), obj);
        } else {
            throw new RuntimeException("Object can't be null");
        }
        return obj;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T obj) {
        map.entrySet().removeIf(entry-> entry.getValue().equals(obj));
    }

    private Long getNextId() {
        if(map == null || map.isEmpty()) {
            return 1L;
        } else {
            return Collections.max(map.keySet()) + 1;
        }
    }
}
