package com.epuepu.smoothieapp.repo;

import com.epuepu.smoothieapp.model.Smoothie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmoothieRepository extends CrudRepository<Smoothie, Long> {

}
