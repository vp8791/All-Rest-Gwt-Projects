package org.zerhusen.security.repository.audit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.audit.JwtAudit;

/**
 * Created by stephan on 20.03.16.
 */
public interface JwtAuditRepository extends JpaRepository<JwtAudit, Long> {

}
