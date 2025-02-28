package com.gasdetectionregisterydata.dockerdemo;

import com.gasdetectionregisterydata.dockerdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
