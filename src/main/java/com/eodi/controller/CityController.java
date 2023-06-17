package com.eodi.controller;

import com.eodi.dto.CityDto;
import com.eodi.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/list")
    public List<CityDto> getCityListOrderedByOrderNum() {
        return cityService.getAllCitiesOrderedByOrderNum();
    }

    // 추가적인 API 엔드포인트 및 메소드 선언이 필요한 경우 여기에 작성

}
