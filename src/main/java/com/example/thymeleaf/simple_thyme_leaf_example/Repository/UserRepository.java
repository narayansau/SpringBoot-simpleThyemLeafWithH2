package com.example.thymeleaf.simple_thyme_leaf_example.Repository;

import com.example.thymeleaf.simple_thyme_leaf_example.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
