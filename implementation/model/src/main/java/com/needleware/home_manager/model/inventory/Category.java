package com.needleware.home_manager.model.inventory;

import com.needleware.home_manager.model.AEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Category extends AEntity {

    // region Fields

    private String name;
    private Category parent;

    // endregion

    // region Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(parent, category.parent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, parent);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("parent", parent)
                .toString();
    }

    // endregion
}
