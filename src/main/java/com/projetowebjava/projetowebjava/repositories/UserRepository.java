package com.projetowebjava.projetowebjava.repositories;

import com.projetowebjava.projetowebjava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
