package com.needleware.home_manager.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Items can be grouped into categories that denote their correlation.
 *
 * @author Petr Nídl
 */
public class ItemCategory extends AEntity {

    // region Fields

    /**
     * Name of the item category
     */
    private String name;

    /**
     * Description of the item category
     */
    private String description;

    // endregion

    // region Getters/Setters

    /**
     * Getter for {@link #name}
     *
     * @return Value of {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for {@link #name}
     *
     * @param name New value for {@link #name}
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for {@link #description}
     *
     * @return Value of {@link #description}
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for {@link #description}
     *
     * @param description New value for {@link #description}
     */
    public void setDescription(String description) {
        this.description = description;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ItemCategory that = (ItemCategory) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("description", description)
                .toString();
    }

    // endregion
}
