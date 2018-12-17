package com.mf.demo.dao;

import java.util.List;

import com.mf.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QueryUserDao extends JpaRepository<User, String> {

    List<User> findByName(String lastName);

    User  findById(int i);

    @Query(value = "SELECT  *  FROM user WHERE id=:userId", nativeQuery = true)
    User findByUserId(@Param("userId") int userId);
}
