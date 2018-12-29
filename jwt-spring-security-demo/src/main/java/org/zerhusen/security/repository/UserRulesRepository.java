package org.zerhusen.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.rules.UserRule;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRulesRepository extends JpaRepository<UserRule, Long> {

}
