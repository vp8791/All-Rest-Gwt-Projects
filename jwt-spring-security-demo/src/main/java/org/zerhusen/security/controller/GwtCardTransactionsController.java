package org.zerhusen.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.model.aml.transactions.TxnCardTransaction;
import org.zerhusen.security.repository.CardTransactionsRepository;
import org.zerhusen.security.repository.UserRulesRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="Aml Card Transactions", description="Retuens AML Card Transactions")
@RequestMapping("protectedcardtransactions")
public class GwtCardTransactionsController {

	@Autowired
	private CardTransactionsRepository cardTransactionsRepository;
	
    /**
     * This is an example of some different kinds of granular restriction for endpoints. You can use the built-in SPEL expressions
     * in @PreAuthorize such as 'hasRole()' to determine if a user has access. Remember that the hasRole expression assumes a
     * 'ROLE_' prefix on all role names. So 'ADMIN' here is actually stored as 'ROLE_ADMIN' in database!
     **/
    @RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "List of Card Transactions(TxnCardTransaction table)", response = TxnCardTransaction.class )
    @PreAuthorize("hasRole('ROLE_CARD_TRANSACTIONS')")
    public ResponseEntity<?> getProtectedGreeting() {
    	 return ResponseEntity.ok(cardTransactionsRepository.findAll());
    }

}