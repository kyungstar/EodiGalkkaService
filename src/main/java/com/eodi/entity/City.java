package com.eodi.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;




@Entity
@Table(name = "t_city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_seq")
    private Long citySeq;

    @Column(name = "country_seq")
    private Long countrySeq;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "order_num")
    private int orderNum;

    // Getters and setters (생략 가능)
}
