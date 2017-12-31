package com.needleware.home_manager.model.inventory;

import com.needleware.home_manager.model.AEntity;
import com.needleware.home_manager.model.type.Amount;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Storage extends AEntity {

    // region Fields

    private String name;
    private Amount temperature;

    // endregion

    // region Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getTemperature() {
        return temperature;
    }

    public void setTemperature(Amount temperature) {
        this.temperature = temperature;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(name, storage.name) &&
                Objects.equals(temperature, storage.temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, temperature);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("temperature", temperature)
                .toString();
    }

    // endregion
}
