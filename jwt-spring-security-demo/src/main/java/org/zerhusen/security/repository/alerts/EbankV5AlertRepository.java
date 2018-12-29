package org.zerhusen.security.repository.alerts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.alerts.EbankV5Alert;
import org.zerhusen.model.aml.audit.JwtAudit;

/**
 * Created by stephan on 20.03.16.
 */
public interface EbankV5AlertRepository extends JpaRepository<EbankV5Alert, Long> {

}
