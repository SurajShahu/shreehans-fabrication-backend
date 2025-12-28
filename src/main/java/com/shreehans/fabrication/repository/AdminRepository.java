package com.shreehans.fabrication.repository;

import com.shreehans.fabrication.entity.AdminSignup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminSignup,Long> {
    Optional<AdminSignup> findByLoginIdAndPassword(String loginId, String password);
}
