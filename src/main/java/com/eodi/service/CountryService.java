package com.eodi.service;

import com.eodi.dto.CityDto;
import com.eodi.dto.CountryDto;
import com.eodi.entity.City;
import com.eodi.entity.Country;
import com.eodi.repository.CountryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<CountryDto> getAllCountries() {
        List<Country> countries = countryRepository.findAllByOrderByOrderNumAsc();
        List<CountryDto> countryList = new ArrayList<>();

        for (Country country : countries) {
            CountryDto cityDto = new CountryDto(country.getCountrySeq(), country.getContinentsSeq()
                                                ,country.getCountryName(), country.getTitle(), country.getContents()
                                                , country.getOrderNum(), country.getTodayCnt());
            countryList.add(cityDto);
        }

        return countryList;
    }


}
