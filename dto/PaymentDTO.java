package com.sprint_1.dto;

import java.time.LocalTime;

public class PaymentDTO {
    private Long id;
    private double payment;
    private double discount;
    private LocalTime created_At;
    private LocalTime updated_At;
    private String userId;
    private Long planId;

    public PaymentDTO() {
    }

    public PaymentDTO(Long id, double payment, double discount, LocalTime created_At,
                      LocalTime updated_At, String userId, Long planId) {
        this.id = id;
        this.payment = payment;
        this.discount = discount;
        this.created_At = created_At;
        this.updated_At = updated_At;
        this.userId = userId;
        this.planId = planId;
    }

    public PaymentDTO(double payment, double discount, LocalTime created_At, LocalTime updated_At, String userId, Long planId) {
        this.payment = payment;
        this.discount = discount;
        this.created_At = created_At;
        this.updated_At = updated_At;
        this.userId = userId;
        this.planId = planId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public LocalTime getCreated_At() {
        return created_At;
    }

    public void setCreated_At(LocalTime created_At) {
        this.created_At = created_At;
    }

    public LocalTime getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(LocalTime updated_At) {
        this.updated_At = updated_At;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "id=" + id +
                ", payment=" + payment +
                ", discount=" + discount +
                ", created_At=" + created_At +
                ", updated_At=" + updated_At +
                ", userId='" + userId + '\'' +
                ", planId=" + planId +
                '}';
    }
}
