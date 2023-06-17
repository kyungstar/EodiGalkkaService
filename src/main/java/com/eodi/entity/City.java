package com.eodi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_seq")
    private Long citySeq;

    @Column(name = "country_seq")
    private Long countrySeq;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "order_num")
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

    // 생성자, 게터(getter), 세터(setter) 생략

}
