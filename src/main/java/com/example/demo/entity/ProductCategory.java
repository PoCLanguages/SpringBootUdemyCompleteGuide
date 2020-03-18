package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ProductCategory", schema = "ecomDashApp")
public class ProductCategory extends KeyEntity{
    private String cateogryName;
    private int percentage;
    private boolean bestCategory;

    public String getCateogryName() {
        return cateogryName;
    }

    public void setCateogryName(String cateogryName) {
        this.cateogryName = cateogryName;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public boolean isBestCategory() {
        return bestCategory;
    }

    public void setBestCategory(boolean bestCategory) {
        this.bestCategory = bestCategory;
    }
}
