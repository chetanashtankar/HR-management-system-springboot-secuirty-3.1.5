package com.hms.te.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.te.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

	Optional<Roles> findByRoleName(String string);

}
