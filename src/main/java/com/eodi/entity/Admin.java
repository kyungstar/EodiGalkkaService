package com.eodi.entity;

import lombok.Getter; // Lombok의 @Getter 어노테이션을 import

import javax.persistence.Column; // JPA의 컬럼 어노테이션을 import
import javax.persistence.Entity; // JPA의 엔티티 어노테이션을 import
import javax.persistence.GeneratedValue; // JPA의 GeneratedValue 어노테이션을 import
import javax.persistence.GenerationType; // JPA의 GenerationType 어노테이션을 import
import javax.persistence.Id; // JPA의 Id 어노테이션을 import
import javax.persistence.Table; // JPA의 테이블 어노테이션을 import
import java.util.Date; // java.util 패키지의 Date 클래스를 import


// 해당 클래스의 필드에 대한 getter 메서드가 자동으로 생성됩니다
@Getter // 이를 통해 필드 값을 외부에서 안전하게 접근할 수 있습니다. 예를 들어, private String name;이라는 필드가 있다면, getName() 메서드가 자동으로 생성되어 외부에서 이름 값을 얻을 수 있습니다.
@Entity // JPA 엔티티 클래스임을 나타내는 어노테이션
@Table(name = "t_node_user") // 해당 엔티티가 매핑되는 테이블의 이름을 지정하는 어노테이션
public class Admin {
    @Id // 해당 멤버 변수가 엔티티의 식별자(primary key)임을 나타내는 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성되는 값의 전략을 지정하는 어노테이션
    @Column(name = "user_id") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String userId; // 사용자 ID

    @Column(name = "login_id") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String loginId; // 로그인 ID

    @Column(name = "user_type") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String userType; // 사용자 유형

    @Column(name = "email") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String email; // 이메일

    @Column(name = "phone_number") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String phoneNumber; // 전화번호

    @Column(name = "user_name") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String userName; // 사용자 이름

    @Column(name = "nickname") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String nickName; // 닉네임

    @Column(name = "gender") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String gender; // 성별

    @Column(name = "address") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String address; // 주소

    @Column(name = "address_detail") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String addressDetail; // 상세 주소

    @Column(name = "status") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private Integer status; // 상태

    @Column(name = "is_block") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private Integer isBlock; // 차단 여부

    @Column(name = "warn") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private Integer warn; // 경고 횟수

    @Column(name = "join_reason") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String joinReason; // 가입 이유

    @Column(name = "agency_name") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String agencyName; // 소속 기관 이름

    @Column(name = "reg_date") // 해당 멤버 변수가 매핑되는 테이블의 컬럼 이름을 지정하는 어노테이션
    private String regDate; // 등록 일자

    public void setStatus(Integer status) {
    }

    public enum UserType {
        AGENCY("AGENCY"),
        USER("USER");

        private final String value;

        UserType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}

