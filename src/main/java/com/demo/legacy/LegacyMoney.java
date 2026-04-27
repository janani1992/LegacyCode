package com.demo.legacy;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class LegacyMoney {

    @NotNull
    private String currency;

    @NotNull
    private BigDecimal amount;

    public LegacyMoney() {
    }

    public LegacyMoney(String currency, BigDecimal amount) {
        this.currency = Objects.requireNonNull(currency, "currency");
        this.amount = Objects.requireNonNull(amount, "amount");
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
