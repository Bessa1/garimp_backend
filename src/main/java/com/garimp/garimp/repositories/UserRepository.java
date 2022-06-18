package com.garimp.garimp.repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.garimp.garimp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
