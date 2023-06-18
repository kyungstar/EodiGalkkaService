package com.eodi.service;

import com.eodi.dto.CityDto;
import com.eodi.entity.City;
import com.eodi.repository.CityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<CityDto> getAllCitiesOrderedByOrderNum() {
        List<City> cities = cityRepository.findAllByOrderByOrderNum();


        return cities.stream()
                .map(city -> new CityDto(city.getCitySeq(), city.getCountrySeq(), city.getCityName(), city.getOrderNum()))
                .collect(Collectors.toList());
    }


}
