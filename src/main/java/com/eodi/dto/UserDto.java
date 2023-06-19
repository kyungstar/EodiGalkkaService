package com.eodi.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UserDto {
    private final String userId;
    private final String loginId;
    private final String userType;
    private final String email;
    private final String phoneNumber;
    private final String userName;
    private final String nickName;
    private final String gender;
    private final String address;
    private final String addressDetail;
    private final Integer status;
    private final Integer isBlock;
    private final Integer warn;
    private final String joinReason;
    private final String agencyName;
    private final String regDate;

    public UserDto(String userId, String loginId, String userType, String email, String phoneNumber,
                   String userName, String nickName, String gender, String address, String addressDetail,
                   Integer status, Integer isBlock, Integer warn, String joinReason, String agencyName,
                   String regDate) {
        this.userId = userId;
        this.loginId = loginId;
        this.userType = userType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.nickName = nickName;
        this.gender = gender;
        this.address = address;
        this.addressDetail = addressDetail;
        this.status = status;
        this.isBlock = isBlock;
        this.warn = warn;
        this.joinReason = joinReason;
        this.agencyName = agencyName;
        this.regDate = regDate;
    }



}
