package com.project.Paloma.repository;

import com.project.Paloma.entity.LoginCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginRepository extends JpaRepository<LoginCredentials,String> {
    public List<LoginCredentials> findByRemember(String remember);
}
