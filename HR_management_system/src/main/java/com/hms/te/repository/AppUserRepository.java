package com.hms.te.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.te.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, String> {

	Optional<AppUser> findByUsername(String username);

}
