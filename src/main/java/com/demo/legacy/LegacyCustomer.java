package com.demo.legacy;

import java.util.Objects;

public class LegacyCustomer {

    private String customerId;
    private String fullName;
    private LegacyAddress address;

    public LegacyCustomer() {
    }

    public LegacyCustomer(String customerId, String fullName, LegacyAddress address) {
        this.customerId = Objects.requireNonNull(customerId, "customerId");
        this.fullName = Objects.requireNonNull(fullName, "fullName");
        this.address = Objects.requireNonNull(address, "address");
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LegacyAddress getAddress() {
        return address;
    }

    public void setAddress(LegacyAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LegacyCustomer)) {
            return false;
        }
        LegacyCustomer that = (LegacyCustomer) o;
        return Objects.equals(customerId, that.customerId)
                && Objects.equals(fullName, that.fullName)
                && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, fullName, address);
    }

    @Override
    public String toString() {
        return "LegacyCustomer{" +
                "customerId='" + customerId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address=" + address +
                '}';
    }
}
