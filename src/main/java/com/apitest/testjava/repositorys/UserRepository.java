package com.apitest.testjava.repositorys;

import com.apitest.testjava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
