package com.projetowebjava.projetowebjava.repositories;

import com.projetowebjava.projetowebjava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
