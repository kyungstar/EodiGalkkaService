package com.eodi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryDto {

    private final Integer countrySeq;
    private final Integer continentsSeq;
    private final String countryName;
    private final String title;
    private final String contents;
    private final Integer orderNum;
    private final Integer todayCnt;

    public CountryDto(Integer countrySeq, Integer continentsSeq, String countryName, String title,  String contents, Integer orderNum, Integer todayCnt) {
        this.countrySeq = countrySeq;
        this.continentsSeq = continentsSeq;
        this.countryName = countryName;
        this.title = title;
        this.contents = contents;
        this.orderNum = orderNum;
        this.todayCnt = todayCnt;
    }

}
