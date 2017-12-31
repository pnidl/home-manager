package com.needleware.home_manager.model.type;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Unit {

    // region Fields

    private String name;
    private String abbreviation;
    private Unit base;
    private BigDecimal ratioToBase;

    // endregion

    // region Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Unit getBase() {
        return base;
    }

    public void setBase(Unit base) {
        this.base = base;
    }

    public BigDecimal getRatioToBase() {
        return ratioToBase;
    }

    public void setRatioToBase(BigDecimal ratioToBase) {
        this.ratioToBase = ratioToBase;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Objects.equals(name, unit.name) &&
                Objects.equals(abbreviation, unit.abbreviation) &&
                Objects.equals(base, unit.base) &&
                Objects.equals(ratioToBase, unit.ratioToBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, abbreviation, base, ratioToBase);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("abbreviation", abbreviation)
                .append("base", base)
                .append("ratioToBase", ratioToBase)
                .toString();
    }

    // endregion
}
