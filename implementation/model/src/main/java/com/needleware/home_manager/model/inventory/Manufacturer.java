package com.needleware.home_manager.model.inventory;

import com.needleware.home_manager.model.AEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Manufacturer extends AEntity {

    // region Fields

    private String name;

    // endregion

    // region Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .toString();
    }

    // endregion
}