package com.paymentservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    private Long paymentId;
    private Long bid;
    private String status;
    private String mode;

    public Payment() {
        super();
    }

    public Payment(Long paymentId, Long bid, String status, String mode) {
        this.paymentId = paymentId;
        this.bid = bid;
        this.status = status;
        this.mode = mode;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
