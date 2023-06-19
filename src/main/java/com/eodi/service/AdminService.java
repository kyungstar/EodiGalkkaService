package com.eodi.service;

import com.eodi.dto.UserDto;
import com.eodi.entity.Admin;
import com.eodi.repository.AdminRepository;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    // AGENCY 타입의 사용자를 등록 날짜로 정렬하여 가져오는 메소드입니다.
    public String getAllAgencyUsersOrderedByRegDate() {
        // AGENCY 타입의 사용자를 조회합니다.
        List<Admin> adminList = adminRepository.findByUserType("AGENCY");

        // 등록 날짜를 기준으로 사용자 목록을 정렬합니다.
        Collections.sort(adminList, Comparator.comparing(Admin::getRegDate));

        // Gson 객체를 생성합니다.
        Gson gson = new Gson();

        // 사용자 목록을 JSON 형식으로 변환합니다.
        String json = gson.toJson(adminList);

        // JSON 형식의 사용자 목록을 UserDto 배열로 변환합니다.
        UserDto[] userArray = gson.fromJson(json, UserDto[].class);

        // JsonObject 객체를 생성합니다.
        JsonObject jsonObject = new JsonObject();

        // "userList"라는 키로 UserDto 배열을 JSON 형태로 추가합니다.
        jsonObject.add("userList", gson.toJsonTree(userArray));

        // 최종적으로 JSON 형식의 결과를 문자열로 변환합니다.
        String finalJson = jsonObject.toString();

        // 결과를 반환합니다.
        return finalJson;
    }
}
