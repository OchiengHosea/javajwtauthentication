package com.duke.auths.authentication_test.repositories;

import com.duke.auths.authentication_test.models.ERole;
import com.duke.auths.authentication_test.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
