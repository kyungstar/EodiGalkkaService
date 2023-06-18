package com.eodi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityDto {

    private Long citySeq;
    private Long countrySeq;
    private String cityName;
    private Integer orderNum;

    public CityDto(Long citySeq, Long countrySeq, String cityName, Integer orderNum) {
        this.citySeq = citySeq;
        this.countrySeq = countrySeq;
        this.cityName = cityName;
        this.orderNum = orderNum;
    }

}
