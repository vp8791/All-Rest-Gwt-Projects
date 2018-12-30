package org.zerhusen.security.repository.configuration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.audit.JwtAudit;
import org.zerhusen.model.aml.configuration.ConfigurationParameter;


/**
 * Created by stephan on 20.03.16.
 */
public interface ConfigurationRepository extends JpaRepository<ConfigurationParameter, Long> {

}
