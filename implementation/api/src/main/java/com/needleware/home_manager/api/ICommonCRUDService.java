package com.needleware.home_manager.api;

import com.needleware.home_manager.model.AEntity;

import java.util.Collection;
import java.util.List;

/**
 * Common interface to all CRUD services responsible for single entity.
 *
 * @param <E> Entity to be handled
 *
 * @author Petr Nídl
 */
public interface ICommonCRUDService<E extends AEntity> {

    String create(E entity);

    E update(E entity);

    E findByID(String id);

    List<E> findByIDs(Collection<String> ids);

    List<E> list();

    void deleteByID(String id);

}
