package com.needleware.home_manager.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * Abstract entity class to be parent of all internal entities as all of them have an {@link #id} field.
 *
 * @author Petr Nídl
 */
public abstract class AEntity {

    // region Fields

    /**
     * ID of the entity, UUID String.
     */
    private String id;

    // endregion

    // region Getters/Setters

    /**
     * Getter for {@link #id}
     *
     * @return Value of {@link #id}
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for {@link #id}
     *
     * @param id New value for {@link #id}
     */
    public void setId(String id) {
        this.id = id;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AEntity aEntity = (AEntity) o;
        return Objects.equals(id, aEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .toString();
    }

    // endregion
}
