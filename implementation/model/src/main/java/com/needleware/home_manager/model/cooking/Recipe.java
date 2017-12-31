package com.needleware.home_manager.model.cooking;

import com.needleware.home_manager.model.AEntity;
import com.needleware.home_manager.model.inventory.Item;
import com.needleware.home_manager.model.type.Amount;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Recipe extends AEntity {

    // region Fields

    private String name;
    private List<Recipe> parts;
    private Map<Item, Amount> ingredients;
    private String directions;
    private Amount preparationTime;
    private Amount cookTime;

    // endregion

    // region Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getParts() {
        return parts;
    }

    public void setParts(List<Recipe> parts) {
        this.parts = parts;
    }

    public Map<Item, Amount> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Item, Amount> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Amount getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Amount preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Amount getCookTime() {
        return cookTime;
    }

    public void setCookTime(Amount cookTime) {
        this.cookTime = cookTime;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name) &&
                Objects.equals(parts, recipe.parts) &&
                Objects.equals(ingredients, recipe.ingredients) &&
                Objects.equals(directions, recipe.directions) &&
                Objects.equals(preparationTime, recipe.preparationTime) &&
                Objects.equals(cookTime, recipe.cookTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, parts, ingredients, directions, preparationTime, cookTime);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("parts", parts)
                .append("ingredients", ingredients)
                .append("directions", directions)
                .append("preparationTime", preparationTime)
                .append("cookTime", cookTime)
                .toString();
    }

    // endregion
}