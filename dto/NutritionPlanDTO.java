package com.sprint_1.dto;

import java.time.LocalDate;

public class NutritionPlanDTO {
    private Long id;
    private String name;
    private String planDiscription;
    private LocalDate created_At;
    private LocalDate updated_At;
    private double price;

    public NutritionPlanDTO() {
    }

    public NutritionPlanDTO(Long id, String name, String planDiscription, LocalDate created_At, LocalDate updated_At, double price) {
        this.id = id;
        this.name = name;
        this.planDiscription = planDiscription;
        this.created_At = created_At;
        this.updated_At = updated_At;
        this.price = price;
    }

    public NutritionPlanDTO(String name, String planDiscription, LocalDate created_At, LocalDate updated_At, double price) {
        this.name = name;
        this.planDiscription = planDiscription;
        this.created_At = created_At;
        this.updated_At = updated_At;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanDiscription() {
        return planDiscription;
    }

    public void setPlanDiscription(String planDiscription) {
        this.planDiscription = planDiscription;
    }

    public LocalDate getCreated_At() {
        return created_At;
    }

    public void setCreated_At(LocalDate created_At) {
        this.created_At = created_At;
    }

    public LocalDate getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(LocalDate updated_At) {
        this.updated_At = updated_At;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "NutritionPlanDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", planDiscription='" + planDiscription + '\'' +
                ", created_At=" + created_At +
                ", updated_At=" + updated_At +
                ", price=" + price +
                '}';
    }
}
