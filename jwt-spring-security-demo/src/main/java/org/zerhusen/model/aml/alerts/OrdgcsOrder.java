package org.zerhusen.model.aml.alerts;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDGCS_ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDGCS_ORDERS")
@NamedQuery(name="OrdgcsOrder.findAll", query="SELECT o FROM OrdgcsOrder o")
public class OrdgcsOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrdgcsOrderPK id;

	@Column(name="ACQ_AUTH_RESULT")
	private String acqAuthResult;

	@Column(name="ACQ_ID")
	private String acqId;

	@Column(name="AIRLINE_AGENT_NUMBER_CODE")
	private BigDecimal airlineAgentNumberCode;

	@Column(name="AIRLINE_CLASS")
	private String airlineClass;

	@Column(name="AIRLINE_CUSTOMER_ID")
	private String airlineCustomerId;

	@Column(name="AIRLINE_ETICKET_INDICATOR")
	private String airlineEticketIndicator;

	@Temporal(TemporalType.DATE)
	@Column(name="AIRLINE_FLIGHT_DATE")
	private Date airlineFlightDate;

	@Column(name="AIRLINE_ID")
	private BigDecimal airlineId;

	@Column(name="AIRLINE_INVOICE_NUMBER")
	private BigDecimal airlineInvoiceNumber;

	@Column(name="AIRLINE_IS_REGISTERED_CUSTOMER")
	private String airlineIsRegisteredCustomer;

	@Column(name="AIRLINE_IS_THIRD_PARTY")
	private String airlineIsThirdParty;

	@Temporal(TemporalType.DATE)
	@Column(name="AIRLINE_ISSUE_DATE")
	private Date airlineIssueDate;

	@Column(name="AIRLINE_NAME")
	private String airlineName;

	@Column(name="AIRLINE_PASSENGER_NAME")
	private String airlinePassengerName;

	@Column(name="AIRLINE_PLACE_OF_ISSUE")
	private String airlinePlaceOfIssue;

	@Column(name="AIRLINE_PNR")
	private String airlinePnr;

	@Column(name="AIRLINE_POS")
	private String airlinePos;

	@Column(name="AIRLINE_POS_TOWN_ID")
	private String airlinePosTownId;

	@Column(name="AIRLINE_RESTRICTED_TICKET")
	private String airlineRestrictedTicket;

	@Column(name="AIRLINE_TICKET_DELIVERY_METHOD")
	private String airlineTicketDeliveryMethod;

	@Column(name="ATTEMPT_ID")
	private BigDecimal attemptId;

	@Column(name="AUTHENTICATION_ID")
	private BigDecimal authenticationId;

	@Column(name="AVS_PERFORMED")
	private String avsPerformed;

	@Column(name="AVS_RESULT")
	private String avsResult;

	@Column(name="BLOCK_CODE")
	private String blockCode;

	@Column(name="CHARGEBACK_CASE_ID")
	private String chargebackCaseId;

	@Column(name="CHARGEBACK_CURRENCY_CODE")
	private String chargebackCurrencyCode;

	@Column(name="CHARGEBACK_MID")
	private String chargebackMid;

	@Column(name="CHARGEBACK_NUMBER")
	private String chargebackNumber;

	@Column(name="CVV_PERFORMED")
	private String cvvPerformed;

	@Column(name="CVV_RESULT_CODE")
	private String cvvResultCode;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_PAYMENT_REFUND")
	private Date datePaymentRefund;

	@Column(name="DEDUCTION_REASON_DESCRIPTION")
	private String deductionReasonDescription;

	@Column(name="DEDUCTION_REASON_ID")
	private String deductionReasonId;

	@Column(name="DUE_AMOUNT")
	private BigDecimal dueAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="DUE_DATE")
	private Date dueDate;

	@Column(name="EB_GFTCOMMENTS")
	private String ebGftcomments;

	@Column(name="EB_GFTMSG")
	private String ebGftmsg;

	@Column(name="EB_GFTTP")
	private String ebGfttp;

	@Column(name="EB_WEBSITE")
	private String ebWebsite;

	@Column(name="EBT_PASSWORD")
	private String ebtPassword;

	@Column(name="EBT_PREVIOUS_CUST")
	private String ebtPreviousCust;

	private String eci;

	@Column(name="EFFORT_ID")
	private BigDecimal effortId;

	@Column(name="EXT_IS_BILLABLE")
	private String extIsBillable;

	@Column(name="EXT_IS_REAL_TIME")
	private String extIsRealTime;

	@Column(name="EXT_MESSAGE_ACTION")
	private String extMessageAction;

	@Column(name="EXT_RISK_INDICATOR")
	private String extRiskIndicator;

	@Column(name="HEADER_CORRELATION_ID")
	private String headerCorrelationId;

	@Column(name="HEADER_CREATE_DATE")
	private Timestamp headerCreateDate;

	@Column(name="HEADER_MSG_ID")
	private String headerMsgId;

	@Column(name="HEADER_RECEIVER_SERVICE")
	private String headerReceiverService;

	@Column(name="HEADER_SENDER_SERVICE")
	private String headerSenderService;

	@Column(name="HEADER_SENT_DATE")
	private Timestamp headerSentDate;

	@Column(name="IOVATION_BLACK_BOX")
	private String iovationBlackBox;

	@Column(name="LOAD_DATE")
	private Timestamp loadDate;

	@Column(name="MER_CODE")
	private String merCode;

	@Column(name="MERC_PARAM_1")
	private String mercParam1;

	@Column(name="MERC_PARAM_2")
	private String mercParam2;

	@Column(name="MERC_PARAM_3")
	private String mercParam3;

	@Column(name="MERCHANT_EXT_ID")
	private String merchantExtId;

	@Column(name="ORDER_AMOUNT")
	private BigDecimal orderAmount;

	@Column(name="ORDER_AMOUNT_SIGN")
	private String orderAmountSign;

	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_BIRTH_DATE")
	private Date orderBirthDate;

	@Column(name="ORDER_COMPANY_DATA")
	private String orderCompanyData;

	@Column(name="ORDER_COMPANY_NAME")
	private String orderCompanyName;

	@Column(name="ORDER_CONSUMER_IP")
	private String orderConsumerIp;

	@Column(name="ORDER_COUNTRY_CODE")
	private String orderCountryCode;

	@Column(name="ORDER_COUNTRY_ID")
	private String orderCountryId;

	@Column(name="ORDER_COUNTRY_SUB_DIV")
	private String orderCountrySubDiv;

	@Column(name="ORDER_CURRENCY_CODE")
	private String orderCurrencyCode;

	@Column(name="ORDER_CUSTOMER_ID")
	private String orderCustomerId;

	@Column(name="ORDER_DESCRIPTOR")
	private String orderDescriptor;

	@Column(name="ORDER_EMAIL_ID")
	private String orderEmailId;

	@Column(name="ORDER_FIRSTNAME")
	private String orderFirstname;

	@Column(name="ORDER_HOUSE_NUMBER")
	private String orderHouseNumber;

	@Column(name="ORDER_ID")
	private String orderId;

	@Column(name="ORDER_IP_CONSUMER")
	private String orderIpConsumer;

	@Column(name="ORDER_LANGUAGE_CODE")
	private String orderLanguageCode;

	@Column(name="ORDER_MANDATE")
	private String orderMandate;

	@Column(name="ORDER_MERCHANT_REFERENCE")
	private String orderMerchantReference;

	@Column(name="ORDER_PHONE_NO")
	private String orderPhoneNo;

	@Column(name="ORDER_POST_CODE")
	private String orderPostCode;

	@Column(name="ORDER_PREFIX_SURNAME")
	private String orderPrefixSurname;

	@Column(name="ORDER_RESELLER_ID")
	private String orderResellerId;

	@Column(name="ORDER_STREET")
	private String orderStreet;

	@Column(name="ORDER_SURNAME")
	private String orderSurname;

	@Column(name="ORDER_TITLE")
	private String orderTitle;

	@Column(name="ORDER_TOWN")
	private String orderTown;

	@Column(name="ORDER_TYPE")
	private String orderType;

	@Column(name="ORDER_VAT")
	private String orderVat;

	@Column(name="OVERRIDE_STATUS")
	private String overrideStatus;

	@Column(name="OVERRIDEN_BY")
	private String overridenBy;

	@Column(name="PAYMENT_ACC_NUM")
	private String paymentAccNum;

	@Column(name="PAYMENT_ACCOUNT_HOLDER_NAME")
	private String paymentAccountHolderName;

	@Column(name="PAYMENT_AMOUNT")
	private BigDecimal paymentAmount;

	@Column(name="PAYMENT_AMOUNT_SIGN")
	private String paymentAmountSign;

	@Column(name="PAYMENT_BANK_CHK_DIGIT")
	private String paymentBankChkDigit;

	@Column(name="PAYMENT_BANK_CODE")
	private String paymentBankCode;

	@Temporal(TemporalType.DATE)
	@Column(name="PAYMENT_BIRTH_DATE")
	private Date paymentBirthDate;

	@Column(name="PAYMENT_BRANCH_CODE")
	private String paymentBranchCode;

	@Column(name="PAYMENT_COMPANY_DATA")
	private String paymentCompanyData;

	@Column(name="PAYMENT_COMPANY_NAME")
	private String paymentCompanyName;

	@Column(name="PAYMENT_CONSUMER_IP")
	private String paymentConsumerIp;

	@Column(name="PAYMENT_COUNTRY_CODE")
	private String paymentCountryCode;

	@Column(name="PAYMENT_COUNTRY_ID")
	private String paymentCountryId;

	@Column(name="PAYMENT_COUNTRY_SUB_DIV")
	private String paymentCountrySubDiv;

	@Column(name="PAYMENT_CREDIT_CARD_NUMBER")
	private String paymentCreditCardNumber;

	@Column(name="PAYMENT_CURRENCY_CODE")
	private String paymentCurrencyCode;

	@Column(name="PAYMENT_CUSTOMER_ID")
	private String paymentCustomerId;

	@Column(name="PAYMENT_EMAIL")
	private String paymentEmail;

	@Column(name="PAYMENT_EXPIRY_DATE")
	private BigDecimal paymentExpiryDate;

	@Column(name="PAYMENT_FIRSTNAME")
	private String paymentFirstname;

	@Column(name="PAYMENT_HOUSE_NUMBER")
	private String paymentHouseNumber;

	@Column(name="PAYMENT_IBAN")
	private String paymentIban;

	@Column(name="PAYMENT_IP_ADDRESS")
	private String paymentIpAddress;

	@Column(name="PAYMENT_ISSUE_NUMBER")
	private String paymentIssueNumber;

	@Column(name="PAYMENT_LANGUAGE_CODE")
	private String paymentLanguageCode;

	@Column(name="PAYMENT_PHONE_NO")
	private String paymentPhoneNo;

	@Column(name="PAYMENT_POST_CODE")
	private String paymentPostCode;

	@Column(name="PAYMENT_PREFIX_SURNAME")
	private String paymentPrefixSurname;

	@Column(name="PAYMENT_PRODUCT_ID")
	private String paymentProductId;

	@Column(name="PAYMENT_STREET_NAME")
	private String paymentStreetName;

	@Column(name="PAYMENT_SURNAME")
	private String paymentSurname;

	@Column(name="PAYMENT_TITLE")
	private String paymentTitle;

	@Column(name="PAYMENT_TOWN")
	private String paymentTown;

	@Column(name="PAYMENT_TRANSACTION_TYPE")
	private String paymentTransactionType;

	@Column(name="PAYMENT_VAT")
	private String paymentVat;

	@Temporal(TemporalType.DATE)
	@Column(name="PAYOUT_DATE")
	private Date payoutDate;

	@Column(name="PAYOUT_TEXT")
	private String payoutText;

	@Column(name="PROC_API_NAME")
	private String procApiName;

	@Column(name="PROC_API_VERSION")
	private String procApiVersion;

	@Column(name="PROC_INITG_SERV")
	private String procInitgServ;

	@Column(name="PROC_TXN_CORR_ID")
	private String procTxnCorrId;

	@Column(name="PROC_WEB_NAME")
	private String procWebName;

	@Column(name="RECORD_CATEGORY")
	private String recordCategory;

	@Column(name="RECORD_TYPE")
	private String recordType;

	@Column(name="REF_ORIG_PAYMENT")
	private String refOrigPayment;

	@Column(name="RELATED_INTERNAL_ID")
	private BigDecimal relatedInternalId;

	@Column(name="RESPONSE_CODE")
	private String responseCode;

	@Column(name="RESPONSE_MESSAGE")
	private String responseMessage;

	@Column(name="RESPONSE_SOURCE")
	private String responseSource;

	@Column(name="RESPONSE_STATUS")
	private BigDecimal responseStatus;

	@Column(name="RETRY_COUNT")
	private BigDecimal retryCount;

	@Column(name="SCORE_CODE")
	private String scoreCode;

	@Temporal(TemporalType.DATE)
	@Column(name="SHIP_BIRTH_DATE")
	private Date shipBirthDate;

	@Column(name="SHIP_COMPANY_DATA")
	private String shipCompanyData;

	@Column(name="SHIP_COMPANY_NAME")
	private String shipCompanyName;

	@Column(name="SHIP_CONSUMER_IP")
	private String shipConsumerIp;

	@Column(name="SHIP_COUNTRY_ID")
	private String shipCountryId;

	@Column(name="SHIP_COUNTRY_SUB_DIV")
	private String shipCountrySubDiv;

	@Column(name="SHIP_CUSTOMER_ID")
	private String shipCustomerId;

	@Column(name="SHIP_EMAIL_ID")
	private String shipEmailId;

	@Column(name="SHIP_FIRSTNAME")
	private String shipFirstname;

	@Column(name="SHIP_HOUSE_NUMBER")
	private String shipHouseNumber;

	@Column(name="SHIP_PHONE_NUMBER")
	private String shipPhoneNumber;

	@Column(name="SHIP_POST_CODE")
	private String shipPostCode;

	@Column(name="SHIP_PREFIXSURNAME")
	private String shipPrefixsurname;

	@Column(name="SHIP_STREET")
	private String shipStreet;

	@Column(name="SHIP_SURNAME")
	private String shipSurname;

	@Column(name="SHIP_TITLE")
	private String shipTitle;

	@Column(name="SHIP_TOWN")
	private String shipTown;

	@Column(name="SHIP_VAT")
	private String shipVat;

	@Column(name="THREEDSECURE_PERFORMED")
	private String threedsecurePerformed;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;

	@Column(name="TXN_DATE_TIME")
	private Timestamp txnDateTime;

	@Column(name="TXN_TOT_SCORE")
	private BigDecimal txnTotScore;

	private String ucaf;

	private String udf1;

	private String udf10;

	private String udf11;

	private String udf12;

	private String udf13;

	private String udf14;

	private String udf15;

	private String udf16;

	private String udf17;

	private String udf18;

	private String udf19;

	private String udf2;

	private String udf20;

	private String udf21;

	private String udf22;

	private String udf23;

	private String udf24;

	private String udf25;

	private String udf3;

	private String udf4;

	private String udf5;

	private String udf6;

	private String udf7;

	private String udf8;

	private String udf9;

	public OrdgcsOrder() {
	}

	public OrdgcsOrderPK getId() {
		return this.id;
	}

	public void setId(OrdgcsOrderPK id) {
		this.id = id;
	}

	public String getAcqAuthResult() {
		return this.acqAuthResult;
	}

	public void setAcqAuthResult(String acqAuthResult) {
		this.acqAuthResult = acqAuthResult;
	}

	public String getAcqId() {
		return this.acqId;
	}

	public void setAcqId(String acqId) {
		this.acqId = acqId;
	}

	public BigDecimal getAirlineAgentNumberCode() {
		return this.airlineAgentNumberCode;
	}

	public void setAirlineAgentNumberCode(BigDecimal airlineAgentNumberCode) {
		this.airlineAgentNumberCode = airlineAgentNumberCode;
	}

	public String getAirlineClass() {
		return this.airlineClass;
	}

	public void setAirlineClass(String airlineClass) {
		this.airlineClass = airlineClass;
	}

	public String getAirlineCustomerId() {
		return this.airlineCustomerId;
	}

	public void setAirlineCustomerId(String airlineCustomerId) {
		this.airlineCustomerId = airlineCustomerId;
	}

	public String getAirlineEticketIndicator() {
		return this.airlineEticketIndicator;
	}

	public void setAirlineEticketIndicator(String airlineEticketIndicator) {
		this.airlineEticketIndicator = airlineEticketIndicator;
	}

	public Date getAirlineFlightDate() {
		return this.airlineFlightDate;
	}

	public void setAirlineFlightDate(Date airlineFlightDate) {
		this.airlineFlightDate = airlineFlightDate;
	}

	public BigDecimal getAirlineId() {
		return this.airlineId;
	}

	public void setAirlineId(BigDecimal airlineId) {
		this.airlineId = airlineId;
	}

	public BigDecimal getAirlineInvoiceNumber() {
		return this.airlineInvoiceNumber;
	}

	public void setAirlineInvoiceNumber(BigDecimal airlineInvoiceNumber) {
		this.airlineInvoiceNumber = airlineInvoiceNumber;
	}

	public String getAirlineIsRegisteredCustomer() {
		return this.airlineIsRegisteredCustomer;
	}

	public void setAirlineIsRegisteredCustomer(String airlineIsRegisteredCustomer) {
		this.airlineIsRegisteredCustomer = airlineIsRegisteredCustomer;
	}

	public String getAirlineIsThirdParty() {
		return this.airlineIsThirdParty;
	}

	public void setAirlineIsThirdParty(String airlineIsThirdParty) {
		this.airlineIsThirdParty = airlineIsThirdParty;
	}

	public Date getAirlineIssueDate() {
		return this.airlineIssueDate;
	}

	public void setAirlineIssueDate(Date airlineIssueDate) {
		this.airlineIssueDate = airlineIssueDate;
	}

	public String getAirlineName() {
		return this.airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlinePassengerName() {
		return this.airlinePassengerName;
	}

	public void setAirlinePassengerName(String airlinePassengerName) {
		this.airlinePassengerName = airlinePassengerName;
	}

	public String getAirlinePlaceOfIssue() {
		return this.airlinePlaceOfIssue;
	}

	public void setAirlinePlaceOfIssue(String airlinePlaceOfIssue) {
		this.airlinePlaceOfIssue = airlinePlaceOfIssue;
	}

	public String getAirlinePnr() {
		return this.airlinePnr;
	}

	public void setAirlinePnr(String airlinePnr) {
		this.airlinePnr = airlinePnr;
	}

	public String getAirlinePos() {
		return this.airlinePos;
	}

	public void setAirlinePos(String airlinePos) {
		this.airlinePos = airlinePos;
	}

	public String getAirlinePosTownId() {
		return this.airlinePosTownId;
	}

	public void setAirlinePosTownId(String airlinePosTownId) {
		this.airlinePosTownId = airlinePosTownId;
	}

	public String getAirlineRestrictedTicket() {
		return this.airlineRestrictedTicket;
	}

	public void setAirlineRestrictedTicket(String airlineRestrictedTicket) {
		this.airlineRestrictedTicket = airlineRestrictedTicket;
	}

	public String getAirlineTicketDeliveryMethod() {
		return this.airlineTicketDeliveryMethod;
	}

	public void setAirlineTicketDeliveryMethod(String airlineTicketDeliveryMethod) {
		this.airlineTicketDeliveryMethod = airlineTicketDeliveryMethod;
	}

	public BigDecimal getAttemptId() {
		return this.attemptId;
	}

	public void setAttemptId(BigDecimal attemptId) {
		this.attemptId = attemptId;
	}

	public BigDecimal getAuthenticationId() {
		return this.authenticationId;
	}

	public void setAuthenticationId(BigDecimal authenticationId) {
		this.authenticationId = authenticationId;
	}

	public String getAvsPerformed() {
		return this.avsPerformed;
	}

	public void setAvsPerformed(String avsPerformed) {
		this.avsPerformed = avsPerformed;
	}

	public String getAvsResult() {
		return this.avsResult;
	}

	public void setAvsResult(String avsResult) {
		this.avsResult = avsResult;
	}

	public String getBlockCode() {
		return this.blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getChargebackCaseId() {
		return this.chargebackCaseId;
	}

	public void setChargebackCaseId(String chargebackCaseId) {
		this.chargebackCaseId = chargebackCaseId;
	}

	public String getChargebackCurrencyCode() {
		return this.chargebackCurrencyCode;
	}

	public void setChargebackCurrencyCode(String chargebackCurrencyCode) {
		this.chargebackCurrencyCode = chargebackCurrencyCode;
	}

	public String getChargebackMid() {
		return this.chargebackMid;
	}

	public void setChargebackMid(String chargebackMid) {
		this.chargebackMid = chargebackMid;
	}

	public String getChargebackNumber() {
		return this.chargebackNumber;
	}

	public void setChargebackNumber(String chargebackNumber) {
		this.chargebackNumber = chargebackNumber;
	}

	public String getCvvPerformed() {
		return this.cvvPerformed;
	}

	public void setCvvPerformed(String cvvPerformed) {
		this.cvvPerformed = cvvPerformed;
	}

	public String getCvvResultCode() {
		return this.cvvResultCode;
	}

	public void setCvvResultCode(String cvvResultCode) {
		this.cvvResultCode = cvvResultCode;
	}

	public Date getDatePaymentRefund() {
		return this.datePaymentRefund;
	}

	public void setDatePaymentRefund(Date datePaymentRefund) {
		this.datePaymentRefund = datePaymentRefund;
	}

	public String getDeductionReasonDescription() {
		return this.deductionReasonDescription;
	}

	public void setDeductionReasonDescription(String deductionReasonDescription) {
		this.deductionReasonDescription = deductionReasonDescription;
	}

	public String getDeductionReasonId() {
		return this.deductionReasonId;
	}

	public void setDeductionReasonId(String deductionReasonId) {
		this.deductionReasonId = deductionReasonId;
	}

	public BigDecimal getDueAmount() {
		return this.dueAmount;
	}

	public void setDueAmount(BigDecimal dueAmount) {
		this.dueAmount = dueAmount;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getEbGftcomments() {
		return this.ebGftcomments;
	}

	public void setEbGftcomments(String ebGftcomments) {
		this.ebGftcomments = ebGftcomments;
	}

	public String getEbGftmsg() {
		return this.ebGftmsg;
	}

	public void setEbGftmsg(String ebGftmsg) {
		this.ebGftmsg = ebGftmsg;
	}

	public String getEbGfttp() {
		return this.ebGfttp;
	}

	public void setEbGfttp(String ebGfttp) {
		this.ebGfttp = ebGfttp;
	}

	public String getEbWebsite() {
		return this.ebWebsite;
	}

	public void setEbWebsite(String ebWebsite) {
		this.ebWebsite = ebWebsite;
	}

	public String getEbtPassword() {
		return this.ebtPassword;
	}

	public void setEbtPassword(String ebtPassword) {
		this.ebtPassword = ebtPassword;
	}

	public String getEbtPreviousCust() {
		return this.ebtPreviousCust;
	}

	public void setEbtPreviousCust(String ebtPreviousCust) {
		this.ebtPreviousCust = ebtPreviousCust;
	}

	public String getEci() {
		return this.eci;
	}

	public void setEci(String eci) {
		this.eci = eci;
	}

	public BigDecimal getEffortId() {
		return this.effortId;
	}

	public void setEffortId(BigDecimal effortId) {
		this.effortId = effortId;
	}

	public String getExtIsBillable() {
		return this.extIsBillable;
	}

	public void setExtIsBillable(String extIsBillable) {
		this.extIsBillable = extIsBillable;
	}

	public String getExtIsRealTime() {
		return this.extIsRealTime;
	}

	public void setExtIsRealTime(String extIsRealTime) {
		this.extIsRealTime = extIsRealTime;
	}

	public String getExtMessageAction() {
		return this.extMessageAction;
	}

	public void setExtMessageAction(String extMessageAction) {
		this.extMessageAction = extMessageAction;
	}

	public String getExtRiskIndicator() {
		return this.extRiskIndicator;
	}

	public void setExtRiskIndicator(String extRiskIndicator) {
		this.extRiskIndicator = extRiskIndicator;
	}

	public String getHeaderCorrelationId() {
		return this.headerCorrelationId;
	}

	public void setHeaderCorrelationId(String headerCorrelationId) {
		this.headerCorrelationId = headerCorrelationId;
	}

	public Timestamp getHeaderCreateDate() {
		return this.headerCreateDate;
	}

	public void setHeaderCreateDate(Timestamp headerCreateDate) {
		this.headerCreateDate = headerCreateDate;
	}

	public String getHeaderMsgId() {
		return this.headerMsgId;
	}

	public void setHeaderMsgId(String headerMsgId) {
		this.headerMsgId = headerMsgId;
	}

	public String getHeaderReceiverService() {
		return this.headerReceiverService;
	}

	public void setHeaderReceiverService(String headerReceiverService) {
		this.headerReceiverService = headerReceiverService;
	}

	public String getHeaderSenderService() {
		return this.headerSenderService;
	}

	public void setHeaderSenderService(String headerSenderService) {
		this.headerSenderService = headerSenderService;
	}

	public Timestamp getHeaderSentDate() {
		return this.headerSentDate;
	}

	public void setHeaderSentDate(Timestamp headerSentDate) {
		this.headerSentDate = headerSentDate;
	}

	public String getIovationBlackBox() {
		return this.iovationBlackBox;
	}

	public void setIovationBlackBox(String iovationBlackBox) {
		this.iovationBlackBox = iovationBlackBox;
	}

	public Timestamp getLoadDate() {
		return this.loadDate;
	}

	public void setLoadDate(Timestamp loadDate) {
		this.loadDate = loadDate;
	}

	public String getMerCode() {
		return this.merCode;
	}

	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}

	public String getMercParam1() {
		return this.mercParam1;
	}

	public void setMercParam1(String mercParam1) {
		this.mercParam1 = mercParam1;
	}

	public String getMercParam2() {
		return this.mercParam2;
	}

	public void setMercParam2(String mercParam2) {
		this.mercParam2 = mercParam2;
	}

	public String getMercParam3() {
		return this.mercParam3;
	}

	public void setMercParam3(String mercParam3) {
		this.mercParam3 = mercParam3;
	}

	public String getMerchantExtId() {
		return this.merchantExtId;
	}

	public void setMerchantExtId(String merchantExtId) {
		this.merchantExtId = merchantExtId;
	}

	public BigDecimal getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderAmountSign() {
		return this.orderAmountSign;
	}

	public void setOrderAmountSign(String orderAmountSign) {
		this.orderAmountSign = orderAmountSign;
	}

	public Date getOrderBirthDate() {
		return this.orderBirthDate;
	}

	public void setOrderBirthDate(Date orderBirthDate) {
		this.orderBirthDate = orderBirthDate;
	}

	public String getOrderCompanyData() {
		return this.orderCompanyData;
	}

	public void setOrderCompanyData(String orderCompanyData) {
		this.orderCompanyData = orderCompanyData;
	}

	public String getOrderCompanyName() {
		return this.orderCompanyName;
	}

	public void setOrderCompanyName(String orderCompanyName) {
		this.orderCompanyName = orderCompanyName;
	}

	public String getOrderConsumerIp() {
		return this.orderConsumerIp;
	}

	public void setOrderConsumerIp(String orderConsumerIp) {
		this.orderConsumerIp = orderConsumerIp;
	}

	public String getOrderCountryCode() {
		return this.orderCountryCode;
	}

	public void setOrderCountryCode(String orderCountryCode) {
		this.orderCountryCode = orderCountryCode;
	}

	public String getOrderCountryId() {
		return this.orderCountryId;
	}

	public void setOrderCountryId(String orderCountryId) {
		this.orderCountryId = orderCountryId;
	}

	public String getOrderCountrySubDiv() {
		return this.orderCountrySubDiv;
	}

	public void setOrderCountrySubDiv(String orderCountrySubDiv) {
		this.orderCountrySubDiv = orderCountrySubDiv;
	}

	public String getOrderCurrencyCode() {
		return this.orderCurrencyCode;
	}

	public void setOrderCurrencyCode(String orderCurrencyCode) {
		this.orderCurrencyCode = orderCurrencyCode;
	}

	public String getOrderCustomerId() {
		return this.orderCustomerId;
	}

	public void setOrderCustomerId(String orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
	}

	public String getOrderDescriptor() {
		return this.orderDescriptor;
	}

	public void setOrderDescriptor(String orderDescriptor) {
		this.orderDescriptor = orderDescriptor;
	}

	public String getOrderEmailId() {
		return this.orderEmailId;
	}

	public void setOrderEmailId(String orderEmailId) {
		this.orderEmailId = orderEmailId;
	}

	public String getOrderFirstname() {
		return this.orderFirstname;
	}

	public void setOrderFirstname(String orderFirstname) {
		this.orderFirstname = orderFirstname;
	}

	public String getOrderHouseNumber() {
		return this.orderHouseNumber;
	}

	public void setOrderHouseNumber(String orderHouseNumber) {
		this.orderHouseNumber = orderHouseNumber;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderIpConsumer() {
		return this.orderIpConsumer;
	}

	public void setOrderIpConsumer(String orderIpConsumer) {
		this.orderIpConsumer = orderIpConsumer;
	}

	public String getOrderLanguageCode() {
		return this.orderLanguageCode;
	}

	public void setOrderLanguageCode(String orderLanguageCode) {
		this.orderLanguageCode = orderLanguageCode;
	}

	public String getOrderMandate() {
		return this.orderMandate;
	}

	public void setOrderMandate(String orderMandate) {
		this.orderMandate = orderMandate;
	}

	public String getOrderMerchantReference() {
		return this.orderMerchantReference;
	}

	public void setOrderMerchantReference(String orderMerchantReference) {
		this.orderMerchantReference = orderMerchantReference;
	}

	public String getOrderPhoneNo() {
		return this.orderPhoneNo;
	}

	public void setOrderPhoneNo(String orderPhoneNo) {
		this.orderPhoneNo = orderPhoneNo;
	}

	public String getOrderPostCode() {
		return this.orderPostCode;
	}

	public void setOrderPostCode(String orderPostCode) {
		this.orderPostCode = orderPostCode;
	}

	public String getOrderPrefixSurname() {
		return this.orderPrefixSurname;
	}

	public void setOrderPrefixSurname(String orderPrefixSurname) {
		this.orderPrefixSurname = orderPrefixSurname;
	}

	public String getOrderResellerId() {
		return this.orderResellerId;
	}

	public void setOrderResellerId(String orderResellerId) {
		this.orderResellerId = orderResellerId;
	}

	public String getOrderStreet() {
		return this.orderStreet;
	}

	public void setOrderStreet(String orderStreet) {
		this.orderStreet = orderStreet;
	}

	public String getOrderSurname() {
		return this.orderSurname;
	}

	public void setOrderSurname(String orderSurname) {
		this.orderSurname = orderSurname;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOrderTown() {
		return this.orderTown;
	}

	public void setOrderTown(String orderTown) {
		this.orderTown = orderTown;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderVat() {
		return this.orderVat;
	}

	public void setOrderVat(String orderVat) {
		this.orderVat = orderVat;
	}

	public String getOverrideStatus() {
		return this.overrideStatus;
	}

	public void setOverrideStatus(String overrideStatus) {
		this.overrideStatus = overrideStatus;
	}

	public String getOverridenBy() {
		return this.overridenBy;
	}

	public void setOverridenBy(String overridenBy) {
		this.overridenBy = overridenBy;
	}

	public String getPaymentAccNum() {
		return this.paymentAccNum;
	}

	public void setPaymentAccNum(String paymentAccNum) {
		this.paymentAccNum = paymentAccNum;
	}

	public String getPaymentAccountHolderName() {
		return this.paymentAccountHolderName;
	}

	public void setPaymentAccountHolderName(String paymentAccountHolderName) {
		this.paymentAccountHolderName = paymentAccountHolderName;
	}

	public BigDecimal getPaymentAmount() {
		return this.paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentAmountSign() {
		return this.paymentAmountSign;
	}

	public void setPaymentAmountSign(String paymentAmountSign) {
		this.paymentAmountSign = paymentAmountSign;
	}

	public String getPaymentBankChkDigit() {
		return this.paymentBankChkDigit;
	}

	public void setPaymentBankChkDigit(String paymentBankChkDigit) {
		this.paymentBankChkDigit = paymentBankChkDigit;
	}

	public String getPaymentBankCode() {
		return this.paymentBankCode;
	}

	public void setPaymentBankCode(String paymentBankCode) {
		this.paymentBankCode = paymentBankCode;
	}

	public Date getPaymentBirthDate() {
		return this.paymentBirthDate;
	}

	public void setPaymentBirthDate(Date paymentBirthDate) {
		this.paymentBirthDate = paymentBirthDate;
	}

	public String getPaymentBranchCode() {
		return this.paymentBranchCode;
	}

	public void setPaymentBranchCode(String paymentBranchCode) {
		this.paymentBranchCode = paymentBranchCode;
	}

	public String getPaymentCompanyData() {
		return this.paymentCompanyData;
	}

	public void setPaymentCompanyData(String paymentCompanyData) {
		this.paymentCompanyData = paymentCompanyData;
	}

	public String getPaymentCompanyName() {
		return this.paymentCompanyName;
	}

	public void setPaymentCompanyName(String paymentCompanyName) {
		this.paymentCompanyName = paymentCompanyName;
	}

	public String getPaymentConsumerIp() {
		return this.paymentConsumerIp;
	}

	public void setPaymentConsumerIp(String paymentConsumerIp) {
		this.paymentConsumerIp = paymentConsumerIp;
	}

	public String getPaymentCountryCode() {
		return this.paymentCountryCode;
	}

	public void setPaymentCountryCode(String paymentCountryCode) {
		this.paymentCountryCode = paymentCountryCode;
	}

	public String getPaymentCountryId() {
		return this.paymentCountryId;
	}

	public void setPaymentCountryId(String paymentCountryId) {
		this.paymentCountryId = paymentCountryId;
	}

	public String getPaymentCountrySubDiv() {
		return this.paymentCountrySubDiv;
	}

	public void setPaymentCountrySubDiv(String paymentCountrySubDiv) {
		this.paymentCountrySubDiv = paymentCountrySubDiv;
	}

	public String getPaymentCreditCardNumber() {
		return this.paymentCreditCardNumber;
	}

	public void setPaymentCreditCardNumber(String paymentCreditCardNumber) {
		this.paymentCreditCardNumber = paymentCreditCardNumber;
	}

	public String getPaymentCurrencyCode() {
		return this.paymentCurrencyCode;
	}

	public void setPaymentCurrencyCode(String paymentCurrencyCode) {
		this.paymentCurrencyCode = paymentCurrencyCode;
	}

	public String getPaymentCustomerId() {
		return this.paymentCustomerId;
	}

	public void setPaymentCustomerId(String paymentCustomerId) {
		this.paymentCustomerId = paymentCustomerId;
	}

	public String getPaymentEmail() {
		return this.paymentEmail;
	}

	public void setPaymentEmail(String paymentEmail) {
		this.paymentEmail = paymentEmail;
	}

	public BigDecimal getPaymentExpiryDate() {
		return this.paymentExpiryDate;
	}

	public void setPaymentExpiryDate(BigDecimal paymentExpiryDate) {
		this.paymentExpiryDate = paymentExpiryDate;
	}

	public String getPaymentFirstname() {
		return this.paymentFirstname;
	}

	public void setPaymentFirstname(String paymentFirstname) {
		this.paymentFirstname = paymentFirstname;
	}

	public String getPaymentHouseNumber() {
		return this.paymentHouseNumber;
	}

	public void setPaymentHouseNumber(String paymentHouseNumber) {
		this.paymentHouseNumber = paymentHouseNumber;
	}

	public String getPaymentIban() {
		return this.paymentIban;
	}

	public void setPaymentIban(String paymentIban) {
		this.paymentIban = paymentIban;
	}

	public String getPaymentIpAddress() {
		return this.paymentIpAddress;
	}

	public void setPaymentIpAddress(String paymentIpAddress) {
		this.paymentIpAddress = paymentIpAddress;
	}

	public String getPaymentIssueNumber() {
		return this.paymentIssueNumber;
	}

	public void setPaymentIssueNumber(String paymentIssueNumber) {
		this.paymentIssueNumber = paymentIssueNumber;
	}

	public String getPaymentLanguageCode() {
		return this.paymentLanguageCode;
	}

	public void setPaymentLanguageCode(String paymentLanguageCode) {
		this.paymentLanguageCode = paymentLanguageCode;
	}

	public String getPaymentPhoneNo() {
		return this.paymentPhoneNo;
	}

	public void setPaymentPhoneNo(String paymentPhoneNo) {
		this.paymentPhoneNo = paymentPhoneNo;
	}

	public String getPaymentPostCode() {
		return this.paymentPostCode;
	}

	public void setPaymentPostCode(String paymentPostCode) {
		this.paymentPostCode = paymentPostCode;
	}

	public String getPaymentPrefixSurname() {
		return this.paymentPrefixSurname;
	}

	public void setPaymentPrefixSurname(String paymentPrefixSurname) {
		this.paymentPrefixSurname = paymentPrefixSurname;
	}

	public String getPaymentProductId() {
		return this.paymentProductId;
	}

	public void setPaymentProductId(String paymentProductId) {
		this.paymentProductId = paymentProductId;
	}

	public String getPaymentStreetName() {
		return this.paymentStreetName;
	}

	public void setPaymentStreetName(String paymentStreetName) {
		this.paymentStreetName = paymentStreetName;
	}

	public String getPaymentSurname() {
		return this.paymentSurname;
	}

	public void setPaymentSurname(String paymentSurname) {
		this.paymentSurname = paymentSurname;
	}

	public String getPaymentTitle() {
		return this.paymentTitle;
	}

	public void setPaymentTitle(String paymentTitle) {
		this.paymentTitle = paymentTitle;
	}

	public String getPaymentTown() {
		return this.paymentTown;
	}

	public void setPaymentTown(String paymentTown) {
		this.paymentTown = paymentTown;
	}

	public String getPaymentTransactionType() {
		return this.paymentTransactionType;
	}

	public void setPaymentTransactionType(String paymentTransactionType) {
		this.paymentTransactionType = paymentTransactionType;
	}

	public String getPaymentVat() {
		return this.paymentVat;
	}

	public void setPaymentVat(String paymentVat) {
		this.paymentVat = paymentVat;
	}

	public Date getPayoutDate() {
		return this.payoutDate;
	}

	public void setPayoutDate(Date payoutDate) {
		this.payoutDate = payoutDate;
	}

	public String getPayoutText() {
		return this.payoutText;
	}

	public void setPayoutText(String payoutText) {
		this.payoutText = payoutText;
	}

	public String getProcApiName() {
		return this.procApiName;
	}

	public void setProcApiName(String procApiName) {
		this.procApiName = procApiName;
	}

	public String getProcApiVersion() {
		return this.procApiVersion;
	}

	public void setProcApiVersion(String procApiVersion) {
		this.procApiVersion = procApiVersion;
	}

	public String getProcInitgServ() {
		return this.procInitgServ;
	}

	public void setProcInitgServ(String procInitgServ) {
		this.procInitgServ = procInitgServ;
	}

	public String getProcTxnCorrId() {
		return this.procTxnCorrId;
	}

	public void setProcTxnCorrId(String procTxnCorrId) {
		this.procTxnCorrId = procTxnCorrId;
	}

	public String getProcWebName() {
		return this.procWebName;
	}

	public void setProcWebName(String procWebName) {
		this.procWebName = procWebName;
	}

	public String getRecordCategory() {
		return this.recordCategory;
	}

	public void setRecordCategory(String recordCategory) {
		this.recordCategory = recordCategory;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getRefOrigPayment() {
		return this.refOrigPayment;
	}

	public void setRefOrigPayment(String refOrigPayment) {
		this.refOrigPayment = refOrigPayment;
	}

	public BigDecimal getRelatedInternalId() {
		return this.relatedInternalId;
	}

	public void setRelatedInternalId(BigDecimal relatedInternalId) {
		this.relatedInternalId = relatedInternalId;
	}

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return this.responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseSource() {
		return this.responseSource;
	}

	public void setResponseSource(String responseSource) {
		this.responseSource = responseSource;
	}

	public BigDecimal getResponseStatus() {
		return this.responseStatus;
	}

	public void setResponseStatus(BigDecimal responseStatus) {
		this.responseStatus = responseStatus;
	}

	public BigDecimal getRetryCount() {
		return this.retryCount;
	}

	public void setRetryCount(BigDecimal retryCount) {
		this.retryCount = retryCount;
	}

	public String getScoreCode() {
		return this.scoreCode;
	}

	public void setScoreCode(String scoreCode) {
		this.scoreCode = scoreCode;
	}

	public Date getShipBirthDate() {
		return this.shipBirthDate;
	}

	public void setShipBirthDate(Date shipBirthDate) {
		this.shipBirthDate = shipBirthDate;
	}

	public String getShipCompanyData() {
		return this.shipCompanyData;
	}

	public void setShipCompanyData(String shipCompanyData) {
		this.shipCompanyData = shipCompanyData;
	}

	public String getShipCompanyName() {
		return this.shipCompanyName;
	}

	public void setShipCompanyName(String shipCompanyName) {
		this.shipCompanyName = shipCompanyName;
	}

	public String getShipConsumerIp() {
		return this.shipConsumerIp;
	}

	public void setShipConsumerIp(String shipConsumerIp) {
		this.shipConsumerIp = shipConsumerIp;
	}

	public String getShipCountryId() {
		return this.shipCountryId;
	}

	public void setShipCountryId(String shipCountryId) {
		this.shipCountryId = shipCountryId;
	}

	public String getShipCountrySubDiv() {
		return this.shipCountrySubDiv;
	}

	public void setShipCountrySubDiv(String shipCountrySubDiv) {
		this.shipCountrySubDiv = shipCountrySubDiv;
	}

	public String getShipCustomerId() {
		return this.shipCustomerId;
	}

	public void setShipCustomerId(String shipCustomerId) {
		this.shipCustomerId = shipCustomerId;
	}

	public String getShipEmailId() {
		return this.shipEmailId;
	}

	public void setShipEmailId(String shipEmailId) {
		this.shipEmailId = shipEmailId;
	}

	public String getShipFirstname() {
		return this.shipFirstname;
	}

	public void setShipFirstname(String shipFirstname) {
		this.shipFirstname = shipFirstname;
	}

	public String getShipHouseNumber() {
		return this.shipHouseNumber;
	}

	public void setShipHouseNumber(String shipHouseNumber) {
		this.shipHouseNumber = shipHouseNumber;
	}

	public String getShipPhoneNumber() {
		return this.shipPhoneNumber;
	}

	public void setShipPhoneNumber(String shipPhoneNumber) {
		this.shipPhoneNumber = shipPhoneNumber;
	}

	public String getShipPostCode() {
		return this.shipPostCode;
	}

	public void setShipPostCode(String shipPostCode) {
		this.shipPostCode = shipPostCode;
	}

	public String getShipPrefixsurname() {
		return this.shipPrefixsurname;
	}

	public void setShipPrefixsurname(String shipPrefixsurname) {
		this.shipPrefixsurname = shipPrefixsurname;
	}

	public String getShipStreet() {
		return this.shipStreet;
	}

	public void setShipStreet(String shipStreet) {
		this.shipStreet = shipStreet;
	}

	public String getShipSurname() {
		return this.shipSurname;
	}

	public void setShipSurname(String shipSurname) {
		this.shipSurname = shipSurname;
	}

	public String getShipTitle() {
		return this.shipTitle;
	}

	public void setShipTitle(String shipTitle) {
		this.shipTitle = shipTitle;
	}

	public String getShipTown() {
		return this.shipTown;
	}

	public void setShipTown(String shipTown) {
		this.shipTown = shipTown;
	}

	public String getShipVat() {
		return this.shipVat;
	}

	public void setShipVat(String shipVat) {
		this.shipVat = shipVat;
	}

	public String getThreedsecurePerformed() {
		return this.threedsecurePerformed;
	}

	public void setThreedsecurePerformed(String threedsecurePerformed) {
		this.threedsecurePerformed = threedsecurePerformed;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Timestamp getTxnDateTime() {
		return this.txnDateTime;
	}

	public void setTxnDateTime(Timestamp txnDateTime) {
		this.txnDateTime = txnDateTime;
	}

	public BigDecimal getTxnTotScore() {
		return this.txnTotScore;
	}

	public void setTxnTotScore(BigDecimal txnTotScore) {
		this.txnTotScore = txnTotScore;
	}

	public String getUcaf() {
		return this.ucaf;
	}

	public void setUcaf(String ucaf) {
		this.ucaf = ucaf;
	}

	public String getUdf1() {
		return this.udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	public String getUdf10() {
		return this.udf10;
	}

	public void setUdf10(String udf10) {
		this.udf10 = udf10;
	}

	public String getUdf11() {
		return this.udf11;
	}

	public void setUdf11(String udf11) {
		this.udf11 = udf11;
	}

	public String getUdf12() {
		return this.udf12;
	}

	public void setUdf12(String udf12) {
		this.udf12 = udf12;
	}

	public String getUdf13() {
		return this.udf13;
	}

	public void setUdf13(String udf13) {
		this.udf13 = udf13;
	}

	public String getUdf14() {
		return this.udf14;
	}

	public void setUdf14(String udf14) {
		this.udf14 = udf14;
	}

	public String getUdf15() {
		return this.udf15;
	}

	public void setUdf15(String udf15) {
		this.udf15 = udf15;
	}

	public String getUdf16() {
		return this.udf16;
	}

	public void setUdf16(String udf16) {
		this.udf16 = udf16;
	}

	public String getUdf17() {
		return this.udf17;
	}

	public void setUdf17(String udf17) {
		this.udf17 = udf17;
	}

	public String getUdf18() {
		return this.udf18;
	}

	public void setUdf18(String udf18) {
		this.udf18 = udf18;
	}

	public String getUdf19() {
		return this.udf19;
	}

	public void setUdf19(String udf19) {
		this.udf19 = udf19;
	}

	public String getUdf2() {
		return this.udf2;
	}

	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	public String getUdf20() {
		return this.udf20;
	}

	public void setUdf20(String udf20) {
		this.udf20 = udf20;
	}

	public String getUdf21() {
		return this.udf21;
	}

	public void setUdf21(String udf21) {
		this.udf21 = udf21;
	}

	public String getUdf22() {
		return this.udf22;
	}

	public void setUdf22(String udf22) {
		this.udf22 = udf22;
	}

	public String getUdf23() {
		return this.udf23;
	}

	public void setUdf23(String udf23) {
		this.udf23 = udf23;
	}

	public String getUdf24() {
		return this.udf24;
	}

	public void setUdf24(String udf24) {
		this.udf24 = udf24;
	}

	public String getUdf25() {
		return this.udf25;
	}

	public void setUdf25(String udf25) {
		this.udf25 = udf25;
	}

	public String getUdf3() {
		return this.udf3;
	}

	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}

	public String getUdf4() {
		return this.udf4;
	}

	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}

	public String getUdf5() {
		return this.udf5;
	}

	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}

	public String getUdf6() {
		return this.udf6;
	}

	public void setUdf6(String udf6) {
		this.udf6 = udf6;
	}

	public String getUdf7() {
		return this.udf7;
	}

	public void setUdf7(String udf7) {
		this.udf7 = udf7;
	}

	public String getUdf8() {
		return this.udf8;
	}

	public void setUdf8(String udf8) {
		this.udf8 = udf8;
	}

	public String getUdf9() {
		return this.udf9;
	}

	public void setUdf9(String udf9) {
		this.udf9 = udf9;
	}

}