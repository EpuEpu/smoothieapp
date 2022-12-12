package com.epuepu.smoothieapp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "smoothie_order")
public class Order {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_smoothie",
            joinColumns = { @JoinColumn(name = "fk_smoothie") },
            inverseJoinColumns = { @JoinColumn(name = "fk_order") })
    private List<Smoothie> orderedSmoothies;

    private LocalDateTime orderTime;

    private LocalDateTime finishTime;

    private BigDecimal sum;

    private boolean isTakeaway = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Smoothie> getOrderedSmoothies() {
        return orderedSmoothies;
    }

    public void setOrderedSmoothies(List<Smoothie> orderedSmoothies) {
        this.orderedSmoothies = orderedSmoothies;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public boolean isTakeaway() {
        return isTakeaway;
    }

    public void setTakeaway(boolean takeaway) {
        isTakeaway = takeaway;
    }

}
