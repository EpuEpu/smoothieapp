package com.epuepu.smoothieapp.model;

import com.epuepu.smoothieapp.enums.SmoothieSize;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "smoothie")
public class Smoothie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "smoothie_ingredient",
            joinColumns = { @JoinColumn(name = "fk_ingredient") },
            inverseJoinColumns = { @JoinColumn(name = "fk_smoothie") })
    private Set<Ingredient> ingredientList;

    @ManyToOne(cascade = CascadeType.ALL)
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

    public Set<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(Set<Ingredient> ingredientList) {
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
