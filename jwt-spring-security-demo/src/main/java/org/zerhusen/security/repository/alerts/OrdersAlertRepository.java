package org.zerhusen.security.repository.alerts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.alerts.OrdgcsOrder;
import org.zerhusen.model.aml.alerts.OrdgcsOrderPK;

/**
 * Created by stephan on 20.03.16.
 */
public interface OrdersAlertRepository extends JpaRepository<OrdgcsOrder, OrdgcsOrderPK> {

}
