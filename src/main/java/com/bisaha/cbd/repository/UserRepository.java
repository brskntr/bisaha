package com.bisaha.cbd.repository;

import com.bisaha.cbd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByPhoneNumber(String phoneNumber);
    Optional<User> findByEmail(String email);
}
