package com.needleware.home_manager.model.inventory;

import com.needleware.home_manager.model.AEntity;
import com.needleware.home_manager.model.type.Amount;
import com.needleware.home_manager.model.type.Unit;
import com.needleware.home_manager.model.type.Vector;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Item extends AEntity {

    // region Fields

    private String name;
    private Unit defaultUnit;
    private Category category;
    private Amount durability;
    private Amount durabilityWhenOpen;
    private Vector decay;

    // endregion

    // region Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getDefaultUnit() {
        return defaultUnit;
    }

    public void setDefaultUnit(Unit defaultUnit) {
        this.defaultUnit = defaultUnit;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Amount getDurability() {
        return durability;
    }

    public void setDurability(Amount durability) {
        this.durability = durability;
    }

    public Amount getDurabilityWhenOpen() {
        return durabilityWhenOpen;
    }

    public void setDurabilityWhenOpen(Amount durabilityWhenOpen) {
        this.durabilityWhenOpen = durabilityWhenOpen;
    }

    public Vector getDecay() {
        return decay;
    }

    public void setDecay(Vector decay) {
        this.decay = decay;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(defaultUnit, item.defaultUnit) &&
                Objects.equals(category, item.category) &&
                Objects.equals(durability, item.durability) &&
                Objects.equals(durabilityWhenOpen, item.durabilityWhenOpen) &&
                Objects.equals(decay, item.decay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, defaultUnit, category, durability, durabilityWhenOpen, decay);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("defaultUnit", defaultUnit)
                .append("category", category)
                .append("durability", durability)
                .append("durabilityWhenOpen", durabilityWhenOpen)
                .append("decay", decay)
                .toString();
    }

    // endregion
}
