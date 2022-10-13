package com.sprint_1.dto;

public class DietPlanDTO {
    private Long id;
    private String userId;
    private String slots;
    private String FoodType;
    private double proteinRatio;
    private double fatRatio;
    private double carbsRatio;
    private double total;

    public DietPlanDTO() {
    }

    public DietPlanDTO(Long id, String userId, String slots, String foodType,
                       double proteinRatio, double fatRatio, double carbsRatio, double total) {
        this.id = id;
        this.userId = userId;
        this.slots = slots;
        FoodType = foodType;
        this.proteinRatio = proteinRatio;
        this.fatRatio = fatRatio;
        this.carbsRatio = carbsRatio;
        this.total = total;
    }

    public DietPlanDTO(String userId, String slots, String foodType,
                       double proteinRatio, double fatRatio, double carbsRatio, double total) {
        this.userId = userId;
        this.slots = slots;
        FoodType = foodType;
        this.proteinRatio = proteinRatio;
        this.fatRatio = fatRatio;
        this.carbsRatio = carbsRatio;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSlots() {
        return slots;
    }

    public void setSlots(String slots) {
        this.slots = slots;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String foodType) {
        FoodType = foodType;
    }

    public double getProteinRatio() {
        return proteinRatio;
    }

    public void setProteinRatio(double proteinRatio) {
        this.proteinRatio = proteinRatio;
    }

    public double getFatRatio() {
        return fatRatio;
    }

    public void setFatRatio(double fatRatio) {
        this.fatRatio = fatRatio;
    }

    public double getCarbsRatio() {
        return carbsRatio;
    }

    public void setCarbsRatio(double carbsRatio) {
        this.carbsRatio = carbsRatio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DietPlanDTO{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", slots='" + slots + '\'' +
                ", FoodType='" + FoodType + '\'' +
                ", proteinRatio=" + proteinRatio +
                ", fatRatio=" + fatRatio +
                ", carbsRatio=" + carbsRatio +
                ", total=" + total +
                '}';
    }
}
