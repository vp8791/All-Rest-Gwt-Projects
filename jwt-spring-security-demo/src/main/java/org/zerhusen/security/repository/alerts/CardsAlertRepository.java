package org.zerhusen.security.repository.alerts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.alerts.TxnAlert;
import org.zerhusen.model.aml.alerts.TxnAlertPK;

/**
 * Created by stephan on 20.03.16.
 */
public interface CardsAlertRepository extends JpaRepository<TxnAlert, TxnAlertPK> {

}
