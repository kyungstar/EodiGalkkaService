package com.eodi.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "t_country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_seq")
    private Integer countrySeq;

    @Column(name = "continents_seq")
    private Integer continentsSeq;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "title")
    private String title;

    @Column(name = "contents")
    private String contents;

    @Column(name = "order_num")
    private Integer orderNum;

    @Column(name = "today_cnt")
    private Integer todayCnt;


}
