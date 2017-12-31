package com.needleware.home_manager.model.type;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Vector<X extends Unit, Y extends Unit> {

    // region Fields

    private Amount<X> x;
    private Amount<Y> y;

    // endregion

    // region Getters/Setters

    public Amount<X> getX() {
        return x;
    }

    public void setX(Amount<X> x) {
        this.x = x;
    }

    public Amount<Y> getY() {
        return y;
    }

    public void setY(Amount<Y> y) {
        this.y = y;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector<?, ?> vector = (Vector<?, ?>) o;
        return Objects.equals(x, vector.x) &&
                Objects.equals(y, vector.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("x", x)
                .append("y", y)
                .toString();
    }

    // endregion
}
