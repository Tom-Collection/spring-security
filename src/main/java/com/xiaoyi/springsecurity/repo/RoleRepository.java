package com.xiaoyi.springsecurity.repo;

import com.xiaoyi.springsecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Role findByRoleName(String roleName);
}
