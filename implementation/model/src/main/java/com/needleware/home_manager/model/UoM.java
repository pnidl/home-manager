package com.needleware.home_manager.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Generic unit of measure to describe the amount of each item either stored or to be purchased
 *
 * @author Petr Nídl
 */
public class UoM extends AEntity {

    // region Fields

    /**
     * Name of the item category
     */
    private String name;

    /**
     * Common abbreviation of the unit
     */
    private String abbreviation;

    /**
     * Base unit for current unit or null if it's a base unit itself
     */
    private UoM base;

    /**
     * Ratio to convert the unit to the base unit, or null if it's a base unit itself
     */
    private Double ratioToBase;

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
     * Getter for {@link #abbreviation}
     *
     * @return Value of {@link #abbreviation}
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Setter for {@link #abbreviation}
     *
     * @param abbreviation New value for {@link #abbreviation}
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * Getter for {@link #base}
     *
     * @return Value of {@link #base}
     */
    public UoM getBase() {
        return base;
    }

    /**
     * Setter for {@link #base}
     *
     * @param base New value for {@link #base}
     */
    public void setBase(UoM base) {
        this.base = base;
    }

    /**
     * Getter for {@link #ratioToBase}
     *
     * @return Value of {@link #ratioToBase}
     */
    public Double getRatioToBase() {
        return ratioToBase;
    }

    /**
     * Setter for {@link #ratioToBase}
     *
     * @param ratioToBase New value for {@link #ratioToBase}
     */
    public void setRatioToBase(Double ratioToBase) {
        this.ratioToBase = ratioToBase;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UoM uoM = (UoM) o;

        if (name != null ? !name.equals(uoM.name) : uoM.name != null) return false;
        if (abbreviation != null ? !abbreviation.equals(uoM.abbreviation) : uoM.abbreviation != null) return false;
        if (base != null ? !base.equals(uoM.base) : uoM.base != null) return false;
        return ratioToBase != null ? ratioToBase.equals(uoM.ratioToBase) : uoM.ratioToBase == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (abbreviation != null ? abbreviation.hashCode() : 0);
        result = 31 * result + (base != null ? base.hashCode() : 0);
        result = 31 * result + (ratioToBase != null ? ratioToBase.hashCode() : 0);
        return result;
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
