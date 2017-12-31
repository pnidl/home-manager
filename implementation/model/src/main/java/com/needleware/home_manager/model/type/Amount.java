package com.needleware.home_manager.model.type;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Amount<U extends Unit> {

    // region Fields

    private BigDecimal amount;
    private U unit;

    // endregion

    // region Getters/Setters

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public U getUnit() {
        return unit;
    }

    public void setUnit(U unit) {
        this.unit = unit;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount1 = (Amount) o;
        return Objects.equals(amount, amount1.amount) &&
                Objects.equals(unit, amount1.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, unit);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("amount", amount)
                .append("unit", unit)
                .toString();
    }

    // endregion
}
