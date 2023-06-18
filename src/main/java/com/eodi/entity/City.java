package com.eodi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
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


}
