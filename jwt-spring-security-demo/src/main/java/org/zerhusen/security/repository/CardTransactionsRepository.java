package org.zerhusen.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.rules.UserRule;
import org.zerhusen.model.aml.transactions.TxnCardTransaction;

/**
 * Created by stephan on 20.03.16.
 */
public interface CardTransactionsRepository extends JpaRepository<TxnCardTransaction, Long> {

}
