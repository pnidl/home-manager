package com.needleware.home_manager.services;

import com.needleware.home_manager.api.ICommonCRUDService;
import com.needleware.home_manager.model.AEntity;

import java.util.*;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public abstract class AInMemoryCommonCRUDService<E extends AEntity> implements ICommonCRUDService<E> {

    // region Fields

    private final Map<String, E> byId = new HashMap<>();

    // endregion

    // region ICommonCRUDService

    @Override
    public String create(E entity) {
        String id = generateID();
        entity.setId(id);
        byId.put(id, entity);
        return id;
    }

    @Override
    public E update(E entity) {
        String id = entity.getId();
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Entity ID is mandatory for update operation");
        }
        byId.put(id, entity);
        return entity;
    }

    @Override
    public E findByID(String id) {
        return byId.get(id);
    }

    @Override
    public List<E> findByIDs(Collection<String> ids) {
        LinkedList<E> result = new LinkedList<>();
        for (String id : ids) {
            result.add(byId.get(id));
        }
        return result;
    }

    @Override
    public List<E> list() {
        return new ArrayList<>(byId.values());
    }

    @Override
    public void deleteByID(String id) {
        byId.remove(id);
    }

    // endregion

    // region Collaborators

    private String generateID() {
        return UUID.randomUUID().toString();
    }

    // endregion
}
