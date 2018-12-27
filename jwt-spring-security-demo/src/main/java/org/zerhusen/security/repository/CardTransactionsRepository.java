package org.zerhusen.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.TxnCardTransaction;
import org.zerhusen.model.aml.UserRule;

/**
 * Created by stephan on 20.03.16.
 */
public interface CardTransactionsRepository extends JpaRepository<TxnCardTransaction, Long> {

}
