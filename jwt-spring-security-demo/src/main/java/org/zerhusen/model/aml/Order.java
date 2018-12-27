package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDERS")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderPK id;

	@Column(name="A1_FRAUD_NEURAL")
	private String a1FraudNeural;

	@Column(name="A1_FRAUD_RCF")
	private String a1FraudRcf;

	@Column(name="A1_FRAUD_REC_ID")
	private String a1FraudRecId;

	@Column(name="A1_FRAUD_RSP_CD")
	private String a1FraudRspCd;

	@Column(name="A1_FRAUD_STAT_CD")
	private String a1FraudStatCd;

	@Column(name="A1_FRAUD_USE_CD")
	private String a1FraudUseCd;

	@Column(name="A1_ORD_ID")
	private String a1OrdId;

	@Column(name="A1_REQ_ID")
	private String a1ReqId;

	@Column(name="A1_STAT_CD")
	private String a1StatCd;

	@Column(name="A1_USER_ID")
	private String a1UserId;

	@Column(name="ACCOUNT_DATA_SOURCE")
	private String accountDataSource;

	@Column(name="ACCOUNT_NAME")
	private String accountName;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="ACQUIRER_ORG_CODE")
	private String acquirerOrgCode;

	@Column(name="ACTION_CODE")
	private String actionCode;

	@Column(name="ADDITIONAL_REFERENCE")
	private String additionalReference;

	@Column(name="AFFILIATE_OUTLET")
	private String affiliateOutlet;

	@Column(name="ALLOW_DUP")
	private String allowDup;

	@Column(name="ALLOW_PARTIAL_AUTH")
	private String allowPartialAuth;

	@Column(name="AMOUNT_SIGN")
	private String amountSign;

	@Column(name="ATTEMPT_ID")
	private String attemptId;

	@Column(name="AUTH_AMOUNT")
	private BigDecimal authAmount;

	@Column(name="AUTH_CODE")
	private String authCode;

	@Column(name="AUTH_REVERSAL_INDICATOR")
	private String authReversalIndicator;

	@Column(name="AUTH_RULE_OVERRIDE")
	private String authRuleOverride;

	@Column(name="AUTH_SOURCE_CODE")
	private String authSourceCode;

	@Column(name="AVS_INDICATOR")
	private String avsIndicator;

	@Column(name="AVS_RESULT")
	private String avsResult;

	@Column(name="BANK_CHECKDIGIT")
	private String bankCheckdigit;

	@Column(name="BANK_CITY")
	private String bankCity;

	@Column(name="BANK_CODE")
	private String bankCode;

	@Column(name="BANK_COUNTRYCODE")
	private String bankCountrycode;

	@Column(name="BANK_NAME")
	private String bankName;

	@Column(name="BATCH_FILE_ID")
	private String batchFileId;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="BLOCK_CODE")
	private String blockCode;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="BRANCH_NAME")
	private String branchName;

	@Column(name="BROWSER_TYPE")
	private String browserType;

	@Column(name="BROWSER_VERSION")
	private String browserVersion;

	@Column(name="C_ADDITIONAL_ADDRESS_INFO")
	private String cAdditionalAddressInfo;

	@Column(name="C_AREA_CODE")
	private String cAreaCode;

	@Column(name="C_CITY_TOWN")
	private String cCityTown;

	@Column(name="C_COUNTRY")
	private String cCountry;

	@Column(name="C_COUNTRY_CODE")
	private String cCountryCode;

	@Column(name="C_CURRENCY_CODE")
	private String cCurrencyCode;

	@Column(name="C_EMAIL")
	private String cEmail;

	@Column(name="C_FIRST_NAME")
	private String cFirstName;

	@Column(name="C_IPADDRESS")
	private String cIpaddress;

	@Column(name="C_LANGUAGE_CODE")
	private String cLanguageCode;

	@Column(name="C_LOGIN_ID")
	private String cLoginId;

	@Column(name="C_PREFIX_SURNAME")
	private String cPrefixSurname;

	@Column(name="C_STATE_COUNTY")
	private String cStateCounty;

	@Column(name="C_SURNAME")
	private String cSurname;

	@Column(name="C_ZIP_POSTCODE")
	private String cZipPostcode;

	@Column(name="CARD_FEE")
	private BigDecimal cardFee;

	@Column(name="CARD_HOLDER_ID_CODE")
	private String cardHolderIdCode;

	@Column(name="CARD_ISSUER_BIN")
	private String cardIssuerBin;

	@Column(name="CARD_LOAD")
	private String cardLoad;

	@Column(name="CARD_NO")
	private String cardNo;

	@Column(name="CARD_PRESENT")
	private String cardPresent;

	@Column(name="CARD_SWIPED")
	private String cardSwiped;

	@Column(name="CARD_TYPE_IND")
	private BigDecimal cardTypeInd;

	@Column(name="CARDHOLDER_PRESENT")
	private String cardholderPresent;

	@Column(name="CASHBACK_AMOUNT")
	private BigDecimal cashbackAmount;

	private String channel;

	@Column(name="CLERK_ID")
	private String clerkId;

	@Column(name="CLIENT_IP")
	private String clientIp;

	@Column(name="COLLECTION_DATE")
	private String collectionDate;

	@Column(name="COLLECTION_REASON")
	private String collectionReason;

	@Column(name="COMPANY_NAME")
	private String companyName;

	@Column(name="CORPORATE_CARD_IND")
	private String corporateCardInd;

	private String county;

	@Column(name="CURRENT_CARD_STATUS")
	private String currentCardStatus;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CVV_INDICATOR")
	private String cvvIndicator;

	@Column(name="CVV_REQ")
	private String cvvReq;

	@Column(name="CVV_RESULT_CODE")
	private String cvvResultCode;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_PAYMENT_REFUND")
	private Date datePaymentRefund;

	@Column(name="DE_EDGE_CITY")
	private String deEdgeCity;

	@Column(name="DE_EDGE_CONN_SPEED")
	private String deEdgeConnSpeed;

	@Column(name="DE_EDGE_COUNTRY")
	private String deEdgeCountry;

	@Column(name="DE_EDGE_REGION")
	private String deEdgeRegion;

	@Column(name="DE_PROXY_TYPE")
	private String deProxyType;

	@Column(name="DEBIT_CREDIT_IND")
	private String debitCreditInd;

	@Column(name="DELIVERY_ADDL_ADDRESS_INFO")
	private String deliveryAddlAddressInfo;

	@Column(name="DELIVERY_COUNTRY")
	private String deliveryCountry;

	@Column(name="DELIVERY_COUNTRYCODE")
	private String deliveryCountrycode;

	@Column(name="DELIVERY_COUNTY")
	private String deliveryCounty;

	@Column(name="DELIVERY_FIRSTNAME")
	private String deliveryFirstname;

	@Column(name="DELIVERY_HOUSE_NO")
	private String deliveryHouseNo;

	@Column(name="DELIVERY_POST_CODE")
	private String deliveryPostCode;

	@Column(name="DELIVERY_PREFIXSURNAME")
	private String deliveryPrefixsurname;

	@Column(name="DELIVERY_ROAD")
	private String deliveryRoad;

	@Column(name="DELIVERY_ROUTE")
	private String deliveryRoute;

	@Column(name="DELIVERY_SURNAME")
	private String deliverySurname;

	@Column(name="DELIVERY_TITLE")
	private String deliveryTitle;

	@Column(name="DELIVERY_TOWN")
	private String deliveryTown;

	@Column(name="DIRECT_MKT_INVOICE_NBR")
	private String directMktInvoiceNbr;

	@Column(name="DIRECT_MKT_SHIP_DATE_DAY")
	private BigDecimal directMktShipDateDay;

	@Column(name="DIRECT_MKT_SHIP_DATE_MONTH")
	private BigDecimal directMktShipDateMonth;

	@Column(name="DRIVING_LICENCE")
	private String drivingLicence;

	@Column(name="EB_WEBSITE")
	private String ebWebsite;

	@Column(name="EBT_PASSWORD")
	private String ebtPassword;

	@Column(name="EBT_PREVCUST")
	private String ebtPrevcust;

	private String eci;

	@Column(name="ECOMMERCE_IND")
	private String ecommerceInd;

	@Column(name="EFFORT_ID")
	private String effortId;

	private String email;

	@Column(name="EMBOSSED_NAME")
	private String embossedName;

	@Column(name="END_DATE")
	private String endDate;

	@Column(name="ENTER_FACIT_TIMING")
	private BigDecimal enterFacitTiming;

	@Column(name="EXPIRY_DATE")
	private String expiryDate;

	@Column(name="EXT_IS_BILLABLE")
	private String extIsBillable;

	private String firstname;

	@Column(name="FORCED_AUTHORISATION")
	private String forcedAuthorisation;

	@Column(name="FRACTALS_RESPONSE_OVERRIDE")
	private String fractalsResponseOverride;

	@Column(name="GRATUITY_AMOUNT")
	private BigDecimal gratuityAmount;

	@Column(name="H_DISPUTE_ID")
	private String hDisputeId;

	@Column(name="HANDLING_CHARGE")
	private BigDecimal handlingCharge;

	@Column(name="HASH_ID_1")
	private String hashId1;

	@Column(name="HOUSE_NUMBER")
	private String houseNumber;

	private String iban;

	private String imei;

	@Column(name="INTERFACE_VERSION")
	private String interfaceVersion;

	@Column(name="IP_ADDRESS")
	private String ipAddress;

	@Column(name="ISSUE_NO")
	private String issueNo;

	@Column(name="ISSUER_COUNTRY")
	private String issuerCountry;

	@Column(name="ISSUER_COUNTRY_CODE")
	private String issuerCountryCode;

	@Column(name="ISSUER_CURRENCY_CODE")
	private String issuerCurrencyCode;

	@Column(name="ISSUER_ID")
	private String issuerId;

	@Column(name="ISSUER_ORG_CODE")
	private String issuerOrgCode;

	private String jailbroken;

	@Column(name="KT_AUTO")
	private String ktAuto;

	@Column(name="KT_LOCALTIME")
	private String ktLocaltime;

	@Column(name="KT_MOBILE_DEVICE")
	private String ktMobileDevice;

	@Column(name="KT_MOBILE_FORWARDER")
	private String ktMobileForwarder;

	@Column(name="KT_MOBILE_TYPE")
	private String ktMobileType;

	@Column(name="KT_ORDER")
	private String ktOrder;

	@Column(name="KT_PC_REMOTE")
	private String ktPcRemote;

	@Column(name="KT_PROXY")
	private String ktProxy;

	@Column(name="KT_REAS")
	private String ktReas;

	@Column(name="KT_SCOR")
	private BigDecimal ktScor;

	@Column(name="KT_STAT")
	private String ktStat;

	@Column(name="LOAD_DATE")
	private Timestamp loadDate;

	@Column(name="LOAD_TYPE")
	private String loadType;

	@Temporal(TemporalType.DATE)
	@Column(name="LOCAL_TIME_RECEIVED")
	private Date localTimeReceived;

	@Temporal(TemporalType.DATE)
	@Column(name="LOCAL_TIME_SENT")
	private Date localTimeSent;

	@Column(name="LOCATION_GPS")
	private String locationGps;

	@Column(name="LOCATION_LATITUDE")
	private BigDecimal locationLatitude;

	@Column(name="LOCATION_LONGITUDE")
	private BigDecimal locationLongitude;

	@Column(name="MAC_ADDRESS")
	private String macAddress;

	@Column(name="MACHINE_LANGUAGE")
	private String machineLanguage;

	@Column(name="MACHINE_TIME")
	private String machineTime;

	@Column(name="MARKET_SPEC_IND")
	private String marketSpecInd;

	private String marketing;

	@Column(name="MARKETING_A")
	private String marketingA;

	@Column(name="MARKETING_B")
	private String marketingB;

	@Column(name="MARKETING_C")
	private String marketingC;

	@Column(name="MARKETING_D")
	private String marketingD;

	@Column(name="MASKED_ALIAS")
	private String maskedAlias;

	private BigDecimal mcc;

	@Column(name="MER_CODE")
	private String merCode;

	@Column(name="MER_DESCRIPTION")
	private String merDescription;

	@Column(name="MERCHANT_ORG_CODE")
	private String merchantOrgCode;

	@Column(name="MSG_TYPE")
	private String msgType;

	@Column(name="NETWORK_ID_CODE")
	private String networkIdCode;

	@Column(name="NOTIFICATION_REASON_CODE")
	private String notificationReasonCode;

	@Temporal(TemporalType.DATE)
	@Column(name="NOTIFY_DATE")
	private Date notifyDate;

	@Column(name="NUMBER_OF_CARDS")
	private String numberOfCards;

	@Column(name="ORDER_DESCRIPTION")
	private String orderDescription;

	@Column(name="ORDER_ID")
	private String orderId;

	@Column(name="ORDER_TIME")
	private String orderTime;

	@Column(name="ORDER_TOTAL")
	private BigDecimal orderTotal;

	@Column(name="ORDER_TYPE")
	private String orderType;

	@Column(name="ORIGINAL_REPLY_CODE")
	private String originalReplyCode;

	@Column(name="ORIGINAL_TXN_ID")
	private String originalTxnId;

	@Column(name="OS_TYPE")
	private String osType;

	@Column(name="OS_VERSION")
	private String osVersion;

	@Column(name="OTHER_BLOCK")
	private String otherBlock;

	@Column(name="OTHER_REASON")
	private String otherReason;

	@Column(name="OUTLET_AGENT_CODE")
	private String outletAgentCode;

	@Column(name="OUTSIDE_UK")
	private String outsideUk;

	@Column(name="OVERRIDE_STATUS")
	private String overrideStatus;

	@Column(name="OVERRIDEN_BY")
	private String overridenBy;

	private BigDecimal pan;

	@Column(name="PAN_ENCRYPTED")
	private String panEncrypted;

	@Column(name="PAN_MASKED")
	private String panMasked;

	@Column(name="PASSPORT_ISSUE_CODE")
	private String passportIssueCode;

	@Column(name="PASSPORT_NUMBER")
	private String passportNumber;

	@Column(name="PAYMENT_PRODUCT_ID")
	private String paymentProductId;

	@Column(name="PAYMENT_RESULT_CODE")
	private String paymentResultCode;

	@Column(name="PAYMENT_RESULT_TEXT")
	private String paymentResultText;

	@Column(name="PHONE_2")
	private String phone2;

	@Column(name="PHONE_NO")
	private String phoneNo;

	@Column(name="POS_ENTRY_MODE")
	private String posEntryMode;

	@Column(name="POST_CODE")
	private String postCode;

	@Column(name="POST_SYSTEM_RULES_TIMING")
	private BigDecimal postSystemRulesTiming;

	@Column(name="PRE_SYSTEM_RULES_TIMING")
	private BigDecimal preSystemRulesTiming;

	@Column(name="PRE_USER_RULES_TIMING")
	private BigDecimal preUserRulesTiming;

	@Column(name="PREVIOUS_COOKIE")
	private String previousCookie;

	@Column(name="PREVIOUS_PAGE")
	private String previousPage;

	@Column(name="PROCESSING_CODE")
	private String processingCode;

	@Column(name="PROCESSOR_REF_NBR")
	private String processorRefNbr;

	@Column(name="READER_PRESENT")
	private String readerPresent;

	@Column(name="REALTIME_BLOCK_CODE")
	private String realtimeBlockCode;

	@Column(name="REALTIME_REPLY_CODE")
	private String realtimeReplyCode;

	@Column(name="REASON_CODE")
	private String reasonCode;

	@Column(name="RECORD_TYPE")
	private String recordType;

	@Column(name="REFERENCE_NBR")
	private String referenceNbr;

	@Column(name="RELATED_INTERNAL_ID")
	private BigDecimal relatedInternalId;

	@Temporal(TemporalType.DATE)
	@Column(name="REMOTE_TIME_RECEIVED")
	private Date remoteTimeReceived;

	@Temporal(TemporalType.DATE)
	@Column(name="REMOTE_TIME_SENT")
	private Date remoteTimeSent;

	@Column(name="REPEAT_COUNT")
	private BigDecimal repeatCount;

	@Column(name="REQUEST_ID")
	private String requestId;

	@Column(name="REQUEST_TOKEN")
	private String requestToken;

	@Column(name="RESELLER_ID")
	private String resellerId;

	@Column(name="RESP_CODE")
	private String respCode;

	@Column(name="RESP_TEXT")
	private String respText;

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

	@Column(name="RETURN_AMOUNT_INFO")
	private BigDecimal returnAmountInfo;

	@Column(name="REVERSAL_IND")
	private String reversalInd;

	private String road;

	@Column(name="SALE_RETURN_IND")
	private String saleReturnInd;

	@Column(name="SATURDAY_DELIVERY_FEE")
	private BigDecimal saturdayDeliveryFee;

	@Column(name="SATURDAY_DELIVERY_FLAG")
	private String saturdayDeliveryFlag;

	@Column(name="SCORE_CODE")
	private String scoreCode;

	@Column(name="SCREEN_RESOLUTION")
	private String screenResolution;

	@Column(name="SEARCH_1")
	private String search1;

	@Column(name="SEARCH_2")
	private String search2;

	@Column(name="SEARCH_3")
	private String search3;

	@Column(name="SEARCH_4")
	private String search4;

	@Column(name="SECURITY_BLOCK")
	private String securityBlock;

	@Column(name="SECURITY_REASON")
	private String securityReason;

	private String services;

	@Column(name="SETT_AMOUNT")
	private BigDecimal settAmount;

	@Column(name="SHIP_ADDL_ADDRESS_INFO")
	private String shipAddlAddressInfo;

	@Column(name="SHIP_COUNTRYCODE")
	private String shipCountrycode;

	@Column(name="SHIP_FIRSTNAME")
	private String shipFirstname;

	@Column(name="SHIP_PREFIXSURNAME")
	private String shipPrefixsurname;

	@Column(name="SHIP_SURNAME")
	private String shipSurname;

	@Column(name="SHIP_TITLE")
	private String shipTitle;

	@Column(name="SHOPPING_BASKET_TYPE")
	private String shoppingBasketType;

	@Column(name="SITE_ID")
	private String siteId;

	@Column(name="SOURCE_BRANCH_ID")
	private String sourceBranchId;

	@Column(name="SOURCE_OF_ENQUIRY")
	private String sourceOfEnquiry;

	@Column(name="SPECIAL_REQUIREMENT")
	private String specialRequirement;

	@Column(name="START_DATE")
	private String startDate;

	@Column(name="STT_INDICATOR")
	private String sttIndicator;

	@Column(name="SUB_CLIENT")
	private String subClient;

	private String success;

	private String surname;

	private String suspcious;

	@Column(name="SWIFT_CODE")
	private String swiftCode;

	@Temporal(TemporalType.DATE)
	@Column(name="SYSTEM_ALERT_DATE_TIME")
	private Date systemAlertDateTime;

	@Column(name="SYSTEM_TRACE_NUMBER")
	private String systemTraceNumber;

	@Column(name="TERMINAL_ID")
	private String terminalId;

	private String title;

	@Column(name="TMC_CARD_ID")
	private String tmcCardId;

	private String town;

	@Column(name="TRANSACTION_CODE")
	private String transactionCode;

	@Column(name="TRANSACTION_DESCRIPTION")
	private String transactionDescription;

	@Column(name="TRANSACTION_ID1")
	private String transactionId1;

	@Column(name="TRANSACTION_ID2")
	private String transactionId2;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;

	@Column(name="TXN_AMOUNT")
	private BigDecimal txnAmount;

	@Column(name="TXN_TOT_SCORE")
	private BigDecimal txnTotScore;

	@Column(name="UNIQUE_DEVICE_ID")
	private String uniqueDeviceId;

	@Column(name="USER_AGENT_FULL")
	private String userAgentFull;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_ALERT_DATE_TIME")
	private Date userAlertDateTime;

	@Column(name="USER_ID")
	private String userId;

	@Column(name="VENUE_ADDITIONAL_ADDRESS_INFO")
	private String venueAdditionalAddressInfo;

	@Column(name="VENUE_CITY")
	private String venueCity;

	@Column(name="VENUE_COUNTRY")
	private String venueCountry;

	@Column(name="VENUE_COUNTRYCODE")
	private String venueCountrycode;

	@Column(name="VENUE_HOUSE_NBR_NAME")
	private String venueHouseNbrName;

	@Column(name="VENUE_STATE")
	private String venueState;

	@Column(name="VENUE_STREET")
	private String venueStreet;

	@Column(name="VENUE_ZIP_POSTCODE")
	private String venueZipPostcode;

	@Column(name="VISOR_SCORE")
	private BigDecimal visorScore;

	public Order() {
	}

	public OrderPK getId() {
		return this.id;
	}

	public void setId(OrderPK id) {
		this.id = id;
	}

	public String getA1FraudNeural() {
		return this.a1FraudNeural;
	}

	public void setA1FraudNeural(String a1FraudNeural) {
		this.a1FraudNeural = a1FraudNeural;
	}

	public String getA1FraudRcf() {
		return this.a1FraudRcf;
	}

	public void setA1FraudRcf(String a1FraudRcf) {
		this.a1FraudRcf = a1FraudRcf;
	}

	public String getA1FraudRecId() {
		return this.a1FraudRecId;
	}

	public void setA1FraudRecId(String a1FraudRecId) {
		this.a1FraudRecId = a1FraudRecId;
	}

	public String getA1FraudRspCd() {
		return this.a1FraudRspCd;
	}

	public void setA1FraudRspCd(String a1FraudRspCd) {
		this.a1FraudRspCd = a1FraudRspCd;
	}

	public String getA1FraudStatCd() {
		return this.a1FraudStatCd;
	}

	public void setA1FraudStatCd(String a1FraudStatCd) {
		this.a1FraudStatCd = a1FraudStatCd;
	}

	public String getA1FraudUseCd() {
		return this.a1FraudUseCd;
	}

	public void setA1FraudUseCd(String a1FraudUseCd) {
		this.a1FraudUseCd = a1FraudUseCd;
	}

	public String getA1OrdId() {
		return this.a1OrdId;
	}

	public void setA1OrdId(String a1OrdId) {
		this.a1OrdId = a1OrdId;
	}

	public String getA1ReqId() {
		return this.a1ReqId;
	}

	public void setA1ReqId(String a1ReqId) {
		this.a1ReqId = a1ReqId;
	}

	public String getA1StatCd() {
		return this.a1StatCd;
	}

	public void setA1StatCd(String a1StatCd) {
		this.a1StatCd = a1StatCd;
	}

	public String getA1UserId() {
		return this.a1UserId;
	}

	public void setA1UserId(String a1UserId) {
		this.a1UserId = a1UserId;
	}

	public String getAccountDataSource() {
		return this.accountDataSource;
	}

	public void setAccountDataSource(String accountDataSource) {
		this.accountDataSource = accountDataSource;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAcquirerOrgCode() {
		return this.acquirerOrgCode;
	}

	public void setAcquirerOrgCode(String acquirerOrgCode) {
		this.acquirerOrgCode = acquirerOrgCode;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getAdditionalReference() {
		return this.additionalReference;
	}

	public void setAdditionalReference(String additionalReference) {
		this.additionalReference = additionalReference;
	}

	public String getAffiliateOutlet() {
		return this.affiliateOutlet;
	}

	public void setAffiliateOutlet(String affiliateOutlet) {
		this.affiliateOutlet = affiliateOutlet;
	}

	public String getAllowDup() {
		return this.allowDup;
	}

	public void setAllowDup(String allowDup) {
		this.allowDup = allowDup;
	}

	public String getAllowPartialAuth() {
		return this.allowPartialAuth;
	}

	public void setAllowPartialAuth(String allowPartialAuth) {
		this.allowPartialAuth = allowPartialAuth;
	}

	public String getAmountSign() {
		return this.amountSign;
	}

	public void setAmountSign(String amountSign) {
		this.amountSign = amountSign;
	}

	public String getAttemptId() {
		return this.attemptId;
	}

	public void setAttemptId(String attemptId) {
		this.attemptId = attemptId;
	}

	public BigDecimal getAuthAmount() {
		return this.authAmount;
	}

	public void setAuthAmount(BigDecimal authAmount) {
		this.authAmount = authAmount;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthReversalIndicator() {
		return this.authReversalIndicator;
	}

	public void setAuthReversalIndicator(String authReversalIndicator) {
		this.authReversalIndicator = authReversalIndicator;
	}

	public String getAuthRuleOverride() {
		return this.authRuleOverride;
	}

	public void setAuthRuleOverride(String authRuleOverride) {
		this.authRuleOverride = authRuleOverride;
	}

	public String getAuthSourceCode() {
		return this.authSourceCode;
	}

	public void setAuthSourceCode(String authSourceCode) {
		this.authSourceCode = authSourceCode;
	}

	public String getAvsIndicator() {
		return this.avsIndicator;
	}

	public void setAvsIndicator(String avsIndicator) {
		this.avsIndicator = avsIndicator;
	}

	public String getAvsResult() {
		return this.avsResult;
	}

	public void setAvsResult(String avsResult) {
		this.avsResult = avsResult;
	}

	public String getBankCheckdigit() {
		return this.bankCheckdigit;
	}

	public void setBankCheckdigit(String bankCheckdigit) {
		this.bankCheckdigit = bankCheckdigit;
	}

	public String getBankCity() {
		return this.bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankCountrycode() {
		return this.bankCountrycode;
	}

	public void setBankCountrycode(String bankCountrycode) {
		this.bankCountrycode = bankCountrycode;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBatchFileId() {
		return this.batchFileId;
	}

	public void setBatchFileId(String batchFileId) {
		this.batchFileId = batchFileId;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBlockCode() {
		return this.blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBrowserType() {
		return this.browserType;
	}

	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}

	public String getBrowserVersion() {
		return this.browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

	public String getCAdditionalAddressInfo() {
		return this.cAdditionalAddressInfo;
	}

	public void setCAdditionalAddressInfo(String cAdditionalAddressInfo) {
		this.cAdditionalAddressInfo = cAdditionalAddressInfo;
	}

	public String getCAreaCode() {
		return this.cAreaCode;
	}

	public void setCAreaCode(String cAreaCode) {
		this.cAreaCode = cAreaCode;
	}

	public String getCCityTown() {
		return this.cCityTown;
	}

	public void setCCityTown(String cCityTown) {
		this.cCityTown = cCityTown;
	}

	public String getCCountry() {
		return this.cCountry;
	}

	public void setCCountry(String cCountry) {
		this.cCountry = cCountry;
	}

	public String getCCountryCode() {
		return this.cCountryCode;
	}

	public void setCCountryCode(String cCountryCode) {
		this.cCountryCode = cCountryCode;
	}

	public String getCCurrencyCode() {
		return this.cCurrencyCode;
	}

	public void setCCurrencyCode(String cCurrencyCode) {
		this.cCurrencyCode = cCurrencyCode;
	}

	public String getCEmail() {
		return this.cEmail;
	}

	public void setCEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getCFirstName() {
		return this.cFirstName;
	}

	public void setCFirstName(String cFirstName) {
		this.cFirstName = cFirstName;
	}

	public String getCIpaddress() {
		return this.cIpaddress;
	}

	public void setCIpaddress(String cIpaddress) {
		this.cIpaddress = cIpaddress;
	}

	public String getCLanguageCode() {
		return this.cLanguageCode;
	}

	public void setCLanguageCode(String cLanguageCode) {
		this.cLanguageCode = cLanguageCode;
	}

	public String getCLoginId() {
		return this.cLoginId;
	}

	public void setCLoginId(String cLoginId) {
		this.cLoginId = cLoginId;
	}

	public String getCPrefixSurname() {
		return this.cPrefixSurname;
	}

	public void setCPrefixSurname(String cPrefixSurname) {
		this.cPrefixSurname = cPrefixSurname;
	}

	public String getCStateCounty() {
		return this.cStateCounty;
	}

	public void setCStateCounty(String cStateCounty) {
		this.cStateCounty = cStateCounty;
	}

	public String getCSurname() {
		return this.cSurname;
	}

	public void setCSurname(String cSurname) {
		this.cSurname = cSurname;
	}

	public String getCZipPostcode() {
		return this.cZipPostcode;
	}

	public void setCZipPostcode(String cZipPostcode) {
		this.cZipPostcode = cZipPostcode;
	}

	public BigDecimal getCardFee() {
		return this.cardFee;
	}

	public void setCardFee(BigDecimal cardFee) {
		this.cardFee = cardFee;
	}

	public String getCardHolderIdCode() {
		return this.cardHolderIdCode;
	}

	public void setCardHolderIdCode(String cardHolderIdCode) {
		this.cardHolderIdCode = cardHolderIdCode;
	}

	public String getCardIssuerBin() {
		return this.cardIssuerBin;
	}

	public void setCardIssuerBin(String cardIssuerBin) {
		this.cardIssuerBin = cardIssuerBin;
	}

	public String getCardLoad() {
		return this.cardLoad;
	}

	public void setCardLoad(String cardLoad) {
		this.cardLoad = cardLoad;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardPresent() {
		return this.cardPresent;
	}

	public void setCardPresent(String cardPresent) {
		this.cardPresent = cardPresent;
	}

	public String getCardSwiped() {
		return this.cardSwiped;
	}

	public void setCardSwiped(String cardSwiped) {
		this.cardSwiped = cardSwiped;
	}

	public BigDecimal getCardTypeInd() {
		return this.cardTypeInd;
	}

	public void setCardTypeInd(BigDecimal cardTypeInd) {
		this.cardTypeInd = cardTypeInd;
	}

	public String getCardholderPresent() {
		return this.cardholderPresent;
	}

	public void setCardholderPresent(String cardholderPresent) {
		this.cardholderPresent = cardholderPresent;
	}

	public BigDecimal getCashbackAmount() {
		return this.cashbackAmount;
	}

	public void setCashbackAmount(BigDecimal cashbackAmount) {
		this.cashbackAmount = cashbackAmount;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getClerkId() {
		return this.clerkId;
	}

	public void setClerkId(String clerkId) {
		this.clerkId = clerkId;
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getCollectionDate() {
		return this.collectionDate;
	}

	public void setCollectionDate(String collectionDate) {
		this.collectionDate = collectionDate;
	}

	public String getCollectionReason() {
		return this.collectionReason;
	}

	public void setCollectionReason(String collectionReason) {
		this.collectionReason = collectionReason;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCorporateCardInd() {
		return this.corporateCardInd;
	}

	public void setCorporateCardInd(String corporateCardInd) {
		this.corporateCardInd = corporateCardInd;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCurrentCardStatus() {
		return this.currentCardStatus;
	}

	public void setCurrentCardStatus(String currentCardStatus) {
		this.currentCardStatus = currentCardStatus;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCvvIndicator() {
		return this.cvvIndicator;
	}

	public void setCvvIndicator(String cvvIndicator) {
		this.cvvIndicator = cvvIndicator;
	}

	public String getCvvReq() {
		return this.cvvReq;
	}

	public void setCvvReq(String cvvReq) {
		this.cvvReq = cvvReq;
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

	public String getDeEdgeCity() {
		return this.deEdgeCity;
	}

	public void setDeEdgeCity(String deEdgeCity) {
		this.deEdgeCity = deEdgeCity;
	}

	public String getDeEdgeConnSpeed() {
		return this.deEdgeConnSpeed;
	}

	public void setDeEdgeConnSpeed(String deEdgeConnSpeed) {
		this.deEdgeConnSpeed = deEdgeConnSpeed;
	}

	public String getDeEdgeCountry() {
		return this.deEdgeCountry;
	}

	public void setDeEdgeCountry(String deEdgeCountry) {
		this.deEdgeCountry = deEdgeCountry;
	}

	public String getDeEdgeRegion() {
		return this.deEdgeRegion;
	}

	public void setDeEdgeRegion(String deEdgeRegion) {
		this.deEdgeRegion = deEdgeRegion;
	}

	public String getDeProxyType() {
		return this.deProxyType;
	}

	public void setDeProxyType(String deProxyType) {
		this.deProxyType = deProxyType;
	}

	public String getDebitCreditInd() {
		return this.debitCreditInd;
	}

	public void setDebitCreditInd(String debitCreditInd) {
		this.debitCreditInd = debitCreditInd;
	}

	public String getDeliveryAddlAddressInfo() {
		return this.deliveryAddlAddressInfo;
	}

	public void setDeliveryAddlAddressInfo(String deliveryAddlAddressInfo) {
		this.deliveryAddlAddressInfo = deliveryAddlAddressInfo;
	}

	public String getDeliveryCountry() {
		return this.deliveryCountry;
	}

	public void setDeliveryCountry(String deliveryCountry) {
		this.deliveryCountry = deliveryCountry;
	}

	public String getDeliveryCountrycode() {
		return this.deliveryCountrycode;
	}

	public void setDeliveryCountrycode(String deliveryCountrycode) {
		this.deliveryCountrycode = deliveryCountrycode;
	}

	public String getDeliveryCounty() {
		return this.deliveryCounty;
	}

	public void setDeliveryCounty(String deliveryCounty) {
		this.deliveryCounty = deliveryCounty;
	}

	public String getDeliveryFirstname() {
		return this.deliveryFirstname;
	}

	public void setDeliveryFirstname(String deliveryFirstname) {
		this.deliveryFirstname = deliveryFirstname;
	}

	public String getDeliveryHouseNo() {
		return this.deliveryHouseNo;
	}

	public void setDeliveryHouseNo(String deliveryHouseNo) {
		this.deliveryHouseNo = deliveryHouseNo;
	}

	public String getDeliveryPostCode() {
		return this.deliveryPostCode;
	}

	public void setDeliveryPostCode(String deliveryPostCode) {
		this.deliveryPostCode = deliveryPostCode;
	}

	public String getDeliveryPrefixsurname() {
		return this.deliveryPrefixsurname;
	}

	public void setDeliveryPrefixsurname(String deliveryPrefixsurname) {
		this.deliveryPrefixsurname = deliveryPrefixsurname;
	}

	public String getDeliveryRoad() {
		return this.deliveryRoad;
	}

	public void setDeliveryRoad(String deliveryRoad) {
		this.deliveryRoad = deliveryRoad;
	}

	public String getDeliveryRoute() {
		return this.deliveryRoute;
	}

	public void setDeliveryRoute(String deliveryRoute) {
		this.deliveryRoute = deliveryRoute;
	}

	public String getDeliverySurname() {
		return this.deliverySurname;
	}

	public void setDeliverySurname(String deliverySurname) {
		this.deliverySurname = deliverySurname;
	}

	public String getDeliveryTitle() {
		return this.deliveryTitle;
	}

	public void setDeliveryTitle(String deliveryTitle) {
		this.deliveryTitle = deliveryTitle;
	}

	public String getDeliveryTown() {
		return this.deliveryTown;
	}

	public void setDeliveryTown(String deliveryTown) {
		this.deliveryTown = deliveryTown;
	}

	public String getDirectMktInvoiceNbr() {
		return this.directMktInvoiceNbr;
	}

	public void setDirectMktInvoiceNbr(String directMktInvoiceNbr) {
		this.directMktInvoiceNbr = directMktInvoiceNbr;
	}

	public BigDecimal getDirectMktShipDateDay() {
		return this.directMktShipDateDay;
	}

	public void setDirectMktShipDateDay(BigDecimal directMktShipDateDay) {
		this.directMktShipDateDay = directMktShipDateDay;
	}

	public BigDecimal getDirectMktShipDateMonth() {
		return this.directMktShipDateMonth;
	}

	public void setDirectMktShipDateMonth(BigDecimal directMktShipDateMonth) {
		this.directMktShipDateMonth = directMktShipDateMonth;
	}

	public String getDrivingLicence() {
		return this.drivingLicence;
	}

	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
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

	public String getEbtPrevcust() {
		return this.ebtPrevcust;
	}

	public void setEbtPrevcust(String ebtPrevcust) {
		this.ebtPrevcust = ebtPrevcust;
	}

	public String getEci() {
		return this.eci;
	}

	public void setEci(String eci) {
		this.eci = eci;
	}

	public String getEcommerceInd() {
		return this.ecommerceInd;
	}

	public void setEcommerceInd(String ecommerceInd) {
		this.ecommerceInd = ecommerceInd;
	}

	public String getEffortId() {
		return this.effortId;
	}

	public void setEffortId(String effortId) {
		this.effortId = effortId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmbossedName() {
		return this.embossedName;
	}

	public void setEmbossedName(String embossedName) {
		this.embossedName = embossedName;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getEnterFacitTiming() {
		return this.enterFacitTiming;
	}

	public void setEnterFacitTiming(BigDecimal enterFacitTiming) {
		this.enterFacitTiming = enterFacitTiming;
	}

	public String getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getExtIsBillable() {
		return this.extIsBillable;
	}

	public void setExtIsBillable(String extIsBillable) {
		this.extIsBillable = extIsBillable;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getForcedAuthorisation() {
		return this.forcedAuthorisation;
	}

	public void setForcedAuthorisation(String forcedAuthorisation) {
		this.forcedAuthorisation = forcedAuthorisation;
	}

	public String getFractalsResponseOverride() {
		return this.fractalsResponseOverride;
	}

	public void setFractalsResponseOverride(String fractalsResponseOverride) {
		this.fractalsResponseOverride = fractalsResponseOverride;
	}

	public BigDecimal getGratuityAmount() {
		return this.gratuityAmount;
	}

	public void setGratuityAmount(BigDecimal gratuityAmount) {
		this.gratuityAmount = gratuityAmount;
	}

	public String getHDisputeId() {
		return this.hDisputeId;
	}

	public void setHDisputeId(String hDisputeId) {
		this.hDisputeId = hDisputeId;
	}

	public BigDecimal getHandlingCharge() {
		return this.handlingCharge;
	}

	public void setHandlingCharge(BigDecimal handlingCharge) {
		this.handlingCharge = handlingCharge;
	}

	public String getHashId1() {
		return this.hashId1;
	}

	public void setHashId1(String hashId1) {
		this.hashId1 = hashId1;
	}

	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getIban() {
		return this.iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getInterfaceVersion() {
		return this.interfaceVersion;
	}

	public void setInterfaceVersion(String interfaceVersion) {
		this.interfaceVersion = interfaceVersion;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getIssueNo() {
		return this.issueNo;
	}

	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}

	public String getIssuerCountry() {
		return this.issuerCountry;
	}

	public void setIssuerCountry(String issuerCountry) {
		this.issuerCountry = issuerCountry;
	}

	public String getIssuerCountryCode() {
		return this.issuerCountryCode;
	}

	public void setIssuerCountryCode(String issuerCountryCode) {
		this.issuerCountryCode = issuerCountryCode;
	}

	public String getIssuerCurrencyCode() {
		return this.issuerCurrencyCode;
	}

	public void setIssuerCurrencyCode(String issuerCurrencyCode) {
		this.issuerCurrencyCode = issuerCurrencyCode;
	}

	public String getIssuerId() {
		return this.issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getIssuerOrgCode() {
		return this.issuerOrgCode;
	}

	public void setIssuerOrgCode(String issuerOrgCode) {
		this.issuerOrgCode = issuerOrgCode;
	}

	public String getJailbroken() {
		return this.jailbroken;
	}

	public void setJailbroken(String jailbroken) {
		this.jailbroken = jailbroken;
	}

	public String getKtAuto() {
		return this.ktAuto;
	}

	public void setKtAuto(String ktAuto) {
		this.ktAuto = ktAuto;
	}

	public String getKtLocaltime() {
		return this.ktLocaltime;
	}

	public void setKtLocaltime(String ktLocaltime) {
		this.ktLocaltime = ktLocaltime;
	}

	public String getKtMobileDevice() {
		return this.ktMobileDevice;
	}

	public void setKtMobileDevice(String ktMobileDevice) {
		this.ktMobileDevice = ktMobileDevice;
	}

	public String getKtMobileForwarder() {
		return this.ktMobileForwarder;
	}

	public void setKtMobileForwarder(String ktMobileForwarder) {
		this.ktMobileForwarder = ktMobileForwarder;
	}

	public String getKtMobileType() {
		return this.ktMobileType;
	}

	public void setKtMobileType(String ktMobileType) {
		this.ktMobileType = ktMobileType;
	}

	public String getKtOrder() {
		return this.ktOrder;
	}

	public void setKtOrder(String ktOrder) {
		this.ktOrder = ktOrder;
	}

	public String getKtPcRemote() {
		return this.ktPcRemote;
	}

	public void setKtPcRemote(String ktPcRemote) {
		this.ktPcRemote = ktPcRemote;
	}

	public String getKtProxy() {
		return this.ktProxy;
	}

	public void setKtProxy(String ktProxy) {
		this.ktProxy = ktProxy;
	}

	public String getKtReas() {
		return this.ktReas;
	}

	public void setKtReas(String ktReas) {
		this.ktReas = ktReas;
	}

	public BigDecimal getKtScor() {
		return this.ktScor;
	}

	public void setKtScor(BigDecimal ktScor) {
		this.ktScor = ktScor;
	}

	public String getKtStat() {
		return this.ktStat;
	}

	public void setKtStat(String ktStat) {
		this.ktStat = ktStat;
	}

	public Timestamp getLoadDate() {
		return this.loadDate;
	}

	public void setLoadDate(Timestamp loadDate) {
		this.loadDate = loadDate;
	}

	public String getLoadType() {
		return this.loadType;
	}

	public void setLoadType(String loadType) {
		this.loadType = loadType;
	}

	public Date getLocalTimeReceived() {
		return this.localTimeReceived;
	}

	public void setLocalTimeReceived(Date localTimeReceived) {
		this.localTimeReceived = localTimeReceived;
	}

	public Date getLocalTimeSent() {
		return this.localTimeSent;
	}

	public void setLocalTimeSent(Date localTimeSent) {
		this.localTimeSent = localTimeSent;
	}

	public String getLocationGps() {
		return this.locationGps;
	}

	public void setLocationGps(String locationGps) {
		this.locationGps = locationGps;
	}

	public BigDecimal getLocationLatitude() {
		return this.locationLatitude;
	}

	public void setLocationLatitude(BigDecimal locationLatitude) {
		this.locationLatitude = locationLatitude;
	}

	public BigDecimal getLocationLongitude() {
		return this.locationLongitude;
	}

	public void setLocationLongitude(BigDecimal locationLongitude) {
		this.locationLongitude = locationLongitude;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMachineLanguage() {
		return this.machineLanguage;
	}

	public void setMachineLanguage(String machineLanguage) {
		this.machineLanguage = machineLanguage;
	}

	public String getMachineTime() {
		return this.machineTime;
	}

	public void setMachineTime(String machineTime) {
		this.machineTime = machineTime;
	}

	public String getMarketSpecInd() {
		return this.marketSpecInd;
	}

	public void setMarketSpecInd(String marketSpecInd) {
		this.marketSpecInd = marketSpecInd;
	}

	public String getMarketing() {
		return this.marketing;
	}

	public void setMarketing(String marketing) {
		this.marketing = marketing;
	}

	public String getMarketingA() {
		return this.marketingA;
	}

	public void setMarketingA(String marketingA) {
		this.marketingA = marketingA;
	}

	public String getMarketingB() {
		return this.marketingB;
	}

	public void setMarketingB(String marketingB) {
		this.marketingB = marketingB;
	}

	public String getMarketingC() {
		return this.marketingC;
	}

	public void setMarketingC(String marketingC) {
		this.marketingC = marketingC;
	}

	public String getMarketingD() {
		return this.marketingD;
	}

	public void setMarketingD(String marketingD) {
		this.marketingD = marketingD;
	}

	public String getMaskedAlias() {
		return this.maskedAlias;
	}

	public void setMaskedAlias(String maskedAlias) {
		this.maskedAlias = maskedAlias;
	}

	public BigDecimal getMcc() {
		return this.mcc;
	}

	public void setMcc(BigDecimal mcc) {
		this.mcc = mcc;
	}

	public String getMerCode() {
		return this.merCode;
	}

	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}

	public String getMerDescription() {
		return this.merDescription;
	}

	public void setMerDescription(String merDescription) {
		this.merDescription = merDescription;
	}

	public String getMerchantOrgCode() {
		return this.merchantOrgCode;
	}

	public void setMerchantOrgCode(String merchantOrgCode) {
		this.merchantOrgCode = merchantOrgCode;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getNetworkIdCode() {
		return this.networkIdCode;
	}

	public void setNetworkIdCode(String networkIdCode) {
		this.networkIdCode = networkIdCode;
	}

	public String getNotificationReasonCode() {
		return this.notificationReasonCode;
	}

	public void setNotificationReasonCode(String notificationReasonCode) {
		this.notificationReasonCode = notificationReasonCode;
	}

	public Date getNotifyDate() {
		return this.notifyDate;
	}

	public void setNotifyDate(Date notifyDate) {
		this.notifyDate = notifyDate;
	}

	public String getNumberOfCards() {
		return this.numberOfCards;
	}

	public void setNumberOfCards(String numberOfCards) {
		this.numberOfCards = numberOfCards;
	}

	public String getOrderDescription() {
		return this.orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public BigDecimal getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOriginalReplyCode() {
		return this.originalReplyCode;
	}

	public void setOriginalReplyCode(String originalReplyCode) {
		this.originalReplyCode = originalReplyCode;
	}

	public String getOriginalTxnId() {
		return this.originalTxnId;
	}

	public void setOriginalTxnId(String originalTxnId) {
		this.originalTxnId = originalTxnId;
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getOtherBlock() {
		return this.otherBlock;
	}

	public void setOtherBlock(String otherBlock) {
		this.otherBlock = otherBlock;
	}

	public String getOtherReason() {
		return this.otherReason;
	}

	public void setOtherReason(String otherReason) {
		this.otherReason = otherReason;
	}

	public String getOutletAgentCode() {
		return this.outletAgentCode;
	}

	public void setOutletAgentCode(String outletAgentCode) {
		this.outletAgentCode = outletAgentCode;
	}

	public String getOutsideUk() {
		return this.outsideUk;
	}

	public void setOutsideUk(String outsideUk) {
		this.outsideUk = outsideUk;
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

	public BigDecimal getPan() {
		return this.pan;
	}

	public void setPan(BigDecimal pan) {
		this.pan = pan;
	}

	public String getPanEncrypted() {
		return this.panEncrypted;
	}

	public void setPanEncrypted(String panEncrypted) {
		this.panEncrypted = panEncrypted;
	}

	public String getPanMasked() {
		return this.panMasked;
	}

	public void setPanMasked(String panMasked) {
		this.panMasked = panMasked;
	}

	public String getPassportIssueCode() {
		return this.passportIssueCode;
	}

	public void setPassportIssueCode(String passportIssueCode) {
		this.passportIssueCode = passportIssueCode;
	}

	public String getPassportNumber() {
		return this.passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPaymentProductId() {
		return this.paymentProductId;
	}

	public void setPaymentProductId(String paymentProductId) {
		this.paymentProductId = paymentProductId;
	}

	public String getPaymentResultCode() {
		return this.paymentResultCode;
	}

	public void setPaymentResultCode(String paymentResultCode) {
		this.paymentResultCode = paymentResultCode;
	}

	public String getPaymentResultText() {
		return this.paymentResultText;
	}

	public void setPaymentResultText(String paymentResultText) {
		this.paymentResultText = paymentResultText;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPosEntryMode() {
		return this.posEntryMode;
	}

	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public BigDecimal getPostSystemRulesTiming() {
		return this.postSystemRulesTiming;
	}

	public void setPostSystemRulesTiming(BigDecimal postSystemRulesTiming) {
		this.postSystemRulesTiming = postSystemRulesTiming;
	}

	public BigDecimal getPreSystemRulesTiming() {
		return this.preSystemRulesTiming;
	}

	public void setPreSystemRulesTiming(BigDecimal preSystemRulesTiming) {
		this.preSystemRulesTiming = preSystemRulesTiming;
	}

	public BigDecimal getPreUserRulesTiming() {
		return this.preUserRulesTiming;
	}

	public void setPreUserRulesTiming(BigDecimal preUserRulesTiming) {
		this.preUserRulesTiming = preUserRulesTiming;
	}

	public String getPreviousCookie() {
		return this.previousCookie;
	}

	public void setPreviousCookie(String previousCookie) {
		this.previousCookie = previousCookie;
	}

	public String getPreviousPage() {
		return this.previousPage;
	}

	public void setPreviousPage(String previousPage) {
		this.previousPage = previousPage;
	}

	public String getProcessingCode() {
		return this.processingCode;
	}

	public void setProcessingCode(String processingCode) {
		this.processingCode = processingCode;
	}

	public String getProcessorRefNbr() {
		return this.processorRefNbr;
	}

	public void setProcessorRefNbr(String processorRefNbr) {
		this.processorRefNbr = processorRefNbr;
	}

	public String getReaderPresent() {
		return this.readerPresent;
	}

	public void setReaderPresent(String readerPresent) {
		this.readerPresent = readerPresent;
	}

	public String getRealtimeBlockCode() {
		return this.realtimeBlockCode;
	}

	public void setRealtimeBlockCode(String realtimeBlockCode) {
		this.realtimeBlockCode = realtimeBlockCode;
	}

	public String getRealtimeReplyCode() {
		return this.realtimeReplyCode;
	}

	public void setRealtimeReplyCode(String realtimeReplyCode) {
		this.realtimeReplyCode = realtimeReplyCode;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getReferenceNbr() {
		return this.referenceNbr;
	}

	public void setReferenceNbr(String referenceNbr) {
		this.referenceNbr = referenceNbr;
	}

	public BigDecimal getRelatedInternalId() {
		return this.relatedInternalId;
	}

	public void setRelatedInternalId(BigDecimal relatedInternalId) {
		this.relatedInternalId = relatedInternalId;
	}

	public Date getRemoteTimeReceived() {
		return this.remoteTimeReceived;
	}

	public void setRemoteTimeReceived(Date remoteTimeReceived) {
		this.remoteTimeReceived = remoteTimeReceived;
	}

	public Date getRemoteTimeSent() {
		return this.remoteTimeSent;
	}

	public void setRemoteTimeSent(Date remoteTimeSent) {
		this.remoteTimeSent = remoteTimeSent;
	}

	public BigDecimal getRepeatCount() {
		return this.repeatCount;
	}

	public void setRepeatCount(BigDecimal repeatCount) {
		this.repeatCount = repeatCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestToken() {
		return this.requestToken;
	}

	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public String getResellerId() {
		return this.resellerId;
	}

	public void setResellerId(String resellerId) {
		this.resellerId = resellerId;
	}

	public String getRespCode() {
		return this.respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespText() {
		return this.respText;
	}

	public void setRespText(String respText) {
		this.respText = respText;
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

	public BigDecimal getReturnAmountInfo() {
		return this.returnAmountInfo;
	}

	public void setReturnAmountInfo(BigDecimal returnAmountInfo) {
		this.returnAmountInfo = returnAmountInfo;
	}

	public String getReversalInd() {
		return this.reversalInd;
	}

	public void setReversalInd(String reversalInd) {
		this.reversalInd = reversalInd;
	}

	public String getRoad() {
		return this.road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getSaleReturnInd() {
		return this.saleReturnInd;
	}

	public void setSaleReturnInd(String saleReturnInd) {
		this.saleReturnInd = saleReturnInd;
	}

	public BigDecimal getSaturdayDeliveryFee() {
		return this.saturdayDeliveryFee;
	}

	public void setSaturdayDeliveryFee(BigDecimal saturdayDeliveryFee) {
		this.saturdayDeliveryFee = saturdayDeliveryFee;
	}

	public String getSaturdayDeliveryFlag() {
		return this.saturdayDeliveryFlag;
	}

	public void setSaturdayDeliveryFlag(String saturdayDeliveryFlag) {
		this.saturdayDeliveryFlag = saturdayDeliveryFlag;
	}

	public String getScoreCode() {
		return this.scoreCode;
	}

	public void setScoreCode(String scoreCode) {
		this.scoreCode = scoreCode;
	}

	public String getScreenResolution() {
		return this.screenResolution;
	}

	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}

	public String getSearch1() {
		return this.search1;
	}

	public void setSearch1(String search1) {
		this.search1 = search1;
	}

	public String getSearch2() {
		return this.search2;
	}

	public void setSearch2(String search2) {
		this.search2 = search2;
	}

	public String getSearch3() {
		return this.search3;
	}

	public void setSearch3(String search3) {
		this.search3 = search3;
	}

	public String getSearch4() {
		return this.search4;
	}

	public void setSearch4(String search4) {
		this.search4 = search4;
	}

	public String getSecurityBlock() {
		return this.securityBlock;
	}

	public void setSecurityBlock(String securityBlock) {
		this.securityBlock = securityBlock;
	}

	public String getSecurityReason() {
		return this.securityReason;
	}

	public void setSecurityReason(String securityReason) {
		this.securityReason = securityReason;
	}

	public String getServices() {
		return this.services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public BigDecimal getSettAmount() {
		return this.settAmount;
	}

	public void setSettAmount(BigDecimal settAmount) {
		this.settAmount = settAmount;
	}

	public String getShipAddlAddressInfo() {
		return this.shipAddlAddressInfo;
	}

	public void setShipAddlAddressInfo(String shipAddlAddressInfo) {
		this.shipAddlAddressInfo = shipAddlAddressInfo;
	}

	public String getShipCountrycode() {
		return this.shipCountrycode;
	}

	public void setShipCountrycode(String shipCountrycode) {
		this.shipCountrycode = shipCountrycode;
	}

	public String getShipFirstname() {
		return this.shipFirstname;
	}

	public void setShipFirstname(String shipFirstname) {
		this.shipFirstname = shipFirstname;
	}

	public String getShipPrefixsurname() {
		return this.shipPrefixsurname;
	}

	public void setShipPrefixsurname(String shipPrefixsurname) {
		this.shipPrefixsurname = shipPrefixsurname;
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

	public String getShoppingBasketType() {
		return this.shoppingBasketType;
	}

	public void setShoppingBasketType(String shoppingBasketType) {
		this.shoppingBasketType = shoppingBasketType;
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getSourceBranchId() {
		return this.sourceBranchId;
	}

	public void setSourceBranchId(String sourceBranchId) {
		this.sourceBranchId = sourceBranchId;
	}

	public String getSourceOfEnquiry() {
		return this.sourceOfEnquiry;
	}

	public void setSourceOfEnquiry(String sourceOfEnquiry) {
		this.sourceOfEnquiry = sourceOfEnquiry;
	}

	public String getSpecialRequirement() {
		return this.specialRequirement;
	}

	public void setSpecialRequirement(String specialRequirement) {
		this.specialRequirement = specialRequirement;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSttIndicator() {
		return this.sttIndicator;
	}

	public void setSttIndicator(String sttIndicator) {
		this.sttIndicator = sttIndicator;
	}

	public String getSubClient() {
		return this.subClient;
	}

	public void setSubClient(String subClient) {
		this.subClient = subClient;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSuspcious() {
		return this.suspcious;
	}

	public void setSuspcious(String suspcious) {
		this.suspcious = suspcious;
	}

	public String getSwiftCode() {
		return this.swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public Date getSystemAlertDateTime() {
		return this.systemAlertDateTime;
	}

	public void setSystemAlertDateTime(Date systemAlertDateTime) {
		this.systemAlertDateTime = systemAlertDateTime;
	}

	public String getSystemTraceNumber() {
		return this.systemTraceNumber;
	}

	public void setSystemTraceNumber(String systemTraceNumber) {
		this.systemTraceNumber = systemTraceNumber;
	}

	public String getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTmcCardId() {
		return this.tmcCardId;
	}

	public void setTmcCardId(String tmcCardId) {
		this.tmcCardId = tmcCardId;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getTransactionCode() {
		return this.transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getTransactionDescription() {
		return this.transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionId1() {
		return this.transactionId1;
	}

	public void setTransactionId1(String transactionId1) {
		this.transactionId1 = transactionId1;
	}

	public String getTransactionId2() {
		return this.transactionId2;
	}

	public void setTransactionId2(String transactionId2) {
		this.transactionId2 = transactionId2;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getTxnAmount() {
		return this.txnAmount;
	}

	public void setTxnAmount(BigDecimal txnAmount) {
		this.txnAmount = txnAmount;
	}

	public BigDecimal getTxnTotScore() {
		return this.txnTotScore;
	}

	public void setTxnTotScore(BigDecimal txnTotScore) {
		this.txnTotScore = txnTotScore;
	}

	public String getUniqueDeviceId() {
		return this.uniqueDeviceId;
	}

	public void setUniqueDeviceId(String uniqueDeviceId) {
		this.uniqueDeviceId = uniqueDeviceId;
	}

	public String getUserAgentFull() {
		return this.userAgentFull;
	}

	public void setUserAgentFull(String userAgentFull) {
		this.userAgentFull = userAgentFull;
	}

	public Date getUserAlertDateTime() {
		return this.userAlertDateTime;
	}

	public void setUserAlertDateTime(Date userAlertDateTime) {
		this.userAlertDateTime = userAlertDateTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVenueAdditionalAddressInfo() {
		return this.venueAdditionalAddressInfo;
	}

	public void setVenueAdditionalAddressInfo(String venueAdditionalAddressInfo) {
		this.venueAdditionalAddressInfo = venueAdditionalAddressInfo;
	}

	public String getVenueCity() {
		return this.venueCity;
	}

	public void setVenueCity(String venueCity) {
		this.venueCity = venueCity;
	}

	public String getVenueCountry() {
		return this.venueCountry;
	}

	public void setVenueCountry(String venueCountry) {
		this.venueCountry = venueCountry;
	}

	public String getVenueCountrycode() {
		return this.venueCountrycode;
	}

	public void setVenueCountrycode(String venueCountrycode) {
		this.venueCountrycode = venueCountrycode;
	}

	public String getVenueHouseNbrName() {
		return this.venueHouseNbrName;
	}

	public void setVenueHouseNbrName(String venueHouseNbrName) {
		this.venueHouseNbrName = venueHouseNbrName;
	}

	public String getVenueState() {
		return this.venueState;
	}

	public void setVenueState(String venueState) {
		this.venueState = venueState;
	}

	public String getVenueStreet() {
		return this.venueStreet;
	}

	public void setVenueStreet(String venueStreet) {
		this.venueStreet = venueStreet;
	}

	public String getVenueZipPostcode() {
		return this.venueZipPostcode;
	}

	public void setVenueZipPostcode(String venueZipPostcode) {
		this.venueZipPostcode = venueZipPostcode;
	}

	public BigDecimal getVisorScore() {
		return this.visorScore;
	}

	public void setVisorScore(BigDecimal visorScore) {
		this.visorScore = visorScore;
	}

}