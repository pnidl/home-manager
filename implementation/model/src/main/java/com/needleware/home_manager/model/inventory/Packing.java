package com.needleware.home_manager.model.inventory;

import com.needleware.home_manager.model.AEntity;
import com.needleware.home_manager.model.type.Amount;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;
import java.util.Objects;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Packing extends AEntity {

    // region Fields

    private Item item;
    private Manufacturer manufacturer;
    private Amount capacity;
    private Amount currentContent;
    private Boolean open;
    private Storage storage;
    private Date expirationDate;

    // endregion

    // region Getters/Setters

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Amount getCapacity() {
        return capacity;
    }

    public void setCapacity(Amount capacity) {
        this.capacity = capacity;
    }

    public Amount getCurrentContent() {
        return currentContent;
    }

    public void setCurrentContent(Amount currentContent) {
        this.currentContent = currentContent;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    // endregion

    // region Java basics

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packing packing = (Packing) o;
        return Objects.equals(item, packing.item) &&
                Objects.equals(manufacturer, packing.manufacturer) &&
                Objects.equals(capacity, packing.capacity) &&
                Objects.equals(currentContent, packing.currentContent) &&
                Objects.equals(open, packing.open) &&
                Objects.equals(storage, packing.storage) &&
                Objects.equals(expirationDate, packing.expirationDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(item, manufacturer, capacity, currentContent, open, storage, expirationDate);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("item", item)
                .append("manufacturer", manufacturer)
                .append("capacity", capacity)
                .append("currentContent", currentContent)
                .append("open", open)
                .append("storage", storage)
                .append("expirationDate", expirationDate)
                .toString();
    }

    // endregion
}