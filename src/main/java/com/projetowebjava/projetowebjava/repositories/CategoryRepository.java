package com.projetowebjava.projetowebjava.repositories;

import com.projetowebjava.projetowebjava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
