package com.epuepu.smoothieapp.model;

import com.epuepu.smoothieapp.enums.SmoothieSize;

import javax.persistence.*;
import java.math.BigDecimal;
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

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "base_ID")
    private SmoothieBase base;

    @Column(name = "size", nullable = false)
    @Enumerated(EnumType.STRING)
    private SmoothieSize size;

    @Column(name = "value", nullable = false)
    private BigDecimal value;

    @Column(name = "eggwhite", nullable = false)
    private Double eggwhite;

    @Column(name = "fat", nullable = false)
    private Double fat;

    @Column(name = "carbohydrates", nullable = false)
    private Double carbohydrates;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getEggwhite() {
        return eggwhite;
    }

    public void setEggwhite(Double eggwhite) {
        this.eggwhite = eggwhite;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
