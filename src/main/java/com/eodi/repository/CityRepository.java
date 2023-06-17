package com.eodi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eodi.entity.City;

import java.util.List;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findAllByOrderByOrderNumAsc();
}
