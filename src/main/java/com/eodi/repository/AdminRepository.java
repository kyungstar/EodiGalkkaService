package com.eodi.repository;

import com.eodi.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    List<Admin> findByUserType(String agency);
    Optional<Admin> findByUserId(String userId);
}


