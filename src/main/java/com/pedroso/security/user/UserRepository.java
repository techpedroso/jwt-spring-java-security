package com.pedroso.security.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

//communicates with the database
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
