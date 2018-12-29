package org.zerhusen.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.model.aml.alerts.DepositEntityScore;
import org.zerhusen.model.aml.alerts.EbankV5Alert;
import org.zerhusen.model.aml.alerts.OrdgcsOrder;
import org.zerhusen.model.aml.alerts.TxnAlert;
import org.zerhusen.security.repository.alerts.CardsAlertRepository;
import org.zerhusen.security.repository.alerts.DepositsAlertRepository;
import org.zerhusen.security.repository.alerts.EbankV5AlertRepository;
import org.zerhusen.security.repository.alerts.OrdersAlertRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="Aml Alerts", description="Aml Alerts of Cards/Ebanking/Deposits and Orders")
@RequestMapping("alerts")
public class GwtAlertsController {
	
	
	@Autowired
	private EbankV5AlertRepository ebankV5AlertRepository;
	
	@Autowired
	private CardsAlertRepository cardAlertRepository;
	
	@Autowired
	private OrdersAlertRepository orderAlertRepository;
	
	@Autowired
	private OrdersAlertRepository ordersAlertRepository;

	@Autowired
	private DepositsAlertRepository depositsAlertRepository;
	
    /**
     * This is an example of some different kinds of granular restriction for endpoints. You can use the built-in SPEL expressions
     * in @PreAuthorize such as 'hasRole()' to determine if a user has access. Remember that the hasRole expression assumes a
     * 'ROLE_' prefix on all role names. So 'ADMIN' here is actually stored as 'ROLE_ADMIN' in database!
     **/
	
	@GetMapping("/protectedebankingalerts")
    @PreAuthorize("hasRole('ROLE_ALERTS')")
	@ApiOperation(value = "List of Aml Ebanking Alerts(EBANK_V5_ALERTS table)", response = List.class )
	public ResponseEntity<?> getEbankingAlerts() {
		List<EbankV5Alert> allEbankingAlerts = ebankV5AlertRepository.findAll();	
    	 return ResponseEntity.ok(allEbankingAlerts);
    }
	
	@ApiOperation(value = "List of Aml Card Alerts(TxnAlert table)", response = List.class )
	@GetMapping("/protectedcardalerts")
    @PreAuthorize("hasRole('ROLE_ALERTS')")
    public ResponseEntity<?> getCardAlerts() {
		List<TxnAlert> allCardAlerts = cardAlertRepository.findAll();		
    	 return ResponseEntity.ok(allCardAlerts);
    }
	
	@ApiOperation(value = "List of Aml Deposit Alerts (DEPOSIT_ENTITY_SCORES table)", response = List.class )
	@GetMapping("/protecteddepositalerts")
    @PreAuthorize("hasRole('ROLE_ALERTS')")
    public ResponseEntity<?> getDepositAlerts() {
		List<DepositEntityScore> findAll = depositsAlertRepository.findAll();
    	 return ResponseEntity.ok(findAll);
    }

	@ApiOperation(value = "List of Aml Order Alerts (ORDGCS_ORDERS table)", response = List.class )
	@GetMapping("/protectedorderalerts")
    @PreAuthorize("hasRole('ROLE_ALERTS')")
    public ResponseEntity<?> getOrderAlerts() {
		List<OrdgcsOrder> orderAlerts = ordersAlertRepository.findAll();
    	 return ResponseEntity.ok(orderAlerts);
    }

	
}