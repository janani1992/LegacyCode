package com.demo.legacy;

import java.math.BigDecimal;
import java.util.Objects;

public class LegacyOrderItem {

    private String sku;
    private int quantity;
    private BigDecimal unitPrice;

    public LegacyOrderItem() {
    }

    public LegacyOrderItem(String sku, int quantity, BigDecimal unitPrice) {
        this.sku = Objects.requireNonNull(sku, "sku");
        this.quantity = quantity;
        this.unitPrice = Objects.requireNonNull(unitPrice, "unitPrice");
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal lineTotal() {
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LegacyOrderItem)) {
            return false;
        }
        LegacyOrderItem that = (LegacyOrderItem) o;
        return quantity == that.quantity
                && Objects.equals(sku, that.sku)
                && Objects.equals(unitPrice, that.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, quantity, unitPrice);
    }

    @Override
    public String toString() {
        return "LegacyOrderItem{" +
                "sku='" + sku + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
