package org.zerhusen.security.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.model.aml.alerts.DepositEntityScore;
import org.zerhusen.model.aml.alerts.EbankV5Alert;
import org.zerhusen.model.aml.alerts.OrdgcsOrder;
import org.zerhusen.model.aml.alerts.TxnAlert;
import org.zerhusen.model.aml.transactions.TxnCardTransaction;
import org.zerhusen.security.repository.CardTransactionsRepository;
import org.zerhusen.security.repository.UserRulesRepository;
import org.zerhusen.security.repository.alerts.CardsAlertRepository;
import org.zerhusen.security.repository.alerts.DepositsAlertRepository;
import org.zerhusen.security.repository.alerts.EbankV5AlertRepository;
import org.zerhusen.security.repository.alerts.OrdersAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.model.aml.configuration.ConfigurationParameter;
import org.zerhusen.model.aml.grid.GridProperty;
import org.zerhusen.model.aml.hib.HibAuthority;
import org.zerhusen.model.aml.hib.HibUser;
import org.zerhusen.model.aml.hib.HibUserAuthority;
import org.zerhusen.model.aml.rules.UserRule;
import org.zerhusen.model.aml.transactions.TxnCardTransaction;
import org.zerhusen.security.repository.configuration.ConfigurationRepository;
import org.zerhusen.security.repository.grid.GridRepository;
import org.zerhusen.security.repository.hib.HibAuthorityRepository;
import org.zerhusen.security.repository.hib.HibUserAuthorityRepository;
import org.zerhusen.security.repository.hib.HibUsersRepository;
import org.zerhusen.security.repository.hib.dto.HibAuthorityDto;
import org.zerhusen.security.repository.hib.dto.HibUsersDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "All Resources", description = "All Resources")
public class AllResourcesController {

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

	@Autowired
	private CardTransactionsRepository cardTransactionsRepository;

	@Autowired
	private ConfigurationRepository configurationRepository;

	@Autowired
	private GridRepository gridRepository;

	@Autowired
	private UserRulesRepository userRulesRepository;
	
	@Autowired
	private HibUsersRepository hibuserRepository;

	@Autowired
	private HibAuthorityRepository hibAuthorityRepository;

	@Autowired
	private HibUserAuthorityRepository hibUserAuthorityRepository;

	
	/**
	 * This is an example of some different kinds of granular restriction for
	 * endpoints. You can use the built-in SPEL expressions in @PreAuthorize such as
	 * 'hasRole()' to determine if a user has access. Remember that the hasRole
	 * expression assumes a 'ROLE_' prefix on all role names. So 'ADMIN' here is
	 * actually stored as 'ROLE_ADMIN' in database!
	 **/

	@GetMapping("/alerts/protectedebankingalerts")
	@PreAuthorize("hasRole('ROLE_ALERTS')")
	@ApiOperation(value = "List of Aml Ebanking Alerts(EBANK_V5_ALERTS table)", response = List.class)
	public ResponseEntity<?> getEbankingAlerts() {
		List<EbankV5Alert> allEbankingAlerts = ebankV5AlertRepository.findAll();
		return ResponseEntity.ok(allEbankingAlerts);
	}

	@ApiOperation(value = "List of Aml Card Alerts(TxnAlert table)", response = List.class)
	@GetMapping("/alerts/protectedcardalerts")
	@PreAuthorize("hasRole('ROLE_ALERTS')")
	public ResponseEntity<?> getCardAlerts() {
		List<TxnAlert> allCardAlerts = cardAlertRepository.findAll();
		return ResponseEntity.ok(allCardAlerts);
	}

	@ApiOperation(value = "List of Aml Deposit Alerts (DEPOSIT_ENTITY_SCORES table)", response = List.class)
	@GetMapping("/alerts/protecteddepositalerts")
	@PreAuthorize("hasRole('ROLE_ALERTS')")
	public ResponseEntity<?> getDepositAlerts() {
		List<DepositEntityScore> findAll = depositsAlertRepository.findAll();
		return ResponseEntity.ok(findAll);
	}

	@ApiOperation(value = "List of Aml Order Alerts (ORDGCS_ORDERS table)", response = List.class)
	@GetMapping("/alerts/protectedorderalerts")
	@PreAuthorize("hasRole('ROLE_ALERTS')")
	public ResponseEntity<?> getOrderAlerts() {
		List<OrdgcsOrder> orderAlerts = ordersAlertRepository.findAll();
		return ResponseEntity.ok(orderAlerts);
	}

	@ApiOperation(value = "List of Card Transactions(TxnCardTransaction table)", response = TxnCardTransaction.class)
	@GetMapping("/protectedcardtransactions")
	@PreAuthorize("hasRole('ROLE_CARD_TRANSACTIONS')")
	public ResponseEntity<?> getCardGreeting() {
		return ResponseEntity.ok(cardTransactionsRepository.findAll());
	}

	@ApiOperation(value = "Aml configuration settings (ConfigurationParameter table)", response = String.class)
	@GetMapping("/protectedconfiguration")
	@PreAuthorize("hasRole('ROLE_CONFIGURATION')")
	public ResponseEntity<?> getConfigurationGreeting() {
		List<ConfigurationParameter> allConfigs = configurationRepository.findAll();
		return ResponseEntity.ok(allConfigs);
	}

	@GetMapping("/protectedgrid")
	@ApiOperation(value = "Aml Grid settings (GridProperty table)", response = String.class)
	@PreAuthorize("hasRole('ROLE_GRID')")
	public ResponseEntity<?> getGridSettings() {
		List<GridProperty> findAll = gridRepository.findAll();
		return ResponseEntity.ok(findAll);
	}
	
	@GetMapping("/protectedrules")
    @ApiOperation(value = "Aml User Rules List(USER_RULE table)", response = String.class )
    @PreAuthorize("hasRole('ROLE_RULES')")
    public ResponseEntity<?> getRules() {
    	List<UserRule> allUserRules = userRulesRepository.findAll();
    	 return ResponseEntity.ok(allUserRules);
    	
    }
	
	@GetMapping("/protectedusers")
	  @ApiOperation(value = "Aml User Rules List(USERS/AUTHORITY/USER_AUTHORITY tables)", response = String.class )
	@PreAuthorize("hasRole('ROLE_USERS')")
	public ResponseEntity<?> getUsers() {
		List<HibUser> allHibUsers = hibuserRepository.findAll();
		List<HibAuthority> allHibAuthorities = hibAuthorityRepository.findAll();
		List<HibUserAuthority> allHibUserAuthorities = hibUserAuthorityRepository.findAll();

		List<HibUsersDto> hibUsersDto = new ArrayList<HibUsersDto>();

		for (HibUser hibUser : allHibUsers) {
			HibUsersDto hibUserDto = new HibUsersDto();
			hibUserDto.setId(hibUser.getId());
			hibUserDto.setEmail(hibUser.getEmail());
			hibUserDto.setEnabled(hibUser.getEnabled());
			hibUserDto.setFirstname(hibUser.getFirstname());
			hibUserDto.setLastname(hibUser.getLastname());
			hibUserDto.setLastpasswordresetdate(hibUser.getLastpasswordresetdate());
			hibUserDto.setUsername(hibUser.getUsername());

			// Get All Authorities pf the User
			List<HibUserAuthority> allUserAuthorities = allHibUserAuthorities.stream()
					.filter(auth -> Long.compare(auth.getId().getUserId(), hibUser.getId()) == 0)
					.collect(Collectors.toList());
			List<HibAuthorityDto> hibAuthoritiesDto = new ArrayList<HibAuthorityDto>();

			// Find the relevant roles in allHibAuthorities
			for (HibUserAuthority hibAuthority : allUserAuthorities) {
				Long authorityId = hibAuthority.getId().getAuthorityId();
				List<HibAuthority> hibAuthorities = allHibAuthorities.stream()
						.filter(allAuths -> Long.compare(allAuths.getId(), hibAuthority.getId().getAuthorityId()) == 0)
						.collect(Collectors.toList());

				for (HibAuthority hibAuth : hibAuthorities) {
					HibAuthorityDto hibAuthDto = new HibAuthorityDto();
					hibAuthDto.setId(hibAuth.getId());
					hibAuthDto.setName(hibAuth.getName());
					hibAuthoritiesDto.add(hibAuthDto);
				}

				hibUserDto.setHibAuthorities(hibAuthoritiesDto);
			}
			hibUsersDto.add(hibUserDto);
		}

		return ResponseEntity.ok(hibUsersDto);
	}


}
