package com.projetowebjava.projetowebjava.services;

import com.projetowebjava.projetowebjava.entities.Order;
import com.projetowebjava.projetowebjava.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
