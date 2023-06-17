package com.eodi.service;

import com.eodi.entity.City;
import org.springframework.stereotype.Service;
import com.eodi.repository.CityRepository;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getCitiesOrderByOrderNum() {
        return cityRepository.findAllByOrderByOrderNumAsc();
    }
}
