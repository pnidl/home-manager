package com.needleware.home_manager.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Generic item in the system. The items have name, expiration date, base UoM and category.
 *
 * @author Petr Nídl
 */
public class Item extends AEntity {

    // region Fields

    /**
     * Name of the item
     */
    private String name;

    /**
     * Description of the item
     */
    private String description;

    /**
     * {@link ItemCategory} that the item is assigned to
     */
    private ItemCategory category;

    /**
     * Base {@link UoM} for the item
     */
    private UoM baseUoM;

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

    /**
     * TODO: maybe only flat category ID?
     * Getter for {@link #category}
     *
     * @return Value of {@link #category}
     */
    public ItemCategory getCategory() {
        return category;
    }

    /**
     * Setter for {@link #category}
     *
     * @param category New value for {@link #category}
     */
    public void setCategory(ItemCategory category) {
        this.category = category;
    }

    /**
     * Getter for {@link #baseUoM}
     *
     * @return Value of {@link #baseUoM}
     */
    public UoM getBaseUoM() {
        return baseUoM;
    }

    public void setBaseUoM(UoM baseUoM) {
        this.baseUoM = baseUoM;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Item item = (Item) o;

        if (name != null ? !name.equals(item.name) : item.name != null) return false;
        if (description != null ? !description.equals(item.description) : item.description != null) return false;
        if (category != null ? !category.equals(item.category) : item.category != null) return false;
        return baseUoM != null ? baseUoM.equals(item.baseUoM) : item.baseUoM == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (baseUoM != null ? baseUoM.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("description", description)
                .append("category", category)
                .append("baseUoM", baseUoM)
                .toString();
    }

    // endregion
}
