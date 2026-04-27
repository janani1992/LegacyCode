package com.demo.legacy;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class LegacyInvoice implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private String invoiceNo;

    @NotNull
    private LegacyOrder order;

    @NotNull
    private LegacyMoney total;

    @NotNull
    private Date issuedAt;

    public LegacyInvoice() {
    }

    public LegacyInvoice(String invoiceNo, LegacyOrder order, LegacyMoney total, Date issuedAt) {
        this.invoiceNo = Objects.requireNonNull(invoiceNo, "invoiceNo");
        this.order = Objects.requireNonNull(order, "order");
        this.total = Objects.requireNonNull(total, "total");
        this.issuedAt = Objects.requireNonNull(issuedAt, "issuedAt");
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public LegacyOrder getOrder() {
        return order;
    }

    public void setOrder(LegacyOrder order) {
        this.order = order;
    }

    public LegacyMoney getTotal() {
        return total;
    }

    public void setTotal(LegacyMoney total) {
        this.total = total;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }
}
