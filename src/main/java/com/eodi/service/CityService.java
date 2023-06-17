package com.eodi.service;

import com.eodi.dto.CityDto;
import com.eodi.entity.City;
import com.eodi.repository.CityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        System.out.println(cities);
        return cities.stream()
                .map(this::convertToCityDTO)
                .collect(Collectors.toList());
    }

    private CityDto convertToCityDTO(City city) {
        CityDto cityDTO = new CityDto();
        cityDTO.setCitySeq(city.getCitySeq());
        cityDTO.setCountrySeq(city.getCountrySeq());
        cityDTO.setCityName(city.getCityName());
        cityDTO.setOrderNum(city.getOrderNum());
        return cityDTO;
    }

    // 추가적인 메소드 선언이 필요한 경우 여기에 작성

}
