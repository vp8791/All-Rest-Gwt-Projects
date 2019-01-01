package org.zerhusen.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.security.Users;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByUsername(String username);
}
