package com.demo.legacy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LegacyOrder {

    private String orderId;
    private LegacyCustomer customer;
    private List<LegacyOrderItem> items;
    private LegacyOrderStatus status;

    public LegacyOrder() {
        this.items = new ArrayList<LegacyOrderItem>();
        this.status = LegacyOrderStatus.CREATED;
    }

    public LegacyOrder(String orderId, LegacyCustomer customer, List<LegacyOrderItem> items, LegacyOrderStatus status) {
        this.orderId = Objects.requireNonNull(orderId, "orderId");
        this.customer = Objects.requireNonNull(customer, "customer");
        this.items = new ArrayList<LegacyOrderItem>(Objects.requireNonNull(items, "items"));
        this.status = Objects.requireNonNull(status, "status");
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LegacyCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(LegacyCustomer customer) {
        this.customer = customer;
    }

    public List<LegacyOrderItem> getItems() {
        return items;
    }

    public void setItems(List<LegacyOrderItem> items) {
        this.items = items;
    }

    public LegacyOrderStatus getStatus() {
        return status;
    }

    public void setStatus(LegacyOrderStatus status) {
        this.status = status;
    }

    public BigDecimal totalAmount() {
        BigDecimal total = BigDecimal.ZERO;
        for (LegacyOrderItem item : items) {
            total = total.add(item.lineTotal());
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LegacyOrder)) {
            return false;
        }
        LegacyOrder that = (LegacyOrder) o;
        return Objects.equals(orderId, that.orderId)
                && Objects.equals(customer, that.customer)
                && Objects.equals(items, that.items)
                && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customer, items, status);
    }

    @Override
    public String toString() {
        return "LegacyOrder{" +
                "orderId='" + orderId + '\'' +
                ", customer=" + customer +
                ", items=" + items +
                ", status=" + status +
                '}';
    }
}
