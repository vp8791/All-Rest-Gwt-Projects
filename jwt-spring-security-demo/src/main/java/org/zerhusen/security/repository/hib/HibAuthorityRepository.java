package org.zerhusen.security.repository.hib;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.hib.HibAuthority;
import org.zerhusen.model.aml.hib.HibUser;
import org.zerhusen.model.security.Users;

/**
 * Created by stephan on 20.03.16.
 */
public interface HibAuthorityRepository extends JpaRepository<HibAuthority, Long> {
}
