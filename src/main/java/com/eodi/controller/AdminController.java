package com.eodi.controller;

import com.eodi.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminController {
    private final AdminService adminService;

    // AdminService 객체를 매개변수로 받는 AdminController 생성자
    // public 키워드: 이 생성자는 public으로 선언되었으므로, 외부에서 접근할 수 있습니다.
    // AdminController 클래스의 생성자이며, 클래스와 동일한 이름을 가지고 있습니다.
    public AdminController(AdminService adminService) {
        // 전달받은 adminService를 adminService 멤버 변수에 할당
        this.adminService = adminService;
    }


    @PostMapping("/user/list")
    public String findAllByOrderByRegDate() {
        // AdminService의 getAllAgencyUsersOrderedByRegDate() 메소드를 호출하여 결과를 반환합니다.
        return adminService.getAllAgencyUsersOrderedByRegDate();
    }
}