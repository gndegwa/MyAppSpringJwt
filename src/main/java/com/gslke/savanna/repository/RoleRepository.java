package com.gslke.savanna.repository;

import java.util.Optional;

import com.gslke.savanna.models.ERole;
import com.gslke.savanna.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
