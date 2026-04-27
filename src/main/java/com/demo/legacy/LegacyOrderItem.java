package com.demo.legacy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class LegacyOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private String sku;

    @Min(1)
    private int quantity;

    @NotNull
    private BigDecimal unitPrice;

    private LegacyMoney discount;

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

    public LegacyMoney getDiscount() {
        return discount;
    }

    public void setDiscount(LegacyMoney discount) {
        this.discount = discount;
    }
}
