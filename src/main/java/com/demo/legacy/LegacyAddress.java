package com.demo.legacy;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class LegacyAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private String line1;

    private String line2;

    @NotNull
    private String city;

    @NotNull
    private String country;

    @NotNull
    private String postalCode;

    public LegacyAddress() {
    }

    public LegacyAddress(String line1, String city, String country, String postalCode) {
        this.line1 = Objects.requireNonNull(line1, "line1");
        this.city = Objects.requireNonNull(city, "city");
        this.country = Objects.requireNonNull(country, "country");
        this.postalCode = Objects.requireNonNull(postalCode, "postalCode");
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
