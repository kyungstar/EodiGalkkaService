package com.eodi.dto;

public class CityDto {

    private Long citySeq;
    private Long countrySeq;
    private String cityName;
    private Integer orderNum;

    public Long getCitySeq() {
        return citySeq;
    }

    public void setCitySeq(Long citySeq) {
        this.citySeq = citySeq;
    }

    public Long getCountrySeq() {
        return countrySeq;
    }

    public void setCountrySeq(Long countrySeq) {
        this.countrySeq = countrySeq;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}
