package com.synchrony.album.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.synchrony.album.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByEmail(String email);
    
    @Query(value = "SELECT * FROM User t where user_id = :id", nativeQuery = true)
	public User getUser(@Param("id")Long userId);
}
