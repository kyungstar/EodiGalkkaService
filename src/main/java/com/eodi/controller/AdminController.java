package com.eodi.controller;

import com.eodi.dto.UserDto;
import com.eodi.entity.Admin;
import com.eodi.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String findAllByOrderByRegDate(@RequestParam String userType) {
        Admin.UserType userTypeData = Admin.UserType.valueOf(userType);
        return adminService.getAllAgencyUsersOrderedByRegDate(userTypeData.getValue());
    }

    @PostMapping("/user/update")
    public ResponseEntity<String> updateUserStatus(@RequestParam("userId") String userId, @RequestParam("status") Integer status) {
        try {
            adminService.updateUserStatus(userId, status);
            return ResponseEntity.ok("사용자 상태가 성공적으로 업데이트되었습니다.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("사용자 상태 업데이트에 실패했습니다.");
        }
    }



    // todo 1. 회원가입 승인, 2. 관리자 회원가입, 3. 관리자 로그인
    /*
    *1. 관리자에서 나라, 도시, 여행글을 제재 및 공지사항을 등록한다. 순서변경도 가능하다. (블랙리스트도 가능하다.)
    2. 관리자가 여행 글을 등록하며, 순서를 정렬한다.
    3. 전체적인 회원을 관리한다.
    4. 전체적인 여행,모집 글을 관리한다.
    * */
}