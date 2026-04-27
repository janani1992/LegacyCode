package com.demo.legacy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class LegacyOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private String orderNo;

    @NotNull
    private LegacyCustomerProfile customer;

    @NotNull
    private List<LegacyOrderItem> items = new ArrayList<>();

    @NotNull
    private LegacyOrderStatus status;

    @NotNull
    private Date createdAt;

    public LegacyOrder() {
    }

    public LegacyOrder(String orderNo, LegacyCustomerProfile customer, LegacyOrderStatus status, Date createdAt) {
        this.orderNo = Objects.requireNonNull(orderNo, "orderNo");
        this.customer = Objects.requireNonNull(customer, "customer");
        this.status = Objects.requireNonNull(status, "status");
        this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public LegacyCustomerProfile getCustomer() {
        return customer;
    }

    public void setCustomer(LegacyCustomerProfile customer) {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
