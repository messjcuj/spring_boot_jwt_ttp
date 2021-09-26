package com.example.spring_boot_jwt_ttp.Repository;

import com.example.spring_boot_jwt_ttp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
