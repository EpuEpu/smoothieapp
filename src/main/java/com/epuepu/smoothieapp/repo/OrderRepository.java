package com.epuepu.smoothieapp.repo;

import com.epuepu.smoothieapp.model.Smoothie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Smoothie, Long> {
}
