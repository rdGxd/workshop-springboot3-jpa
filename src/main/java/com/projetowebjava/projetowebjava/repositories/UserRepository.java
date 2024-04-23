package com.projetowebjava.projetowebjava.repositories;

import com.projetowebjava.projetowebjava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
