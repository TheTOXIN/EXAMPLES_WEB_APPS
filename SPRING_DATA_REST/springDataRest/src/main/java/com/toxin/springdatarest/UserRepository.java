package com.toxin.springdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
