package com.ecommerce.E_Commerce.repositories;

import com.ecommerce.E_Commerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
