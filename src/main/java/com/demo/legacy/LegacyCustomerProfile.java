package com.demo.legacy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class LegacyCustomerProfile implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull
    private String customerCode;

    @NotNull
    private LegacyAddress primaryAddress;

    private List<LegacyAddress> alternateAddresses = new ArrayList<>();

    @NotNull
    private Date registeredAt;

    private Map<String, String> metadata;

    // Intentionally creates a cycle with LegacyOrder for dependency-resolution testing
    private List<LegacyOrder> orders = new ArrayList<>();

    public LegacyCustomerProfile() {
    }

    public LegacyCustomerProfile(String customerCode, LegacyAddress primaryAddress, Date registeredAt) {
        this.customerCode = Objects.requireNonNull(customerCode, "customerCode");
        this.primaryAddress = Objects.requireNonNull(primaryAddress, "primaryAddress");
        this.registeredAt = Objects.requireNonNull(registeredAt, "registeredAt");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public LegacyAddress getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(LegacyAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public List<LegacyAddress> getAlternateAddresses() {
        return alternateAddresses;
    }

    public void setAlternateAddresses(List<LegacyAddress> alternateAddresses) {
        this.alternateAddresses = alternateAddresses;
    }

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public List<LegacyOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<LegacyOrder> orders) {
        this.orders = orders;
    }
}
