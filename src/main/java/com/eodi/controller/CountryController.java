package com.eodi.controller;

import com.eodi.dto.CityDto;
import com.eodi.dto.CountryDto;
import com.eodi.service.CountryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping("/list")
    public List<CountryDto> getCityListOrderedByOrderNum() {
        return countryService.getAllCountries();
    }

}
