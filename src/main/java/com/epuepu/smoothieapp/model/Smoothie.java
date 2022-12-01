package com.epuepu.smoothieapp.model;

import com.epuepu.smoothieapp.enums.SmoothieSize;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "smoothie")
public class Smoothie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Ingredient> ingredientList = new java.util.ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "base_ID")
    private SmoothieBase base;

    @Column(name = "size", nullable = false)
    private SmoothieSize size;

    @Column(name = "value", nullable = false)
    private BigDecimal value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public SmoothieBase getBase() {
        return base;
    }

    public void setBase(SmoothieBase base) {
        this.base = base;
    }

    public SmoothieSize getSize() {
        return size;
    }

    public void setSize(SmoothieSize size) {
        this.size = size;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
