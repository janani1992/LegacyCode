package com.demo.legacy;

import java.util.Objects;

public class LegacyAddress {

    private String line1;
    private String city;
    private String country;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LegacyAddress)) {
            return false;
        }
        LegacyAddress that = (LegacyAddress) o;
        return Objects.equals(line1, that.line1)
                && Objects.equals(city, that.city)
                && Objects.equals(country, that.country)
                && Objects.equals(postalCode, that.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line1, city, country, postalCode);
    }

    @Override
    public String toString() {
        return "LegacyAddress{" +
                "line1='" + line1 + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
