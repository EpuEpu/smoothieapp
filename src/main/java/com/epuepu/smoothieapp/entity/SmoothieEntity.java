package com.epuepu.smoothieapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class SmoothieEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private List<Ingredient> ingredientList;

    private SmoothieBase base;

    private SmoothieSize size;

    private BigDecimal value;

    // nutritionvalue

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
