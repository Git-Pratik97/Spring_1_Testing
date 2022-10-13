package com.sprint_1.dto;

import java.time.LocalTime;

public class WeightLogDTO {
    private Long id;
    private double weight;
    private LocalTime created_At;
    private LocalTime updated_At;
    private String userId;

    public WeightLogDTO() {
    }

    public WeightLogDTO(Long id, double weight, LocalTime created_At, LocalTime updated_At, String userId) {
        this.id = id;
        this.weight = weight;
        this.created_At = created_At;
        this.updated_At = updated_At;
        this.userId = userId;
    }

    public WeightLogDTO(double weight, LocalTime created_At, LocalTime updated_At, String userId) {
        this.weight = weight;
        this.created_At = created_At;
        this.updated_At = updated_At;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    @Override
    public String toString() {
        return "WeightLogDTO{" +
                "id=" + id +
                ", weight=" + weight +
                ", created_At=" + created_At +
                ", updated_At=" + updated_At +
                ", userId='" + userId + '\'' +
                '}';
    }
}
