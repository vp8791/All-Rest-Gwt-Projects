package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the TXN_CARD_TRANSACTIONS database table.
 * 
 */
@Entity
@Table(name="TXN_CARD_TRANSACTIONS")
@NamedQuery(name="TxnCardTransaction.findAll", query="SELECT t FROM TxnCardTransaction t")
public class TxnCardTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TxnCardTransactionPK id;

	@Column(name="ACQUIRER_COUNTRY")
	private String acquirerCountry;

	@Column(name="ACQUIRER_ORG_CODE")
	private String acquirerOrgCode;

	@Column(name="ACTION_RESPONSE_CODE_1")
	private String actionResponseCode1;

	@Column(name="ACTION_RESPONSE_CODE_2")
	private String actionResponseCode2;

	@Column(name="ACTION_RESPONSE_CODE_3")
	private String actionResponseCode3;

	@Column(name="ACTION_RESPONSE_CODE_4")
	private String actionResponseCode4;

	@Column(name="ADV_DETAIL_CODE")
	private String advDetailCode;

	@Column(name="ADV_REASON_CODE")
	private String advReasonCode;

	@Column(name="AMOUNT_LOCAL")
	private BigDecimal amountLocal;

	@Column(name="AMOUNT_ORIG")
	private BigDecimal amountOrig;

	@Column(name="AMOUNT_PAN")
	private BigDecimal amountPan;

	@Column(name="ATC_RULE_CODE")
	private String atcRuleCode;

	@Column(name="ATC_RULE_CODE_1")
	private String atcRuleCode1;

	@Column(name="ATC_RULE_CODE_2")
	private String atcRuleCode2;

	@Column(name="ATC_RULE_CODE_3")
	private String atcRuleCode3;

	@Column(name="ATC_RULE_CODE_4")
	private String atcRuleCode4;

	@Column(name="ATM_TRANSACTION")
	private String atmTransaction;

	@Column(name="AUTH_BATCH_ID")
	private String authBatchId;

	@Column(name="AUTH_CODE")
	private String authCode;

	@Column(name="AUTH_CONCLUSION_CODE")
	private BigDecimal authConclusionCode;

	@Column(name="AUTH_CUSTOM_AMOUNT_1")
	private BigDecimal authCustomAmount1;

	@Column(name="AUTH_CUSTOM_AMOUNT_2")
	private BigDecimal authCustomAmount2;

	@Column(name="AUTH_CUSTOM_AMOUNT_3")
	private BigDecimal authCustomAmount3;

	@Temporal(TemporalType.DATE)
	@Column(name="AUTH_CUSTOM_DATETIME_1")
	private Date authCustomDatetime1;

	@Temporal(TemporalType.DATE)
	@Column(name="AUTH_CUSTOM_DATETIME_2")
	private Date authCustomDatetime2;

	@Temporal(TemporalType.DATE)
	@Column(name="AUTH_CUSTOM_DATETIME_3")
	private Date authCustomDatetime3;

	@Column(name="AUTH_CUSTOM_FLAG_1")
	private String authCustomFlag1;

	@Column(name="AUTH_CUSTOM_FLAG_2")
	private String authCustomFlag2;

	@Column(name="AUTH_CUSTOM_FLAG_3")
	private String authCustomFlag3;

	@Column(name="AUTH_CUSTOM_INTEGER_1")
	private BigDecimal authCustomInteger1;

	@Column(name="AUTH_CUSTOM_INTEGER_2")
	private BigDecimal authCustomInteger2;

	@Column(name="AUTH_CUSTOM_INTEGER_3")
	private BigDecimal authCustomInteger3;

	@Column(name="AUTH_CUSTOM_TEXT_10_1")
	private String authCustomText101;

	@Column(name="AUTH_CUSTOM_TEXT_10_2")
	private String authCustomText102;

	@Column(name="AUTH_CUSTOM_TEXT_10_3")
	private String authCustomText103;

	@Column(name="AUTH_CUSTOM_TEXT_50_1")
	private String authCustomText501;

	@Column(name="AUTH_CUSTOM_TEXT_50_2")
	private String authCustomText502;

	@Column(name="AUTH_CUSTOM_TEXT_50_3")
	private String authCustomText503;

	@Column(name="AUTH_PHASE")
	private String authPhase;

	@Column(name="AUTH_RELIABILITY")
	private String authReliability;

	@Column(name="AUTH_RULE_OVERRIDE")
	private String authRuleOverride;

	@Column(name="AVS_DATA")
	private String avsData;

	@Column(name="AVS_RESULT")
	private String avsResult;

	@Column(name="BATCH_RULE_DETAILS")
	private String batchRuleDetails;

	@Column(name="BATCH_RULE_PROCESSING_END")
	private Timestamp batchRuleProcessingEnd;

	@Column(name="BATCH_RULES_TIMED_OUT")
	private Timestamp batchRulesTimedOut;

	private String bin;

	@Column(name="BLOCK_CODE")
	private String blockCode;

	@Temporal(TemporalType.DATE)
	@Column(name="BUSINESS_DATE")
	private Date businessDate;

	@Column(name="CARD_BRAND")
	private BigDecimal cardBrand;

	@Column(name="CARD_EXPIRY")
	private String cardExpiry;

	@Column(name="CARD_ORIGIN")
	private BigDecimal cardOrigin;

	@Column(name="CARD_SEQUENCE_NUMBER")
	private BigDecimal cardSequenceNumber;

	@Column(name="CARD_VERIFY_METHOD")
	private String cardVerifyMethod;

	@Column(name="CARDHOLDER_AUTHENT_METHOD")
	private String cardholderAuthentMethod;

	@Column(name="CASHBACK_AMOUNT")
	private BigDecimal cashbackAmount;

	@Column(name="CASHBACK_CURR")
	private String cashbackCurr;

	@Column(name="CAVV_UCAF_IND")
	private String cavvUcafInd;

	@Column(name="CHARGEBACK_ACQ_REASON_CODE")
	private String chargebackAcqReasonCode;

	@Column(name="CHARGEBACK_GCS_REASON_CODE")
	private String chargebackGcsReasonCode;

	@Column(name="CHARGEBACK_PAYMENT_AMOUNT")
	private BigDecimal chargebackPaymentAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="CHARGEBACK_PAYMENT_DATE")
	private Date chargebackPaymentDate;

	@Column(name="CHIP_CARD_INDICATOR")
	private String chipCardIndicator;

	@Column(name="CHIP_COND_CODE")
	private String chipCondCode;

	@Column(name="COLLECTION_BLOCK")
	private String collectionBlock;

	@Column(name="COLLECTION_REASON")
	private String collectionReason;

	private BigDecimal conversion;

	@Column(name="CORRESPONDENT_NAME")
	private String correspondentName;

	@Column(name="CORRESPONDENT_REF")
	private String correspondentRef;

	@Column(name="CREDIT_LIMIT")
	private BigDecimal creditLimit;

	@Column(name="CREDIT_LIMIT_TEMP")
	private BigDecimal creditLimitTemp;

	@Temporal(TemporalType.DATE)
	@Column(name="CREDIT_LIMIT_TEMP_EXP")
	private Date creditLimitTempExp;

	@Column(name="CURR_LOCAL")
	private String currLocal;

	@Column(name="CURR_ORIG")
	private String currOrig;

	@Column(name="CURR_PAN")
	private String currPan;

	@Column(name="CUST_STATUS")
	private String custStatus;

	@Column(name="CVV2_4DBC_CHECK")
	private BigDecimal cvv24dbcCheck;

	@Column(name="DECLINE_PHASE")
	private String declinePhase;

	@Column(name="DESTINATION_ACCOUNT_PROXY")
	private BigDecimal destinationAccountProxy;

	@Column(name="DESTINATION_SORT_CODE")
	private String destinationSortCode;

	@Column(name="DISPUTE_ID")
	private BigDecimal disputeId;

	@Column(name="DOMESTIC_COUNTRY")
	private String domesticCountry;

	@Column(name="DOMESTIC_TRANSACTION_TYPE")
	private BigDecimal domesticTransactionType;

	@Column(name="ECOMM_IND")
	private String ecommInd;

	@Column(name="EMV_AMOUNT_OTHER")
	private BigDecimal emvAmountOther;

	@Column(name="EMV_ATC")
	private BigDecimal emvAtc;

	@Column(name="EMV_CHIP_CARD_STATUS")
	private String emvChipCardStatus;

	@Column(name="EMV_CHIP_ENABLED_CARD")
	private String emvChipEnabledCard;

	@Column(name="EMV_CONTACTLESS_ENABLED_CARD")
	private String emvContactlessEnabledCard;

	@Column(name="EMV_CRYPTOGRAM_AMOUNT_AUTH")
	private BigDecimal emvCryptogramAmountAuth;

	@Column(name="EMV_CRYPTOGRAM_CHECK_STATUS")
	private String emvCryptogramCheckStatus;

	@Column(name="EMV_CVM_APPLY_CVR_ON_FAIL")
	private String emvCvmApplyCvrOnFail;

	@Column(name="EMV_CVM_CARD_CAPTURE_CAP")
	private String emvCvmCardCaptureCap;

	@Column(name="EMV_CVM_CARD_VERIFIC_RULE")
	private String emvCvmCardVerificRule;

	@Column(name="EMV_CVM_CONDITION")
	private String emvCvmCondition;

	@Column(name="EMV_CVM_DDA_CAPABILITY")
	private String emvCvmDdaCapability;

	@Column(name="EMV_CVM_ENC_PIN_OFF_VERIFY")
	private String emvCvmEncPinOffVerify;

	@Column(name="EMV_CVM_ENC_PIN_OL_VERIF_CAP")
	private BigDecimal emvCvmEncPinOlVerifCap;

	@Column(name="EMV_CVM_PLNTXT_PIN_ICC_VERIF")
	private String emvCvmPlntxtPinIccVerif;

	@Column(name="EMV_CVM_RESULT")
	private String emvCvmResult;

	@Column(name="EMV_CVM_SIGNATURE_CAPABILITY")
	private String emvCvmSignatureCapability;

	@Column(name="EMV_CVM_STAT_DATA_AUTH_CAP")
	private String emvCvmStatDataAuthCap;

	@Column(name="EMV_CVR_AAC_TC_ARQC_RET1")
	private String emvCvrAacTcArqcRet1;

	@Column(name="EMV_CVR_AAC_TC_ARQC_RET2")
	private String emvCvrAacTcArqcRet2;

	@Column(name="EMV_CVR_APP_BLK_PIN_TRY_XCD")
	private String emvCvrAppBlkPinTryXcd;

	@Column(name="EMV_CVR_CDA_PERFORMED")
	private String emvCvrCdaPerformed;

	@Column(name="EMV_CVR_CIAC_CAT3_SKIP")
	private String emvCvrCiacCat3Skip;

	@Column(name="EMV_CVR_CRYPTOGRAM_TYPE_A")
	private String emvCvrCryptogramTypeA;

	@Column(name="EMV_CVR_CRYPTOGRAM_TYPE_B")
	private String emvCvrCryptogramTypeB;

	@Column(name="EMV_CVR_DDA_AC_GEN_RET1")
	private String emvCvrDdaAcGenRet1;

	@Column(name="EMV_CVR_DDA_AC_GEN_RET2")
	private String emvCvrDdaAcGenRet2;

	@Column(name="EMV_CVR_DDA_PERFORMED")
	private String emvCvrDdaPerformed;

	@Column(name="EMV_CVR_DECL_OFFLN_SDA_FAIL")
	private String emvCvrDeclOfflnSdaFail;

	@Column(name="EMV_CVR_DOM_OR_INT_TXN")
	private String emvCvrDomOrIntTxn;

	@Column(name="EMV_CVR_ERR_OFF_PIN_OK")
	private String emvCvrErrOffPinOk;

	@Column(name="EMV_CVR_EXCEED_VEL_CHECK")
	private String emvCvrExceedVelCheck;

	@Column(name="EMV_CVR_GO_ONLINE_NEXT_TXN")
	private String emvCvrGoOnlineNextTxn;

	@Column(name="EMV_CVR_ISS_AUTH_FAIL")
	private String emvCvrIssAuthFail;

	@Column(name="EMV_CVR_ISS_AUTH_FAIL_LSTONL")
	private String emvCvrIssAuthFailLstonl;

	@Column(name="EMV_CVR_LOWER_CUM_AMT_XCD")
	private String emvCvrLowerCumAmtXcd;

	@Column(name="EMV_CVR_LOWER_TXNS_XCD")
	private String emvCvrLowerTxnsXcd;

	@Column(name="EMV_CVR_MTCH_FND_ADDNL_CHK_TBL")
	private String emvCvrMtchFndAddnlChkTbl;

	@Column(name="EMV_CVR_NEW_CARD_FLAG")
	private String emvCvrNewCardFlag;

	@Column(name="EMV_CVR_NO_ISSUER_AUTH")
	private String emvCvrNoIssuerAuth;

	@Column(name="EMV_CVR_OFF_AUTH_FAIL_PREV_TXN")
	private String emvCvrOffAuthFailPrevTxn;

	@Column(name="EMV_CVR_OFF_DDA_LFAIL")
	private String emvCvrOffDdaLfail;

	@Column(name="EMV_CVR_OFFLINE_DDA")
	private String emvCvrOfflineDda;

	@Column(name="EMV_CVR_OFFLINE_PIN_VERIF_FAIL")
	private String emvCvrOfflinePinVerifFail;

	@Column(name="EMV_CVR_OFFLINE_PIN_VERIFY")
	private String emvCvrOfflinePinVerify;

	@Column(name="EMV_CVR_ONLINE_UNAVAILABLE")
	private String emvCvrOnlineUnavailable;

	@Column(name="EMV_CVR_PIN_RETRY_COUNT")
	private BigDecimal emvCvrPinRetryCount;

	@Column(name="EMV_CVR_PIN_RETRY_LIMIT_XCD")
	private String emvCvrPinRetryLimitXcd;

	@Column(name="EMV_CVR_PREV_ISSUER_AUTH_FAIL")
	private String emvCvrPrevIssuerAuthFail;

	@Column(name="EMV_CVR_PREV_TXN_INCOMPLETE")
	private String emvCvrPrevTxnIncomplete;

	@Column(name="EMV_CVR_PTL_EXCEEDED")
	private String emvCvrPtlExceeded;

	@Column(name="EMV_CVR_SCRIPT_COUNT_PREV_TXN")
	private BigDecimal emvCvrScriptCountPrevTxn;

	@Column(name="EMV_CVR_SCRIPT_FAIL_PREV_TXN")
	private String emvCvrScriptFailPrevTxn;

	@Column(name="EMV_CVR_SCRIPT_RECEIVED")
	private String emvCvrScriptReceived;

	@Column(name="EMV_CVR_UNABLE_GO_ONLINE")
	private String emvCvrUnableGoOnline;

	@Column(name="EMV_CVR_UPPER_CUM_AMT_XCD")
	private String emvCvrUpperCumAmtXcd;

	@Column(name="EMV_CVR_UPPER_TXNS_XCD")
	private String emvCvrUpperTxnsXcd;

	@Column(name="EMV_MC_ARC_APP_ONLINE_TXN")
	private String emvMcArcAppOnlineTxn;

	@Column(name="EMV_MC_ARC_SET_ONL_NTXN")
	private String emvMcArcSetOnlNtxn;

	@Column(name="EMV_MC_ARC_UPD_COUNTERS")
	private String emvMcArcUpdCounters;

	@Column(name="EMV_MC_ARC_UPD_PIN_TRYCNT")
	private String emvMcArcUpdPinTrycnt;

	@Column(name="EMV_PREFER_OFFLINE_VERIFY")
	private String emvPreferOfflineVerify;

	@Column(name="EMV_TC_IC")
	private String emvTcIc;

	@Column(name="EMV_TC_KEY_ENTRY")
	private String emvTcKeyEntry;

	@Column(name="EMV_TC_MAG_STRIPE")
	private String emvTcMagStripe;

	@Column(name="EMV_TERM_ENTRY_CAPABILITY")
	private String emvTermEntryCapability;

	@Column(name="EMV_TERMINAL_COUNTRY_CODE")
	private String emvTerminalCountryCode;

	@Column(name="EMV_TERMINAL_TYPE")
	private BigDecimal emvTerminalType;

	@Temporal(TemporalType.DATE)
	@Column(name="EMV_TRANSACTION_DATE")
	private Date emvTransactionDate;

	@Column(name="EMV_TRANSACTION_TYPE")
	private String emvTransactionType;

	@Column(name="EMV_TVR_APP_NOT_YET_EFF")
	private String emvTvrAppNotYetEff;

	@Column(name="EMV_TVR_BAD_VERSIONS")
	private String emvTvrBadVersions;

	@Column(name="EMV_TVR_CARD_ON_EXC_FILE")
	private String emvTvrCardOnExcFile;

	@Column(name="EMV_TVR_CARDHOLDER_VERIFY_FAIL")
	private String emvTvrCardholderVerifyFail;

	@Column(name="EMV_TVR_CDA_FAILED")
	private String emvTvrCdaFailed;

	@Column(name="EMV_TVR_DDA_FAILED")
	private String emvTvrDdaFailed;

	@Column(name="EMV_TVR_DEFAULT_TDOL_USED")
	private String emvTvrDefaultTdolUsed;

	@Column(name="EMV_TVR_EXCEEDS_FLOOR_LIM")
	private String emvTvrExceedsFloorLim;

	@Column(name="EMV_TVR_EXCEEDS_LOWER_CONS_LIM")
	private String emvTvrExceedsLowerConsLim;

	@Column(name="EMV_TVR_EXCEEDS_UPPER_CONS_LIM")
	private String emvTvrExceedsUpperConsLim;

	@Column(name="EMV_TVR_EXPIRED_APP")
	private String emvTvrExpiredApp;

	@Column(name="EMV_TVR_ICC_DATA_MISSING")
	private String emvTvrIccDataMissing;

	@Column(name="EMV_TVR_ISS_SCRIPT_FAIL")
	private String emvTvrIssScriptFail;

	@Column(name="EMV_TVR_ISSUER_AUTH_FAILED")
	private String emvTvrIssuerAuthFailed;

	@Column(name="EMV_TVR_MERCH_FORWARD_ONLINE")
	private String emvTvrMerchForwardOnline;

	@Column(name="EMV_TVR_NEW_CARD")
	private String emvTvrNewCard;

	@Column(name="EMV_TVR_NO_WORKING_PIN_PAD")
	private String emvTvrNoWorkingPinPad;

	@Column(name="EMV_TVR_NOT_OFFLINE")
	private String emvTvrNotOffline;

	@Column(name="EMV_TVR_OFFLINE_PIN_MAX_TRIES")
	private String emvTvrOfflinePinMaxTries;

	@Column(name="EMV_TVR_PIN_ENTERED")
	private String emvTvrPinEntered;

	@Column(name="EMV_TVR_PIN_NOT_ENTERED")
	private String emvTvrPinNotEntered;

	@Column(name="EMV_TVR_RANDOM_ONLINE_SEND")
	private String emvTvrRandomOnlineSend;

	@Column(name="EMV_TVR_SCRIPT_FAIL_POST_FINAL")
	private String emvTvrScriptFailPostFinal;

	@Column(name="EMV_TVR_SDA_FAILED")
	private String emvTvrSdaFailed;

	@Column(name="EMV_TVR_SERVICE_UNALLOWED")
	private String emvTvrServiceUnallowed;

	@Column(name="EMV_TVR_UNRECOGNISED_CVM")
	private String emvTvrUnrecognisedCvm;

	@Column(name="EMV_TXN_CURRENCY_CODE")
	private String emvTxnCurrencyCode;

	@Column(name="ENTER_FACIT_TIMING")
	private BigDecimal enterFacitTiming;

	@Column(name="ENTRY_MODE")
	private String entryMode;

	@Column(name="EXT_IS_BILLABLE")
	private String extIsBillable;

	@Temporal(TemporalType.DATE)
	@Column(name="EXTRACT_DATE")
	private Date extractDate;

	@Column(name="F60_4_RESERVED")
	private String f604Reserved;

	@Column(name="FILE_BATCH_ID")
	private String fileBatchId;

	@Column(name="FILE_SEQUENCE_NUMBER")
	private BigDecimal fileSequenceNumber;

	@Column(name="FRACTALS_RESPONSE_OVERRIDE")
	private String fractalsResponseOverride;

	@Column(name="FRAUD_MATCH_COLUMN1")
	private String fraudMatchColumn1;

	@Column(name="FRAUD_MATCH_COLUMN2")
	private String fraudMatchColumn2;

	@Column(name="FRAUD_MATCH_COLUMN3")
	private String fraudMatchColumn3;

	@Column(name="GRID_MATCH")
	private String gridMatch;

	@Column(name="HEADER_SEQUENCE")
	private BigDecimal headerSequence;

	@Column(name="IBAN_BANK_ID")
	private String ibanBankId;

	@Column(name="IBAN_CHECK_DIGITS")
	private String ibanCheckDigits;

	@Column(name="IBAN_COUNTRY_CODE")
	private String ibanCountryCode;

	@Column(name="ISSUER_BIN")
	private String issuerBin;

	@Column(name="ISSUER_ORG_CODE")
	private String issuerOrgCode;

	@Column(name="ISSUING_BANK")
	private BigDecimal issuingBank;

	@Column(name="LOAD_DATE")
	private Timestamp loadDate;

	@Column(name="MC_61_9_RESERVED")
	private String mc619Reserved;

	@Column(name="MC_CAT_LEVEL")
	private String mcCatLevel;

	@Column(name="MC_CRYPTOGRAM_IND")
	private String mcCryptogramInd;

	@Column(name="MC_F61_2_RESERVED")
	private String mcF612Reserved;

	@Column(name="MC_POS_AUTH_LIFE_CYCLE")
	private String mcPosAuthLifeCycle;

	@Column(name="MC_POS_CARD_CAPT_CAPABILITY")
	private String mcPosCardCaptCapability;

	@Column(name="MC_POS_CARD_PRESENCE")
	private String mcPosCardPresence;

	@Column(name="MC_POS_CARDHOLDER_PRESENCE")
	private String mcPosCardholderPresence;

	@Column(name="MC_POS_COUNTRY_CODE")
	private String mcPosCountryCode;

	@Column(name="MC_POS_POSTAL_CODE")
	private String mcPosPostalCode;

	@Column(name="MC_POS_TERMINAL_ATTENDANCE")
	private String mcPosTerminalAttendance;

	@Column(name="MC_POS_TERMINAL_LOCATION")
	private String mcPosTerminalLocation;

	@Column(name="MC_POS_TRANSACTION_SECURITY")
	private String mcPosTransactionSecurity;

	@Column(name="MC_POS_TRANSACTION_STATUS")
	private String mcPosTransactionStatus;

	@Column(name="MC_TERM_INPUT_CAPABILITY")
	private String mcTermInputCapability;

	@Column(name="MC_TXN_ENCRYPTED")
	private String mcTxnEncrypted;

	@Column(name="MC_UCAF_IND")
	private String mcUcafInd;

	private BigDecimal mcc;

	@Column(name="MCI_DEVICE_TYPE")
	private String mciDeviceType;

	@Column(name="MCI_FINAL_AUTH_INDICATOR")
	private BigDecimal mciFinalAuthIndicator;

	@Column(name="MCI_PAN_MAPPING_INFO")
	private String mciPanMappingInfo;

	@Column(name="MCI_PROCESSOR_ICA")
	private String mciProcessorIca;

	@Column(name="MER_CITY")
	private String merCity;

	@Column(name="MER_CODE")
	private String merCode;

	@Column(name="MER_COUNTRY")
	private String merCountry;

	@Column(name="MER_GROUP")
	private String merGroup;

	@Column(name="MER_NAME")
	private String merName;

	@Column(name="MER_REGION_CODE")
	private String merRegionCode;

	@Temporal(TemporalType.DATE)
	@Column(name="MER_TXN_DATE")
	private Date merTxnDate;

	@Column(name="MERCHANT_ORG_CODE")
	private String merchantOrgCode;

	@Column(name="MINI_STANDIN_FLAG")
	private String miniStandinFlag;

	@Column(name="MSG_TYPE")
	private String msgType;

	@Column(name="NOTIFICATION_REASON_CODE")
	private String notificationReasonCode;

	@Temporal(TemporalType.DATE)
	@Column(name="NOTIFY_DATE")
	private Date notifyDate;

	@Column(name="OPEN_TO_BUY")
	private BigDecimal openToBuy;

	@Column(name="ORDER_ID")
	private String orderId;

	@Column(name="ORIGINAL_REPLY_CODE")
	private String originalReplyCode;

	@Temporal(TemporalType.DATE)
	@Column(name="ORIGINAL_TXN_DATE")
	private Date originalTxnDate;

	@Column(name="OTHER_BLOCK")
	private String otherBlock;

	@Column(name="OTHER_REASON")
	private String otherReason;

	@Column(name="OVERRIDE_STATUS")
	private String overrideStatus;

	@Column(name="OVERRIDEN_BY")
	private String overridenBy;

	private BigDecimal pan;

	@Column(name="PAN_CONF_BAL")
	private BigDecimal panConfBal;

	@Column(name="PAN_PEND_TXNS")
	private BigDecimal panPendTxns;

	@Column(name="PAN_STATUS")
	private String panStatus;

	@Column(name="PAN_TEST_TXN")
	private BigDecimal panTestTxn;

	@Column(name="PARENT_ACCOUNT")
	private BigDecimal parentAccount;

	@Column(name="PARENT_ACCOUNT_TYPE")
	private String parentAccountType;

	@Column(name="PAYMENT_ORDER_ID")
	private BigDecimal paymentOrderId;

	@Column(name="PAYMENT_PAYMENT_PRODUCT_ID")
	private BigDecimal paymentPaymentProductId;

	@Column(name="POS_COND_CODE")
	private String posCondCode;

	@Column(name="POST_COMPLETION_CODE")
	private String postCompletionCode;

	@Column(name="POST_SYSTEM_RULES_TIMING")
	private BigDecimal postSystemRulesTiming;

	@Column(name="PRE_SYSTEM_RULES_TIMING")
	private BigDecimal preSystemRulesTiming;

	@Column(name="PRE_USER_RULES_TIMING")
	private BigDecimal preUserRulesTiming;

	@Column(name="PREV_AUTH_TIME")
	private String prevAuthTime;

	private String product;

	@Column(name="PRODUCT_CATEGORY")
	private String productCategory;

	@Column(name="REAL_TIME_SCORING")
	private String realTimeScoring;

	@Column(name="REALTIME_BLOCK_CODE")
	private String realtimeBlockCode;

	@Column(name="REALTIME_REPLY_CODE")
	private String realtimeReplyCode;

	@Column(name="REALTIME_RULE_DETAILS")
	private String realtimeRuleDetails;

	@Column(name="REALTIME_RULE_PROCESSING_END")
	private Timestamp realtimeRuleProcessingEnd;

	@Column(name="REALTIME_RULES_TIMED_OUT")
	private Timestamp realtimeRulesTimedOut;

	@Column(name="REC_TYPE")
	private String recType;

	@Column(name="RELATED_INTERNAL_ID")
	private BigDecimal relatedInternalId;

	@Column(name="REPLY_CODE")
	private String replyCode;

	@Column(name="REQUEST_ACTION")
	private String requestAction;

	@Column(name="REQUEST_TYPE")
	private String requestType;

	@Column(name="RESPONSE_CODE")
	private String responseCode;

	@Column(name="RESPONSE_MESSAGE")
	private String responseMessage;

	@Column(name="RESPONSE_SOURCE")
	private String responseSource;

	@Column(name="RESPONSE_STATUS")
	private BigDecimal responseStatus;

	@Column(name="RETAILER_ID")
	private String retailerId;

	@Column(name="RETRY_COUNT")
	private BigDecimal retryCount;

	@Column(name="RISK_CONDITION_CODE")
	private String riskConditionCode;

	@Column(name="RTS_REASON_CODE")
	private String rtsReasonCode;

	@Column(name="SCORE_CODE")
	private String scoreCode;

	@Column(name="SECURE_COMMERCE_INDICATOR")
	private String secureCommerceIndicator;

	@Column(name="SECURITY_BLOCK")
	private String securityBlock;

	@Column(name="SECURITY_REASON")
	private String securityReason;

	@Column(name="SERVICE_CODE")
	private BigDecimal serviceCode;

	@Column(name="SETT_AMOUNT_LOCAL")
	private BigDecimal settAmountLocal;

	@Column(name="SETT_AMOUNT_ORIG")
	private BigDecimal settAmountOrig;

	@Column(name="SETT_AUTH_CODE")
	private String settAuthCode;

	@Column(name="SETT_BATCH_ID")
	private String settBatchId;

	@Column(name="SETT_BATCH_NUMBER")
	private String settBatchNumber;

	@Column(name="SETT_BILL_AMOUNT")
	private BigDecimal settBillAmount;

	@Column(name="SETT_BILL_CURR")
	private String settBillCurr;

	@Column(name="SETT_BIN")
	private String settBin;

	@Column(name="SETT_CHGBCK_RET_REASON_CODE")
	private String settChgbckRetReasonCode;

	@Column(name="SETT_CURR_LOCAL")
	private String settCurrLocal;

	@Column(name="SETT_CURR_ORIG")
	private String settCurrOrig;

	@Temporal(TemporalType.DATE)
	@Column(name="SETT_DATE")
	private Date settDate;

	@Column(name="SETT_EMV_CVR_CDA_PERFORMED")
	private String settEmvCvrCdaPerformed;

	@Column(name="SETT_EMV_CVR_GO_ONLINE_NXT_TXN")
	private String settEmvCvrGoOnlineNxtTxn;

	@Column(name="SETT_EMV_CVR_ISS_AUTH_FAIL")
	private String settEmvCvrIssAuthFail;

	@Column(name="SETT_EMV_CVR_LOW_CUM_AMT_XCD")
	private String settEmvCvrLowCumAmtXcd;

	@Column(name="SETT_EMV_CVR_LOWER_CUM_AMT_XCD")
	private String settEmvCvrLowerCumAmtXcd;

	@Column(name="SETT_EMV_CVR_LOWER_TXNS_XCD")
	private String settEmvCvrLowerTxnsXcd;

	@Column(name="SETT_EMV_CVR_NO_ISSUER_AUTH")
	private String settEmvCvrNoIssuerAuth;

	@Column(name="SETT_EMV_CVR_OF_ATH_FL_PRV_TXN")
	private String settEmvCvrOfAthFlPrvTxn;

	@Column(name="SETT_EMV_CVR_OFF_AU_FAIL_PREV")
	private String settEmvCvrOffAuFailPrev;

	@Column(name="SETT_EMV_CVR_OFF_PIN_VERI_FAIL")
	private String settEmvCvrOffPinVeriFail;

	@Column(name="SETT_EMV_CVR_OFF_PIN_VERIFY")
	private String settEmvCvrOffPinVerify;

	@Column(name="SETT_EMV_CVR_OFFLINE_DDA")
	private String settEmvCvrOfflineDda;

	@Column(name="SETT_EMV_CVR_OFFLINE_PIN")
	private String settEmvCvrOfflinePin;

	@Column(name="SETT_EMV_CVR_OFFLINE_PIN_FAIL")
	private String settEmvCvrOfflinePinFail;

	@Column(name="SETT_EMV_CVR_PIN_RETRY_COUNT")
	private BigDecimal settEmvCvrPinRetryCount;

	@Column(name="SETT_EMV_CVR_PIN_RETRY_LIM_XCD")
	private String settEmvCvrPinRetryLimXcd;

	@Column(name="SETT_EMV_CVR_PIN_RETRY_LMT_XCD")
	private String settEmvCvrPinRetryLmtXcd;

	@Column(name="SETT_EMV_CVR_PREV_ISS_AU_FAIL")
	private String settEmvCvrPrevIssAuFail;

	@Column(name="SETT_EMV_CVR_PREV_TXN_INCMPLTE")
	private String settEmvCvrPrevTxnIncmplte;

	@Column(name="SETT_EMV_CVR_PREV_TXN_INCOMPL")
	private String settEmvCvrPrevTxnIncompl;

	@Column(name="SETT_EMV_CVR_SCPT_FL_PREV_TXN")
	private String settEmvCvrScptFlPrevTxn;

	@Column(name="SETT_EMV_CVR_SCR_COUNT_PREV_TX")
	private BigDecimal settEmvCvrScrCountPrevTx;

	@Column(name="SETT_EMV_CVR_SCR_FAIL_PREV_TXN")
	private String settEmvCvrScrFailPrevTxn;

	@Column(name="SETT_EMV_CVR_UNABLE_GO_ONLINE")
	private String settEmvCvrUnableGoOnline;

	@Column(name="SETT_EMV_CVR_UPP_OFF_CUM_XCD")
	private String settEmvCvrUppOffCumXcd;

	@Column(name="SETT_EMV_CVR_UPPER_CUM_AMT_XCD")
	private String settEmvCvrUpperCumAmtXcd;

	@Column(name="SETT_EMV_CVR_UPPER_TXNS_XCD")
	private String settEmvCvrUpperTxnsXcd;

	@Column(name="SETT_EMV_TVR_APP_NOT_YET_EFF")
	private String settEmvTvrAppNotYetEff;

	@Column(name="SETT_EMV_TVR_BAD_VERSIONS")
	private String settEmvTvrBadVersions;

	@Column(name="SETT_EMV_TVR_CARD_ON_EXC_FILE")
	private String settEmvTvrCardOnExcFile;

	@Column(name="SETT_EMV_TVR_CDA_FAILED")
	private String settEmvTvrCdaFailed;

	@Column(name="SETT_EMV_TVR_CRDHLDR_VRFY_FAIL")
	private String settEmvTvrCrdhldrVrfyFail;

	@Column(name="SETT_EMV_TVR_DDA_FAILED")
	private String settEmvTvrDdaFailed;

	@Column(name="SETT_EMV_TVR_DEFAULT_TDOL_USED")
	private String settEmvTvrDefaultTdolUsed;

	@Column(name="SETT_EMV_TVR_EXCD_LOW_CONS_LIM")
	private String settEmvTvrExcdLowConsLim;

	@Column(name="SETT_EMV_TVR_EXCD_UPP_CONS_LIM")
	private String settEmvTvrExcdUppConsLim;

	@Column(name="SETT_EMV_TVR_EXCEEDS_FLOOR_LIM")
	private String settEmvTvrExceedsFloorLim;

	@Column(name="SETT_EMV_TVR_EXCS_LWR_CONS_LIM")
	private String settEmvTvrExcsLwrConsLim;

	@Column(name="SETT_EMV_TVR_EXDS_UPR_CONS_LIM")
	private String settEmvTvrExdsUprConsLim;

	@Column(name="SETT_EMV_TVR_EXPIRED_APP")
	private String settEmvTvrExpiredApp;

	@Column(name="SETT_EMV_TVR_FAIL_POST_FINAL")
	private String settEmvTvrFailPostFinal;

	@Column(name="SETT_EMV_TVR_HOLDER_VERIF_FAIL")
	private String settEmvTvrHolderVerifFail;

	@Column(name="SETT_EMV_TVR_ICC_DATA_MISSING")
	private String settEmvTvrIccDataMissing;

	@Column(name="SETT_EMV_TVR_ISS_SCRIPT_FAIL")
	private String settEmvTvrIssScriptFail;

	@Column(name="SETT_EMV_TVR_ISSUER_AUTH_FAIL")
	private String settEmvTvrIssuerAuthFail;

	@Column(name="SETT_EMV_TVR_MERCH_FORWARD_ONL")
	private String settEmvTvrMerchForwardOnl;

	@Column(name="SETT_EMV_TVR_MERCH_FWD_ONLINE")
	private String settEmvTvrMerchFwdOnline;

	@Column(name="SETT_EMV_TVR_NEW_CARD")
	private String settEmvTvrNewCard;

	@Column(name="SETT_EMV_TVR_NO_WKING_PIN_PAD")
	private String settEmvTvrNoWkingPinPad;

	@Column(name="SETT_EMV_TVR_NO_WORKING_PAD")
	private String settEmvTvrNoWorkingPad;

	@Column(name="SETT_EMV_TVR_NOT_OFFLINE")
	private String settEmvTvrNotOffline;

	@Column(name="SETT_EMV_TVR_OFF_PIN_MAX_TRIES")
	private String settEmvTvrOffPinMaxTries;

	@Column(name="SETT_EMV_TVR_PIN_ENTERED")
	private String settEmvTvrPinEntered;

	@Column(name="SETT_EMV_TVR_PIN_NOT_ENTERED")
	private String settEmvTvrPinNotEntered;

	@Column(name="SETT_EMV_TVR_RANDOM_ONL_SEND")
	private String settEmvTvrRandomOnlSend;

	@Column(name="SETT_EMV_TVR_RANDOM_ONLINE_SND")
	private String settEmvTvrRandomOnlineSnd;

	@Column(name="SETT_EMV_TVR_SCT_FAIL_POST_FNL")
	private String settEmvTvrSctFailPostFnl;

	@Column(name="SETT_EMV_TVR_SDA_FAILED")
	private String settEmvTvrSdaFailed;

	@Column(name="SETT_EMV_TVR_SERVICE_UNALLOWED")
	private String settEmvTvrServiceUnallowed;

	@Column(name="SETT_EMV_TVR_UNRECOGNISED_CVM")
	private String settEmvTvrUnrecognisedCvm;

	@Column(name="SETT_ENTRY_MODE")
	private String settEntryMode;

	@Column(name="SETT_ID")
	private BigDecimal settId;

	@Temporal(TemporalType.DATE)
	@Column(name="SETT_LOAD_DATE")
	private Date settLoadDate;

	@Column(name="SETT_MCC")
	private BigDecimal settMcc;

	@Column(name="SETT_MER_CITY")
	private String settMerCity;

	@Column(name="SETT_MER_CODE")
	private String settMerCode;

	@Column(name="SETT_MER_COUNTRY")
	private String settMerCountry;

	@Column(name="SETT_MER_NAME")
	private String settMerName;

	@Column(name="SETT_MSG_TYPE")
	private String settMsgType;

	@Temporal(TemporalType.DATE)
	@Column(name="SETT_PURCHASE_DATE")
	private Date settPurchaseDate;

	@Column(name="SETT_TERM_ID")
	private String settTermId;

	@Column(name="SETT_TXNTYPE_1")
	private String settTxntype1;

	@Column(name="SETTLEMENT_MATCH_COLUMN1")
	private String settlementMatchColumn1;

	@Column(name="SETTLEMENT_MATCH_COLUMN2")
	private String settlementMatchColumn2;

	@Column(name="SETTLEMENT_MATCH_COLUMN3")
	private String settlementMatchColumn3;

	@Column(name="STATE_CODE")
	private String stateCode;

	@Column(name="TERM_CHIP_CAPABILITY")
	private String termChipCapability;

	@Column(name="TERM_ID")
	private String termId;

	@Column(name="TERM_PIN_CAPABILITY")
	private String termPinCapability;

	@Column(name="TERM_TYPE")
	private String termType;

	@Column(name="TRACK1_PRESENT")
	private BigDecimal track1Present;

	@Column(name="TRACK2_PRESENT")
	private BigDecimal track2Present;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;

	@Column(name="TXN_CATEGORY_CODE")
	private String txnCategoryCode;

	@Column(name="TXN_IND")
	private String txnInd;

	@Column(name="TXN_TOT_SCORE")
	private BigDecimal txnTotScore;

	@Column(name="TXNID_1")
	private String txnid1;

	@Column(name="TXNID_2")
	private String txnid2;

	@Column(name="UPDATE_MATCH_COLUMN1")
	private String updateMatchColumn1;

	@Column(name="UPDATE_MATCH_COLUMN2")
	private String updateMatchColumn2;

	@Column(name="UPDATE_MATCH_COLUMN3")
	private String updateMatchColumn3;

	@Column(name="VISOR_SCORE")
	private BigDecimal visorScore;

	public TxnCardTransaction() {
	}

	public TxnCardTransactionPK getId() {
		return this.id;
	}

	public void setId(TxnCardTransactionPK id) {
		this.id = id;
	}

	public String getAcquirerCountry() {
		return this.acquirerCountry;
	}

	public void setAcquirerCountry(String acquirerCountry) {
		this.acquirerCountry = acquirerCountry;
	}

	public String getAcquirerOrgCode() {
		return this.acquirerOrgCode;
	}

	public void setAcquirerOrgCode(String acquirerOrgCode) {
		this.acquirerOrgCode = acquirerOrgCode;
	}

	public String getActionResponseCode1() {
		return this.actionResponseCode1;
	}

	public void setActionResponseCode1(String actionResponseCode1) {
		this.actionResponseCode1 = actionResponseCode1;
	}

	public String getActionResponseCode2() {
		return this.actionResponseCode2;
	}

	public void setActionResponseCode2(String actionResponseCode2) {
		this.actionResponseCode2 = actionResponseCode2;
	}

	public String getActionResponseCode3() {
		return this.actionResponseCode3;
	}

	public void setActionResponseCode3(String actionResponseCode3) {
		this.actionResponseCode3 = actionResponseCode3;
	}

	public String getActionResponseCode4() {
		return this.actionResponseCode4;
	}

	public void setActionResponseCode4(String actionResponseCode4) {
		this.actionResponseCode4 = actionResponseCode4;
	}

	public String getAdvDetailCode() {
		return this.advDetailCode;
	}

	public void setAdvDetailCode(String advDetailCode) {
		this.advDetailCode = advDetailCode;
	}

	public String getAdvReasonCode() {
		return this.advReasonCode;
	}

	public void setAdvReasonCode(String advReasonCode) {
		this.advReasonCode = advReasonCode;
	}

	public BigDecimal getAmountLocal() {
		return this.amountLocal;
	}

	public void setAmountLocal(BigDecimal amountLocal) {
		this.amountLocal = amountLocal;
	}

	public BigDecimal getAmountOrig() {
		return this.amountOrig;
	}

	public void setAmountOrig(BigDecimal amountOrig) {
		this.amountOrig = amountOrig;
	}

	public BigDecimal getAmountPan() {
		return this.amountPan;
	}

	public void setAmountPan(BigDecimal amountPan) {
		this.amountPan = amountPan;
	}

	public String getAtcRuleCode() {
		return this.atcRuleCode;
	}

	public void setAtcRuleCode(String atcRuleCode) {
		this.atcRuleCode = atcRuleCode;
	}

	public String getAtcRuleCode1() {
		return this.atcRuleCode1;
	}

	public void setAtcRuleCode1(String atcRuleCode1) {
		this.atcRuleCode1 = atcRuleCode1;
	}

	public String getAtcRuleCode2() {
		return this.atcRuleCode2;
	}

	public void setAtcRuleCode2(String atcRuleCode2) {
		this.atcRuleCode2 = atcRuleCode2;
	}

	public String getAtcRuleCode3() {
		return this.atcRuleCode3;
	}

	public void setAtcRuleCode3(String atcRuleCode3) {
		this.atcRuleCode3 = atcRuleCode3;
	}

	public String getAtcRuleCode4() {
		return this.atcRuleCode4;
	}

	public void setAtcRuleCode4(String atcRuleCode4) {
		this.atcRuleCode4 = atcRuleCode4;
	}

	public String getAtmTransaction() {
		return this.atmTransaction;
	}

	public void setAtmTransaction(String atmTransaction) {
		this.atmTransaction = atmTransaction;
	}

	public String getAuthBatchId() {
		return this.authBatchId;
	}

	public void setAuthBatchId(String authBatchId) {
		this.authBatchId = authBatchId;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public BigDecimal getAuthConclusionCode() {
		return this.authConclusionCode;
	}

	public void setAuthConclusionCode(BigDecimal authConclusionCode) {
		this.authConclusionCode = authConclusionCode;
	}

	public BigDecimal getAuthCustomAmount1() {
		return this.authCustomAmount1;
	}

	public void setAuthCustomAmount1(BigDecimal authCustomAmount1) {
		this.authCustomAmount1 = authCustomAmount1;
	}

	public BigDecimal getAuthCustomAmount2() {
		return this.authCustomAmount2;
	}

	public void setAuthCustomAmount2(BigDecimal authCustomAmount2) {
		this.authCustomAmount2 = authCustomAmount2;
	}

	public BigDecimal getAuthCustomAmount3() {
		return this.authCustomAmount3;
	}

	public void setAuthCustomAmount3(BigDecimal authCustomAmount3) {
		this.authCustomAmount3 = authCustomAmount3;
	}

	public Date getAuthCustomDatetime1() {
		return this.authCustomDatetime1;
	}

	public void setAuthCustomDatetime1(Date authCustomDatetime1) {
		this.authCustomDatetime1 = authCustomDatetime1;
	}

	public Date getAuthCustomDatetime2() {
		return this.authCustomDatetime2;
	}

	public void setAuthCustomDatetime2(Date authCustomDatetime2) {
		this.authCustomDatetime2 = authCustomDatetime2;
	}

	public Date getAuthCustomDatetime3() {
		return this.authCustomDatetime3;
	}

	public void setAuthCustomDatetime3(Date authCustomDatetime3) {
		this.authCustomDatetime3 = authCustomDatetime3;
	}

	public String getAuthCustomFlag1() {
		return this.authCustomFlag1;
	}

	public void setAuthCustomFlag1(String authCustomFlag1) {
		this.authCustomFlag1 = authCustomFlag1;
	}

	public String getAuthCustomFlag2() {
		return this.authCustomFlag2;
	}

	public void setAuthCustomFlag2(String authCustomFlag2) {
		this.authCustomFlag2 = authCustomFlag2;
	}

	public String getAuthCustomFlag3() {
		return this.authCustomFlag3;
	}

	public void setAuthCustomFlag3(String authCustomFlag3) {
		this.authCustomFlag3 = authCustomFlag3;
	}

	public BigDecimal getAuthCustomInteger1() {
		return this.authCustomInteger1;
	}

	public void setAuthCustomInteger1(BigDecimal authCustomInteger1) {
		this.authCustomInteger1 = authCustomInteger1;
	}

	public BigDecimal getAuthCustomInteger2() {
		return this.authCustomInteger2;
	}

	public void setAuthCustomInteger2(BigDecimal authCustomInteger2) {
		this.authCustomInteger2 = authCustomInteger2;
	}

	public BigDecimal getAuthCustomInteger3() {
		return this.authCustomInteger3;
	}

	public void setAuthCustomInteger3(BigDecimal authCustomInteger3) {
		this.authCustomInteger3 = authCustomInteger3;
	}

	public String getAuthCustomText101() {
		return this.authCustomText101;
	}

	public void setAuthCustomText101(String authCustomText101) {
		this.authCustomText101 = authCustomText101;
	}

	public String getAuthCustomText102() {
		return this.authCustomText102;
	}

	public void setAuthCustomText102(String authCustomText102) {
		this.authCustomText102 = authCustomText102;
	}

	public String getAuthCustomText103() {
		return this.authCustomText103;
	}

	public void setAuthCustomText103(String authCustomText103) {
		this.authCustomText103 = authCustomText103;
	}

	public String getAuthCustomText501() {
		return this.authCustomText501;
	}

	public void setAuthCustomText501(String authCustomText501) {
		this.authCustomText501 = authCustomText501;
	}

	public String getAuthCustomText502() {
		return this.authCustomText502;
	}

	public void setAuthCustomText502(String authCustomText502) {
		this.authCustomText502 = authCustomText502;
	}

	public String getAuthCustomText503() {
		return this.authCustomText503;
	}

	public void setAuthCustomText503(String authCustomText503) {
		this.authCustomText503 = authCustomText503;
	}

	public String getAuthPhase() {
		return this.authPhase;
	}

	public void setAuthPhase(String authPhase) {
		this.authPhase = authPhase;
	}

	public String getAuthReliability() {
		return this.authReliability;
	}

	public void setAuthReliability(String authReliability) {
		this.authReliability = authReliability;
	}

	public String getAuthRuleOverride() {
		return this.authRuleOverride;
	}

	public void setAuthRuleOverride(String authRuleOverride) {
		this.authRuleOverride = authRuleOverride;
	}

	public String getAvsData() {
		return this.avsData;
	}

	public void setAvsData(String avsData) {
		this.avsData = avsData;
	}

	public String getAvsResult() {
		return this.avsResult;
	}

	public void setAvsResult(String avsResult) {
		this.avsResult = avsResult;
	}

	public String getBatchRuleDetails() {
		return this.batchRuleDetails;
	}

	public void setBatchRuleDetails(String batchRuleDetails) {
		this.batchRuleDetails = batchRuleDetails;
	}

	public Timestamp getBatchRuleProcessingEnd() {
		return this.batchRuleProcessingEnd;
	}

	public void setBatchRuleProcessingEnd(Timestamp batchRuleProcessingEnd) {
		this.batchRuleProcessingEnd = batchRuleProcessingEnd;
	}

	public Timestamp getBatchRulesTimedOut() {
		return this.batchRulesTimedOut;
	}

	public void setBatchRulesTimedOut(Timestamp batchRulesTimedOut) {
		this.batchRulesTimedOut = batchRulesTimedOut;
	}

	public String getBin() {
		return this.bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getBlockCode() {
		return this.blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public Date getBusinessDate() {
		return this.businessDate;
	}

	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	public BigDecimal getCardBrand() {
		return this.cardBrand;
	}

	public void setCardBrand(BigDecimal cardBrand) {
		this.cardBrand = cardBrand;
	}

	public String getCardExpiry() {
		return this.cardExpiry;
	}

	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public BigDecimal getCardOrigin() {
		return this.cardOrigin;
	}

	public void setCardOrigin(BigDecimal cardOrigin) {
		this.cardOrigin = cardOrigin;
	}

	public BigDecimal getCardSequenceNumber() {
		return this.cardSequenceNumber;
	}

	public void setCardSequenceNumber(BigDecimal cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public String getCardVerifyMethod() {
		return this.cardVerifyMethod;
	}

	public void setCardVerifyMethod(String cardVerifyMethod) {
		this.cardVerifyMethod = cardVerifyMethod;
	}

	public String getCardholderAuthentMethod() {
		return this.cardholderAuthentMethod;
	}

	public void setCardholderAuthentMethod(String cardholderAuthentMethod) {
		this.cardholderAuthentMethod = cardholderAuthentMethod;
	}

	public BigDecimal getCashbackAmount() {
		return this.cashbackAmount;
	}

	public void setCashbackAmount(BigDecimal cashbackAmount) {
		this.cashbackAmount = cashbackAmount;
	}

	public String getCashbackCurr() {
		return this.cashbackCurr;
	}

	public void setCashbackCurr(String cashbackCurr) {
		this.cashbackCurr = cashbackCurr;
	}

	public String getCavvUcafInd() {
		return this.cavvUcafInd;
	}

	public void setCavvUcafInd(String cavvUcafInd) {
		this.cavvUcafInd = cavvUcafInd;
	}

	public String getChargebackAcqReasonCode() {
		return this.chargebackAcqReasonCode;
	}

	public void setChargebackAcqReasonCode(String chargebackAcqReasonCode) {
		this.chargebackAcqReasonCode = chargebackAcqReasonCode;
	}

	public String getChargebackGcsReasonCode() {
		return this.chargebackGcsReasonCode;
	}

	public void setChargebackGcsReasonCode(String chargebackGcsReasonCode) {
		this.chargebackGcsReasonCode = chargebackGcsReasonCode;
	}

	public BigDecimal getChargebackPaymentAmount() {
		return this.chargebackPaymentAmount;
	}

	public void setChargebackPaymentAmount(BigDecimal chargebackPaymentAmount) {
		this.chargebackPaymentAmount = chargebackPaymentAmount;
	}

	public Date getChargebackPaymentDate() {
		return this.chargebackPaymentDate;
	}

	public void setChargebackPaymentDate(Date chargebackPaymentDate) {
		this.chargebackPaymentDate = chargebackPaymentDate;
	}

	public String getChipCardIndicator() {
		return this.chipCardIndicator;
	}

	public void setChipCardIndicator(String chipCardIndicator) {
		this.chipCardIndicator = chipCardIndicator;
	}

	public String getChipCondCode() {
		return this.chipCondCode;
	}

	public void setChipCondCode(String chipCondCode) {
		this.chipCondCode = chipCondCode;
	}

	public String getCollectionBlock() {
		return this.collectionBlock;
	}

	public void setCollectionBlock(String collectionBlock) {
		this.collectionBlock = collectionBlock;
	}

	public String getCollectionReason() {
		return this.collectionReason;
	}

	public void setCollectionReason(String collectionReason) {
		this.collectionReason = collectionReason;
	}

	public BigDecimal getConversion() {
		return this.conversion;
	}

	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}

	public String getCorrespondentName() {
		return this.correspondentName;
	}

	public void setCorrespondentName(String correspondentName) {
		this.correspondentName = correspondentName;
	}

	public String getCorrespondentRef() {
		return this.correspondentRef;
	}

	public void setCorrespondentRef(String correspondentRef) {
		this.correspondentRef = correspondentRef;
	}

	public BigDecimal getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getCreditLimitTemp() {
		return this.creditLimitTemp;
	}

	public void setCreditLimitTemp(BigDecimal creditLimitTemp) {
		this.creditLimitTemp = creditLimitTemp;
	}

	public Date getCreditLimitTempExp() {
		return this.creditLimitTempExp;
	}

	public void setCreditLimitTempExp(Date creditLimitTempExp) {
		this.creditLimitTempExp = creditLimitTempExp;
	}

	public String getCurrLocal() {
		return this.currLocal;
	}

	public void setCurrLocal(String currLocal) {
		this.currLocal = currLocal;
	}

	public String getCurrOrig() {
		return this.currOrig;
	}

	public void setCurrOrig(String currOrig) {
		this.currOrig = currOrig;
	}

	public String getCurrPan() {
		return this.currPan;
	}

	public void setCurrPan(String currPan) {
		this.currPan = currPan;
	}

	public String getCustStatus() {
		return this.custStatus;
	}

	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}

	public BigDecimal getCvv24dbcCheck() {
		return this.cvv24dbcCheck;
	}

	public void setCvv24dbcCheck(BigDecimal cvv24dbcCheck) {
		this.cvv24dbcCheck = cvv24dbcCheck;
	}

	public String getDeclinePhase() {
		return this.declinePhase;
	}

	public void setDeclinePhase(String declinePhase) {
		this.declinePhase = declinePhase;
	}

	public BigDecimal getDestinationAccountProxy() {
		return this.destinationAccountProxy;
	}

	public void setDestinationAccountProxy(BigDecimal destinationAccountProxy) {
		this.destinationAccountProxy = destinationAccountProxy;
	}

	public String getDestinationSortCode() {
		return this.destinationSortCode;
	}

	public void setDestinationSortCode(String destinationSortCode) {
		this.destinationSortCode = destinationSortCode;
	}

	public BigDecimal getDisputeId() {
		return this.disputeId;
	}

	public void setDisputeId(BigDecimal disputeId) {
		this.disputeId = disputeId;
	}

	public String getDomesticCountry() {
		return this.domesticCountry;
	}

	public void setDomesticCountry(String domesticCountry) {
		this.domesticCountry = domesticCountry;
	}

	public BigDecimal getDomesticTransactionType() {
		return this.domesticTransactionType;
	}

	public void setDomesticTransactionType(BigDecimal domesticTransactionType) {
		this.domesticTransactionType = domesticTransactionType;
	}

	public String getEcommInd() {
		return this.ecommInd;
	}

	public void setEcommInd(String ecommInd) {
		this.ecommInd = ecommInd;
	}

	public BigDecimal getEmvAmountOther() {
		return this.emvAmountOther;
	}

	public void setEmvAmountOther(BigDecimal emvAmountOther) {
		this.emvAmountOther = emvAmountOther;
	}

	public BigDecimal getEmvAtc() {
		return this.emvAtc;
	}

	public void setEmvAtc(BigDecimal emvAtc) {
		this.emvAtc = emvAtc;
	}

	public String getEmvChipCardStatus() {
		return this.emvChipCardStatus;
	}

	public void setEmvChipCardStatus(String emvChipCardStatus) {
		this.emvChipCardStatus = emvChipCardStatus;
	}

	public String getEmvChipEnabledCard() {
		return this.emvChipEnabledCard;
	}

	public void setEmvChipEnabledCard(String emvChipEnabledCard) {
		this.emvChipEnabledCard = emvChipEnabledCard;
	}

	public String getEmvContactlessEnabledCard() {
		return this.emvContactlessEnabledCard;
	}

	public void setEmvContactlessEnabledCard(String emvContactlessEnabledCard) {
		this.emvContactlessEnabledCard = emvContactlessEnabledCard;
	}

	public BigDecimal getEmvCryptogramAmountAuth() {
		return this.emvCryptogramAmountAuth;
	}

	public void setEmvCryptogramAmountAuth(BigDecimal emvCryptogramAmountAuth) {
		this.emvCryptogramAmountAuth = emvCryptogramAmountAuth;
	}

	public String getEmvCryptogramCheckStatus() {
		return this.emvCryptogramCheckStatus;
	}

	public void setEmvCryptogramCheckStatus(String emvCryptogramCheckStatus) {
		this.emvCryptogramCheckStatus = emvCryptogramCheckStatus;
	}

	public String getEmvCvmApplyCvrOnFail() {
		return this.emvCvmApplyCvrOnFail;
	}

	public void setEmvCvmApplyCvrOnFail(String emvCvmApplyCvrOnFail) {
		this.emvCvmApplyCvrOnFail = emvCvmApplyCvrOnFail;
	}

	public String getEmvCvmCardCaptureCap() {
		return this.emvCvmCardCaptureCap;
	}

	public void setEmvCvmCardCaptureCap(String emvCvmCardCaptureCap) {
		this.emvCvmCardCaptureCap = emvCvmCardCaptureCap;
	}

	public String getEmvCvmCardVerificRule() {
		return this.emvCvmCardVerificRule;
	}

	public void setEmvCvmCardVerificRule(String emvCvmCardVerificRule) {
		this.emvCvmCardVerificRule = emvCvmCardVerificRule;
	}

	public String getEmvCvmCondition() {
		return this.emvCvmCondition;
	}

	public void setEmvCvmCondition(String emvCvmCondition) {
		this.emvCvmCondition = emvCvmCondition;
	}

	public String getEmvCvmDdaCapability() {
		return this.emvCvmDdaCapability;
	}

	public void setEmvCvmDdaCapability(String emvCvmDdaCapability) {
		this.emvCvmDdaCapability = emvCvmDdaCapability;
	}

	public String getEmvCvmEncPinOffVerify() {
		return this.emvCvmEncPinOffVerify;
	}

	public void setEmvCvmEncPinOffVerify(String emvCvmEncPinOffVerify) {
		this.emvCvmEncPinOffVerify = emvCvmEncPinOffVerify;
	}

	public BigDecimal getEmvCvmEncPinOlVerifCap() {
		return this.emvCvmEncPinOlVerifCap;
	}

	public void setEmvCvmEncPinOlVerifCap(BigDecimal emvCvmEncPinOlVerifCap) {
		this.emvCvmEncPinOlVerifCap = emvCvmEncPinOlVerifCap;
	}

	public String getEmvCvmPlntxtPinIccVerif() {
		return this.emvCvmPlntxtPinIccVerif;
	}

	public void setEmvCvmPlntxtPinIccVerif(String emvCvmPlntxtPinIccVerif) {
		this.emvCvmPlntxtPinIccVerif = emvCvmPlntxtPinIccVerif;
	}

	public String getEmvCvmResult() {
		return this.emvCvmResult;
	}

	public void setEmvCvmResult(String emvCvmResult) {
		this.emvCvmResult = emvCvmResult;
	}

	public String getEmvCvmSignatureCapability() {
		return this.emvCvmSignatureCapability;
	}

	public void setEmvCvmSignatureCapability(String emvCvmSignatureCapability) {
		this.emvCvmSignatureCapability = emvCvmSignatureCapability;
	}

	public String getEmvCvmStatDataAuthCap() {
		return this.emvCvmStatDataAuthCap;
	}

	public void setEmvCvmStatDataAuthCap(String emvCvmStatDataAuthCap) {
		this.emvCvmStatDataAuthCap = emvCvmStatDataAuthCap;
	}

	public String getEmvCvrAacTcArqcRet1() {
		return this.emvCvrAacTcArqcRet1;
	}

	public void setEmvCvrAacTcArqcRet1(String emvCvrAacTcArqcRet1) {
		this.emvCvrAacTcArqcRet1 = emvCvrAacTcArqcRet1;
	}

	public String getEmvCvrAacTcArqcRet2() {
		return this.emvCvrAacTcArqcRet2;
	}

	public void setEmvCvrAacTcArqcRet2(String emvCvrAacTcArqcRet2) {
		this.emvCvrAacTcArqcRet2 = emvCvrAacTcArqcRet2;
	}

	public String getEmvCvrAppBlkPinTryXcd() {
		return this.emvCvrAppBlkPinTryXcd;
	}

	public void setEmvCvrAppBlkPinTryXcd(String emvCvrAppBlkPinTryXcd) {
		this.emvCvrAppBlkPinTryXcd = emvCvrAppBlkPinTryXcd;
	}

	public String getEmvCvrCdaPerformed() {
		return this.emvCvrCdaPerformed;
	}

	public void setEmvCvrCdaPerformed(String emvCvrCdaPerformed) {
		this.emvCvrCdaPerformed = emvCvrCdaPerformed;
	}

	public String getEmvCvrCiacCat3Skip() {
		return this.emvCvrCiacCat3Skip;
	}

	public void setEmvCvrCiacCat3Skip(String emvCvrCiacCat3Skip) {
		this.emvCvrCiacCat3Skip = emvCvrCiacCat3Skip;
	}

	public String getEmvCvrCryptogramTypeA() {
		return this.emvCvrCryptogramTypeA;
	}

	public void setEmvCvrCryptogramTypeA(String emvCvrCryptogramTypeA) {
		this.emvCvrCryptogramTypeA = emvCvrCryptogramTypeA;
	}

	public String getEmvCvrCryptogramTypeB() {
		return this.emvCvrCryptogramTypeB;
	}

	public void setEmvCvrCryptogramTypeB(String emvCvrCryptogramTypeB) {
		this.emvCvrCryptogramTypeB = emvCvrCryptogramTypeB;
	}

	public String getEmvCvrDdaAcGenRet1() {
		return this.emvCvrDdaAcGenRet1;
	}

	public void setEmvCvrDdaAcGenRet1(String emvCvrDdaAcGenRet1) {
		this.emvCvrDdaAcGenRet1 = emvCvrDdaAcGenRet1;
	}

	public String getEmvCvrDdaAcGenRet2() {
		return this.emvCvrDdaAcGenRet2;
	}

	public void setEmvCvrDdaAcGenRet2(String emvCvrDdaAcGenRet2) {
		this.emvCvrDdaAcGenRet2 = emvCvrDdaAcGenRet2;
	}

	public String getEmvCvrDdaPerformed() {
		return this.emvCvrDdaPerformed;
	}

	public void setEmvCvrDdaPerformed(String emvCvrDdaPerformed) {
		this.emvCvrDdaPerformed = emvCvrDdaPerformed;
	}

	public String getEmvCvrDeclOfflnSdaFail() {
		return this.emvCvrDeclOfflnSdaFail;
	}

	public void setEmvCvrDeclOfflnSdaFail(String emvCvrDeclOfflnSdaFail) {
		this.emvCvrDeclOfflnSdaFail = emvCvrDeclOfflnSdaFail;
	}

	public String getEmvCvrDomOrIntTxn() {
		return this.emvCvrDomOrIntTxn;
	}

	public void setEmvCvrDomOrIntTxn(String emvCvrDomOrIntTxn) {
		this.emvCvrDomOrIntTxn = emvCvrDomOrIntTxn;
	}

	public String getEmvCvrErrOffPinOk() {
		return this.emvCvrErrOffPinOk;
	}

	public void setEmvCvrErrOffPinOk(String emvCvrErrOffPinOk) {
		this.emvCvrErrOffPinOk = emvCvrErrOffPinOk;
	}

	public String getEmvCvrExceedVelCheck() {
		return this.emvCvrExceedVelCheck;
	}

	public void setEmvCvrExceedVelCheck(String emvCvrExceedVelCheck) {
		this.emvCvrExceedVelCheck = emvCvrExceedVelCheck;
	}

	public String getEmvCvrGoOnlineNextTxn() {
		return this.emvCvrGoOnlineNextTxn;
	}

	public void setEmvCvrGoOnlineNextTxn(String emvCvrGoOnlineNextTxn) {
		this.emvCvrGoOnlineNextTxn = emvCvrGoOnlineNextTxn;
	}

	public String getEmvCvrIssAuthFail() {
		return this.emvCvrIssAuthFail;
	}

	public void setEmvCvrIssAuthFail(String emvCvrIssAuthFail) {
		this.emvCvrIssAuthFail = emvCvrIssAuthFail;
	}

	public String getEmvCvrIssAuthFailLstonl() {
		return this.emvCvrIssAuthFailLstonl;
	}

	public void setEmvCvrIssAuthFailLstonl(String emvCvrIssAuthFailLstonl) {
		this.emvCvrIssAuthFailLstonl = emvCvrIssAuthFailLstonl;
	}

	public String getEmvCvrLowerCumAmtXcd() {
		return this.emvCvrLowerCumAmtXcd;
	}

	public void setEmvCvrLowerCumAmtXcd(String emvCvrLowerCumAmtXcd) {
		this.emvCvrLowerCumAmtXcd = emvCvrLowerCumAmtXcd;
	}

	public String getEmvCvrLowerTxnsXcd() {
		return this.emvCvrLowerTxnsXcd;
	}

	public void setEmvCvrLowerTxnsXcd(String emvCvrLowerTxnsXcd) {
		this.emvCvrLowerTxnsXcd = emvCvrLowerTxnsXcd;
	}

	public String getEmvCvrMtchFndAddnlChkTbl() {
		return this.emvCvrMtchFndAddnlChkTbl;
	}

	public void setEmvCvrMtchFndAddnlChkTbl(String emvCvrMtchFndAddnlChkTbl) {
		this.emvCvrMtchFndAddnlChkTbl = emvCvrMtchFndAddnlChkTbl;
	}

	public String getEmvCvrNewCardFlag() {
		return this.emvCvrNewCardFlag;
	}

	public void setEmvCvrNewCardFlag(String emvCvrNewCardFlag) {
		this.emvCvrNewCardFlag = emvCvrNewCardFlag;
	}

	public String getEmvCvrNoIssuerAuth() {
		return this.emvCvrNoIssuerAuth;
	}

	public void setEmvCvrNoIssuerAuth(String emvCvrNoIssuerAuth) {
		this.emvCvrNoIssuerAuth = emvCvrNoIssuerAuth;
	}

	public String getEmvCvrOffAuthFailPrevTxn() {
		return this.emvCvrOffAuthFailPrevTxn;
	}

	public void setEmvCvrOffAuthFailPrevTxn(String emvCvrOffAuthFailPrevTxn) {
		this.emvCvrOffAuthFailPrevTxn = emvCvrOffAuthFailPrevTxn;
	}

	public String getEmvCvrOffDdaLfail() {
		return this.emvCvrOffDdaLfail;
	}

	public void setEmvCvrOffDdaLfail(String emvCvrOffDdaLfail) {
		this.emvCvrOffDdaLfail = emvCvrOffDdaLfail;
	}

	public String getEmvCvrOfflineDda() {
		return this.emvCvrOfflineDda;
	}

	public void setEmvCvrOfflineDda(String emvCvrOfflineDda) {
		this.emvCvrOfflineDda = emvCvrOfflineDda;
	}

	public String getEmvCvrOfflinePinVerifFail() {
		return this.emvCvrOfflinePinVerifFail;
	}

	public void setEmvCvrOfflinePinVerifFail(String emvCvrOfflinePinVerifFail) {
		this.emvCvrOfflinePinVerifFail = emvCvrOfflinePinVerifFail;
	}

	public String getEmvCvrOfflinePinVerify() {
		return this.emvCvrOfflinePinVerify;
	}

	public void setEmvCvrOfflinePinVerify(String emvCvrOfflinePinVerify) {
		this.emvCvrOfflinePinVerify = emvCvrOfflinePinVerify;
	}

	public String getEmvCvrOnlineUnavailable() {
		return this.emvCvrOnlineUnavailable;
	}

	public void setEmvCvrOnlineUnavailable(String emvCvrOnlineUnavailable) {
		this.emvCvrOnlineUnavailable = emvCvrOnlineUnavailable;
	}

	public BigDecimal getEmvCvrPinRetryCount() {
		return this.emvCvrPinRetryCount;
	}

	public void setEmvCvrPinRetryCount(BigDecimal emvCvrPinRetryCount) {
		this.emvCvrPinRetryCount = emvCvrPinRetryCount;
	}

	public String getEmvCvrPinRetryLimitXcd() {
		return this.emvCvrPinRetryLimitXcd;
	}

	public void setEmvCvrPinRetryLimitXcd(String emvCvrPinRetryLimitXcd) {
		this.emvCvrPinRetryLimitXcd = emvCvrPinRetryLimitXcd;
	}

	public String getEmvCvrPrevIssuerAuthFail() {
		return this.emvCvrPrevIssuerAuthFail;
	}

	public void setEmvCvrPrevIssuerAuthFail(String emvCvrPrevIssuerAuthFail) {
		this.emvCvrPrevIssuerAuthFail = emvCvrPrevIssuerAuthFail;
	}

	public String getEmvCvrPrevTxnIncomplete() {
		return this.emvCvrPrevTxnIncomplete;
	}

	public void setEmvCvrPrevTxnIncomplete(String emvCvrPrevTxnIncomplete) {
		this.emvCvrPrevTxnIncomplete = emvCvrPrevTxnIncomplete;
	}

	public String getEmvCvrPtlExceeded() {
		return this.emvCvrPtlExceeded;
	}

	public void setEmvCvrPtlExceeded(String emvCvrPtlExceeded) {
		this.emvCvrPtlExceeded = emvCvrPtlExceeded;
	}

	public BigDecimal getEmvCvrScriptCountPrevTxn() {
		return this.emvCvrScriptCountPrevTxn;
	}

	public void setEmvCvrScriptCountPrevTxn(BigDecimal emvCvrScriptCountPrevTxn) {
		this.emvCvrScriptCountPrevTxn = emvCvrScriptCountPrevTxn;
	}

	public String getEmvCvrScriptFailPrevTxn() {
		return this.emvCvrScriptFailPrevTxn;
	}

	public void setEmvCvrScriptFailPrevTxn(String emvCvrScriptFailPrevTxn) {
		this.emvCvrScriptFailPrevTxn = emvCvrScriptFailPrevTxn;
	}

	public String getEmvCvrScriptReceived() {
		return this.emvCvrScriptReceived;
	}

	public void setEmvCvrScriptReceived(String emvCvrScriptReceived) {
		this.emvCvrScriptReceived = emvCvrScriptReceived;
	}

	public String getEmvCvrUnableGoOnline() {
		return this.emvCvrUnableGoOnline;
	}

	public void setEmvCvrUnableGoOnline(String emvCvrUnableGoOnline) {
		this.emvCvrUnableGoOnline = emvCvrUnableGoOnline;
	}

	public String getEmvCvrUpperCumAmtXcd() {
		return this.emvCvrUpperCumAmtXcd;
	}

	public void setEmvCvrUpperCumAmtXcd(String emvCvrUpperCumAmtXcd) {
		this.emvCvrUpperCumAmtXcd = emvCvrUpperCumAmtXcd;
	}

	public String getEmvCvrUpperTxnsXcd() {
		return this.emvCvrUpperTxnsXcd;
	}

	public void setEmvCvrUpperTxnsXcd(String emvCvrUpperTxnsXcd) {
		this.emvCvrUpperTxnsXcd = emvCvrUpperTxnsXcd;
	}

	public String getEmvMcArcAppOnlineTxn() {
		return this.emvMcArcAppOnlineTxn;
	}

	public void setEmvMcArcAppOnlineTxn(String emvMcArcAppOnlineTxn) {
		this.emvMcArcAppOnlineTxn = emvMcArcAppOnlineTxn;
	}

	public String getEmvMcArcSetOnlNtxn() {
		return this.emvMcArcSetOnlNtxn;
	}

	public void setEmvMcArcSetOnlNtxn(String emvMcArcSetOnlNtxn) {
		this.emvMcArcSetOnlNtxn = emvMcArcSetOnlNtxn;
	}

	public String getEmvMcArcUpdCounters() {
		return this.emvMcArcUpdCounters;
	}

	public void setEmvMcArcUpdCounters(String emvMcArcUpdCounters) {
		this.emvMcArcUpdCounters = emvMcArcUpdCounters;
	}

	public String getEmvMcArcUpdPinTrycnt() {
		return this.emvMcArcUpdPinTrycnt;
	}

	public void setEmvMcArcUpdPinTrycnt(String emvMcArcUpdPinTrycnt) {
		this.emvMcArcUpdPinTrycnt = emvMcArcUpdPinTrycnt;
	}

	public String getEmvPreferOfflineVerify() {
		return this.emvPreferOfflineVerify;
	}

	public void setEmvPreferOfflineVerify(String emvPreferOfflineVerify) {
		this.emvPreferOfflineVerify = emvPreferOfflineVerify;
	}

	public String getEmvTcIc() {
		return this.emvTcIc;
	}

	public void setEmvTcIc(String emvTcIc) {
		this.emvTcIc = emvTcIc;
	}

	public String getEmvTcKeyEntry() {
		return this.emvTcKeyEntry;
	}

	public void setEmvTcKeyEntry(String emvTcKeyEntry) {
		this.emvTcKeyEntry = emvTcKeyEntry;
	}

	public String getEmvTcMagStripe() {
		return this.emvTcMagStripe;
	}

	public void setEmvTcMagStripe(String emvTcMagStripe) {
		this.emvTcMagStripe = emvTcMagStripe;
	}

	public String getEmvTermEntryCapability() {
		return this.emvTermEntryCapability;
	}

	public void setEmvTermEntryCapability(String emvTermEntryCapability) {
		this.emvTermEntryCapability = emvTermEntryCapability;
	}

	public String getEmvTerminalCountryCode() {
		return this.emvTerminalCountryCode;
	}

	public void setEmvTerminalCountryCode(String emvTerminalCountryCode) {
		this.emvTerminalCountryCode = emvTerminalCountryCode;
	}

	public BigDecimal getEmvTerminalType() {
		return this.emvTerminalType;
	}

	public void setEmvTerminalType(BigDecimal emvTerminalType) {
		this.emvTerminalType = emvTerminalType;
	}

	public Date getEmvTransactionDate() {
		return this.emvTransactionDate;
	}

	public void setEmvTransactionDate(Date emvTransactionDate) {
		this.emvTransactionDate = emvTransactionDate;
	}

	public String getEmvTransactionType() {
		return this.emvTransactionType;
	}

	public void setEmvTransactionType(String emvTransactionType) {
		this.emvTransactionType = emvTransactionType;
	}

	public String getEmvTvrAppNotYetEff() {
		return this.emvTvrAppNotYetEff;
	}

	public void setEmvTvrAppNotYetEff(String emvTvrAppNotYetEff) {
		this.emvTvrAppNotYetEff = emvTvrAppNotYetEff;
	}

	public String getEmvTvrBadVersions() {
		return this.emvTvrBadVersions;
	}

	public void setEmvTvrBadVersions(String emvTvrBadVersions) {
		this.emvTvrBadVersions = emvTvrBadVersions;
	}

	public String getEmvTvrCardOnExcFile() {
		return this.emvTvrCardOnExcFile;
	}

	public void setEmvTvrCardOnExcFile(String emvTvrCardOnExcFile) {
		this.emvTvrCardOnExcFile = emvTvrCardOnExcFile;
	}

	public String getEmvTvrCardholderVerifyFail() {
		return this.emvTvrCardholderVerifyFail;
	}

	public void setEmvTvrCardholderVerifyFail(String emvTvrCardholderVerifyFail) {
		this.emvTvrCardholderVerifyFail = emvTvrCardholderVerifyFail;
	}

	public String getEmvTvrCdaFailed() {
		return this.emvTvrCdaFailed;
	}

	public void setEmvTvrCdaFailed(String emvTvrCdaFailed) {
		this.emvTvrCdaFailed = emvTvrCdaFailed;
	}

	public String getEmvTvrDdaFailed() {
		return this.emvTvrDdaFailed;
	}

	public void setEmvTvrDdaFailed(String emvTvrDdaFailed) {
		this.emvTvrDdaFailed = emvTvrDdaFailed;
	}

	public String getEmvTvrDefaultTdolUsed() {
		return this.emvTvrDefaultTdolUsed;
	}

	public void setEmvTvrDefaultTdolUsed(String emvTvrDefaultTdolUsed) {
		this.emvTvrDefaultTdolUsed = emvTvrDefaultTdolUsed;
	}

	public String getEmvTvrExceedsFloorLim() {
		return this.emvTvrExceedsFloorLim;
	}

	public void setEmvTvrExceedsFloorLim(String emvTvrExceedsFloorLim) {
		this.emvTvrExceedsFloorLim = emvTvrExceedsFloorLim;
	}

	public String getEmvTvrExceedsLowerConsLim() {
		return this.emvTvrExceedsLowerConsLim;
	}

	public void setEmvTvrExceedsLowerConsLim(String emvTvrExceedsLowerConsLim) {
		this.emvTvrExceedsLowerConsLim = emvTvrExceedsLowerConsLim;
	}

	public String getEmvTvrExceedsUpperConsLim() {
		return this.emvTvrExceedsUpperConsLim;
	}

	public void setEmvTvrExceedsUpperConsLim(String emvTvrExceedsUpperConsLim) {
		this.emvTvrExceedsUpperConsLim = emvTvrExceedsUpperConsLim;
	}

	public String getEmvTvrExpiredApp() {
		return this.emvTvrExpiredApp;
	}

	public void setEmvTvrExpiredApp(String emvTvrExpiredApp) {
		this.emvTvrExpiredApp = emvTvrExpiredApp;
	}

	public String getEmvTvrIccDataMissing() {
		return this.emvTvrIccDataMissing;
	}

	public void setEmvTvrIccDataMissing(String emvTvrIccDataMissing) {
		this.emvTvrIccDataMissing = emvTvrIccDataMissing;
	}

	public String getEmvTvrIssScriptFail() {
		return this.emvTvrIssScriptFail;
	}

	public void setEmvTvrIssScriptFail(String emvTvrIssScriptFail) {
		this.emvTvrIssScriptFail = emvTvrIssScriptFail;
	}

	public String getEmvTvrIssuerAuthFailed() {
		return this.emvTvrIssuerAuthFailed;
	}

	public void setEmvTvrIssuerAuthFailed(String emvTvrIssuerAuthFailed) {
		this.emvTvrIssuerAuthFailed = emvTvrIssuerAuthFailed;
	}

	public String getEmvTvrMerchForwardOnline() {
		return this.emvTvrMerchForwardOnline;
	}

	public void setEmvTvrMerchForwardOnline(String emvTvrMerchForwardOnline) {
		this.emvTvrMerchForwardOnline = emvTvrMerchForwardOnline;
	}

	public String getEmvTvrNewCard() {
		return this.emvTvrNewCard;
	}

	public void setEmvTvrNewCard(String emvTvrNewCard) {
		this.emvTvrNewCard = emvTvrNewCard;
	}

	public String getEmvTvrNoWorkingPinPad() {
		return this.emvTvrNoWorkingPinPad;
	}

	public void setEmvTvrNoWorkingPinPad(String emvTvrNoWorkingPinPad) {
		this.emvTvrNoWorkingPinPad = emvTvrNoWorkingPinPad;
	}

	public String getEmvTvrNotOffline() {
		return this.emvTvrNotOffline;
	}

	public void setEmvTvrNotOffline(String emvTvrNotOffline) {
		this.emvTvrNotOffline = emvTvrNotOffline;
	}

	public String getEmvTvrOfflinePinMaxTries() {
		return this.emvTvrOfflinePinMaxTries;
	}

	public void setEmvTvrOfflinePinMaxTries(String emvTvrOfflinePinMaxTries) {
		this.emvTvrOfflinePinMaxTries = emvTvrOfflinePinMaxTries;
	}

	public String getEmvTvrPinEntered() {
		return this.emvTvrPinEntered;
	}

	public void setEmvTvrPinEntered(String emvTvrPinEntered) {
		this.emvTvrPinEntered = emvTvrPinEntered;
	}

	public String getEmvTvrPinNotEntered() {
		return this.emvTvrPinNotEntered;
	}

	public void setEmvTvrPinNotEntered(String emvTvrPinNotEntered) {
		this.emvTvrPinNotEntered = emvTvrPinNotEntered;
	}

	public String getEmvTvrRandomOnlineSend() {
		return this.emvTvrRandomOnlineSend;
	}

	public void setEmvTvrRandomOnlineSend(String emvTvrRandomOnlineSend) {
		this.emvTvrRandomOnlineSend = emvTvrRandomOnlineSend;
	}

	public String getEmvTvrScriptFailPostFinal() {
		return this.emvTvrScriptFailPostFinal;
	}

	public void setEmvTvrScriptFailPostFinal(String emvTvrScriptFailPostFinal) {
		this.emvTvrScriptFailPostFinal = emvTvrScriptFailPostFinal;
	}

	public String getEmvTvrSdaFailed() {
		return this.emvTvrSdaFailed;
	}

	public void setEmvTvrSdaFailed(String emvTvrSdaFailed) {
		this.emvTvrSdaFailed = emvTvrSdaFailed;
	}

	public String getEmvTvrServiceUnallowed() {
		return this.emvTvrServiceUnallowed;
	}

	public void setEmvTvrServiceUnallowed(String emvTvrServiceUnallowed) {
		this.emvTvrServiceUnallowed = emvTvrServiceUnallowed;
	}

	public String getEmvTvrUnrecognisedCvm() {
		return this.emvTvrUnrecognisedCvm;
	}

	public void setEmvTvrUnrecognisedCvm(String emvTvrUnrecognisedCvm) {
		this.emvTvrUnrecognisedCvm = emvTvrUnrecognisedCvm;
	}

	public String getEmvTxnCurrencyCode() {
		return this.emvTxnCurrencyCode;
	}

	public void setEmvTxnCurrencyCode(String emvTxnCurrencyCode) {
		this.emvTxnCurrencyCode = emvTxnCurrencyCode;
	}

	public BigDecimal getEnterFacitTiming() {
		return this.enterFacitTiming;
	}

	public void setEnterFacitTiming(BigDecimal enterFacitTiming) {
		this.enterFacitTiming = enterFacitTiming;
	}

	public String getEntryMode() {
		return this.entryMode;
	}

	public void setEntryMode(String entryMode) {
		this.entryMode = entryMode;
	}

	public String getExtIsBillable() {
		return this.extIsBillable;
	}

	public void setExtIsBillable(String extIsBillable) {
		this.extIsBillable = extIsBillable;
	}

	public Date getExtractDate() {
		return this.extractDate;
	}

	public void setExtractDate(Date extractDate) {
		this.extractDate = extractDate;
	}

	public String getF604Reserved() {
		return this.f604Reserved;
	}

	public void setF604Reserved(String f604Reserved) {
		this.f604Reserved = f604Reserved;
	}

	public String getFileBatchId() {
		return this.fileBatchId;
	}

	public void setFileBatchId(String fileBatchId) {
		this.fileBatchId = fileBatchId;
	}

	public BigDecimal getFileSequenceNumber() {
		return this.fileSequenceNumber;
	}

	public void setFileSequenceNumber(BigDecimal fileSequenceNumber) {
		this.fileSequenceNumber = fileSequenceNumber;
	}

	public String getFractalsResponseOverride() {
		return this.fractalsResponseOverride;
	}

	public void setFractalsResponseOverride(String fractalsResponseOverride) {
		this.fractalsResponseOverride = fractalsResponseOverride;
	}

	public String getFraudMatchColumn1() {
		return this.fraudMatchColumn1;
	}

	public void setFraudMatchColumn1(String fraudMatchColumn1) {
		this.fraudMatchColumn1 = fraudMatchColumn1;
	}

	public String getFraudMatchColumn2() {
		return this.fraudMatchColumn2;
	}

	public void setFraudMatchColumn2(String fraudMatchColumn2) {
		this.fraudMatchColumn2 = fraudMatchColumn2;
	}

	public String getFraudMatchColumn3() {
		return this.fraudMatchColumn3;
	}

	public void setFraudMatchColumn3(String fraudMatchColumn3) {
		this.fraudMatchColumn3 = fraudMatchColumn3;
	}

	public String getGridMatch() {
		return this.gridMatch;
	}

	public void setGridMatch(String gridMatch) {
		this.gridMatch = gridMatch;
	}

	public BigDecimal getHeaderSequence() {
		return this.headerSequence;
	}

	public void setHeaderSequence(BigDecimal headerSequence) {
		this.headerSequence = headerSequence;
	}

	public String getIbanBankId() {
		return this.ibanBankId;
	}

	public void setIbanBankId(String ibanBankId) {
		this.ibanBankId = ibanBankId;
	}

	public String getIbanCheckDigits() {
		return this.ibanCheckDigits;
	}

	public void setIbanCheckDigits(String ibanCheckDigits) {
		this.ibanCheckDigits = ibanCheckDigits;
	}

	public String getIbanCountryCode() {
		return this.ibanCountryCode;
	}

	public void setIbanCountryCode(String ibanCountryCode) {
		this.ibanCountryCode = ibanCountryCode;
	}

	public String getIssuerBin() {
		return this.issuerBin;
	}

	public void setIssuerBin(String issuerBin) {
		this.issuerBin = issuerBin;
	}

	public String getIssuerOrgCode() {
		return this.issuerOrgCode;
	}

	public void setIssuerOrgCode(String issuerOrgCode) {
		this.issuerOrgCode = issuerOrgCode;
	}

	public BigDecimal getIssuingBank() {
		return this.issuingBank;
	}

	public void setIssuingBank(BigDecimal issuingBank) {
		this.issuingBank = issuingBank;
	}

	public Timestamp getLoadDate() {
		return this.loadDate;
	}

	public void setLoadDate(Timestamp loadDate) {
		this.loadDate = loadDate;
	}

	public String getMc619Reserved() {
		return this.mc619Reserved;
	}

	public void setMc619Reserved(String mc619Reserved) {
		this.mc619Reserved = mc619Reserved;
	}

	public String getMcCatLevel() {
		return this.mcCatLevel;
	}

	public void setMcCatLevel(String mcCatLevel) {
		this.mcCatLevel = mcCatLevel;
	}

	public String getMcCryptogramInd() {
		return this.mcCryptogramInd;
	}

	public void setMcCryptogramInd(String mcCryptogramInd) {
		this.mcCryptogramInd = mcCryptogramInd;
	}

	public String getMcF612Reserved() {
		return this.mcF612Reserved;
	}

	public void setMcF612Reserved(String mcF612Reserved) {
		this.mcF612Reserved = mcF612Reserved;
	}

	public String getMcPosAuthLifeCycle() {
		return this.mcPosAuthLifeCycle;
	}

	public void setMcPosAuthLifeCycle(String mcPosAuthLifeCycle) {
		this.mcPosAuthLifeCycle = mcPosAuthLifeCycle;
	}

	public String getMcPosCardCaptCapability() {
		return this.mcPosCardCaptCapability;
	}

	public void setMcPosCardCaptCapability(String mcPosCardCaptCapability) {
		this.mcPosCardCaptCapability = mcPosCardCaptCapability;
	}

	public String getMcPosCardPresence() {
		return this.mcPosCardPresence;
	}

	public void setMcPosCardPresence(String mcPosCardPresence) {
		this.mcPosCardPresence = mcPosCardPresence;
	}

	public String getMcPosCardholderPresence() {
		return this.mcPosCardholderPresence;
	}

	public void setMcPosCardholderPresence(String mcPosCardholderPresence) {
		this.mcPosCardholderPresence = mcPosCardholderPresence;
	}

	public String getMcPosCountryCode() {
		return this.mcPosCountryCode;
	}

	public void setMcPosCountryCode(String mcPosCountryCode) {
		this.mcPosCountryCode = mcPosCountryCode;
	}

	public String getMcPosPostalCode() {
		return this.mcPosPostalCode;
	}

	public void setMcPosPostalCode(String mcPosPostalCode) {
		this.mcPosPostalCode = mcPosPostalCode;
	}

	public String getMcPosTerminalAttendance() {
		return this.mcPosTerminalAttendance;
	}

	public void setMcPosTerminalAttendance(String mcPosTerminalAttendance) {
		this.mcPosTerminalAttendance = mcPosTerminalAttendance;
	}

	public String getMcPosTerminalLocation() {
		return this.mcPosTerminalLocation;
	}

	public void setMcPosTerminalLocation(String mcPosTerminalLocation) {
		this.mcPosTerminalLocation = mcPosTerminalLocation;
	}

	public String getMcPosTransactionSecurity() {
		return this.mcPosTransactionSecurity;
	}

	public void setMcPosTransactionSecurity(String mcPosTransactionSecurity) {
		this.mcPosTransactionSecurity = mcPosTransactionSecurity;
	}

	public String getMcPosTransactionStatus() {
		return this.mcPosTransactionStatus;
	}

	public void setMcPosTransactionStatus(String mcPosTransactionStatus) {
		this.mcPosTransactionStatus = mcPosTransactionStatus;
	}

	public String getMcTermInputCapability() {
		return this.mcTermInputCapability;
	}

	public void setMcTermInputCapability(String mcTermInputCapability) {
		this.mcTermInputCapability = mcTermInputCapability;
	}

	public String getMcTxnEncrypted() {
		return this.mcTxnEncrypted;
	}

	public void setMcTxnEncrypted(String mcTxnEncrypted) {
		this.mcTxnEncrypted = mcTxnEncrypted;
	}

	public String getMcUcafInd() {
		return this.mcUcafInd;
	}

	public void setMcUcafInd(String mcUcafInd) {
		this.mcUcafInd = mcUcafInd;
	}

	public BigDecimal getMcc() {
		return this.mcc;
	}

	public void setMcc(BigDecimal mcc) {
		this.mcc = mcc;
	}

	public String getMciDeviceType() {
		return this.mciDeviceType;
	}

	public void setMciDeviceType(String mciDeviceType) {
		this.mciDeviceType = mciDeviceType;
	}

	public BigDecimal getMciFinalAuthIndicator() {
		return this.mciFinalAuthIndicator;
	}

	public void setMciFinalAuthIndicator(BigDecimal mciFinalAuthIndicator) {
		this.mciFinalAuthIndicator = mciFinalAuthIndicator;
	}

	public String getMciPanMappingInfo() {
		return this.mciPanMappingInfo;
	}

	public void setMciPanMappingInfo(String mciPanMappingInfo) {
		this.mciPanMappingInfo = mciPanMappingInfo;
	}

	public String getMciProcessorIca() {
		return this.mciProcessorIca;
	}

	public void setMciProcessorIca(String mciProcessorIca) {
		this.mciProcessorIca = mciProcessorIca;
	}

	public String getMerCity() {
		return this.merCity;
	}

	public void setMerCity(String merCity) {
		this.merCity = merCity;
	}

	public String getMerCode() {
		return this.merCode;
	}

	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}

	public String getMerCountry() {
		return this.merCountry;
	}

	public void setMerCountry(String merCountry) {
		this.merCountry = merCountry;
	}

	public String getMerGroup() {
		return this.merGroup;
	}

	public void setMerGroup(String merGroup) {
		this.merGroup = merGroup;
	}

	public String getMerName() {
		return this.merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getMerRegionCode() {
		return this.merRegionCode;
	}

	public void setMerRegionCode(String merRegionCode) {
		this.merRegionCode = merRegionCode;
	}

	public Date getMerTxnDate() {
		return this.merTxnDate;
	}

	public void setMerTxnDate(Date merTxnDate) {
		this.merTxnDate = merTxnDate;
	}

	public String getMerchantOrgCode() {
		return this.merchantOrgCode;
	}

	public void setMerchantOrgCode(String merchantOrgCode) {
		this.merchantOrgCode = merchantOrgCode;
	}

	public String getMiniStandinFlag() {
		return this.miniStandinFlag;
	}

	public void setMiniStandinFlag(String miniStandinFlag) {
		this.miniStandinFlag = miniStandinFlag;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
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

	public BigDecimal getOpenToBuy() {
		return this.openToBuy;
	}

	public void setOpenToBuy(BigDecimal openToBuy) {
		this.openToBuy = openToBuy;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOriginalReplyCode() {
		return this.originalReplyCode;
	}

	public void setOriginalReplyCode(String originalReplyCode) {
		this.originalReplyCode = originalReplyCode;
	}

	public Date getOriginalTxnDate() {
		return this.originalTxnDate;
	}

	public void setOriginalTxnDate(Date originalTxnDate) {
		this.originalTxnDate = originalTxnDate;
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

	public BigDecimal getPanConfBal() {
		return this.panConfBal;
	}

	public void setPanConfBal(BigDecimal panConfBal) {
		this.panConfBal = panConfBal;
	}

	public BigDecimal getPanPendTxns() {
		return this.panPendTxns;
	}

	public void setPanPendTxns(BigDecimal panPendTxns) {
		this.panPendTxns = panPendTxns;
	}

	public String getPanStatus() {
		return this.panStatus;
	}

	public void setPanStatus(String panStatus) {
		this.panStatus = panStatus;
	}

	public BigDecimal getPanTestTxn() {
		return this.panTestTxn;
	}

	public void setPanTestTxn(BigDecimal panTestTxn) {
		this.panTestTxn = panTestTxn;
	}

	public BigDecimal getParentAccount() {
		return this.parentAccount;
	}

	public void setParentAccount(BigDecimal parentAccount) {
		this.parentAccount = parentAccount;
	}

	public String getParentAccountType() {
		return this.parentAccountType;
	}

	public void setParentAccountType(String parentAccountType) {
		this.parentAccountType = parentAccountType;
	}

	public BigDecimal getPaymentOrderId() {
		return this.paymentOrderId;
	}

	public void setPaymentOrderId(BigDecimal paymentOrderId) {
		this.paymentOrderId = paymentOrderId;
	}

	public BigDecimal getPaymentPaymentProductId() {
		return this.paymentPaymentProductId;
	}

	public void setPaymentPaymentProductId(BigDecimal paymentPaymentProductId) {
		this.paymentPaymentProductId = paymentPaymentProductId;
	}

	public String getPosCondCode() {
		return this.posCondCode;
	}

	public void setPosCondCode(String posCondCode) {
		this.posCondCode = posCondCode;
	}

	public String getPostCompletionCode() {
		return this.postCompletionCode;
	}

	public void setPostCompletionCode(String postCompletionCode) {
		this.postCompletionCode = postCompletionCode;
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

	public String getPrevAuthTime() {
		return this.prevAuthTime;
	}

	public void setPrevAuthTime(String prevAuthTime) {
		this.prevAuthTime = prevAuthTime;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getRealTimeScoring() {
		return this.realTimeScoring;
	}

	public void setRealTimeScoring(String realTimeScoring) {
		this.realTimeScoring = realTimeScoring;
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

	public String getRealtimeRuleDetails() {
		return this.realtimeRuleDetails;
	}

	public void setRealtimeRuleDetails(String realtimeRuleDetails) {
		this.realtimeRuleDetails = realtimeRuleDetails;
	}

	public Timestamp getRealtimeRuleProcessingEnd() {
		return this.realtimeRuleProcessingEnd;
	}

	public void setRealtimeRuleProcessingEnd(Timestamp realtimeRuleProcessingEnd) {
		this.realtimeRuleProcessingEnd = realtimeRuleProcessingEnd;
	}

	public Timestamp getRealtimeRulesTimedOut() {
		return this.realtimeRulesTimedOut;
	}

	public void setRealtimeRulesTimedOut(Timestamp realtimeRulesTimedOut) {
		this.realtimeRulesTimedOut = realtimeRulesTimedOut;
	}

	public String getRecType() {
		return this.recType;
	}

	public void setRecType(String recType) {
		this.recType = recType;
	}

	public BigDecimal getRelatedInternalId() {
		return this.relatedInternalId;
	}

	public void setRelatedInternalId(BigDecimal relatedInternalId) {
		this.relatedInternalId = relatedInternalId;
	}

	public String getReplyCode() {
		return this.replyCode;
	}

	public void setReplyCode(String replyCode) {
		this.replyCode = replyCode;
	}

	public String getRequestAction() {
		return this.requestAction;
	}

	public void setRequestAction(String requestAction) {
		this.requestAction = requestAction;
	}

	public String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
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

	public String getRetailerId() {
		return this.retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public BigDecimal getRetryCount() {
		return this.retryCount;
	}

	public void setRetryCount(BigDecimal retryCount) {
		this.retryCount = retryCount;
	}

	public String getRiskConditionCode() {
		return this.riskConditionCode;
	}

	public void setRiskConditionCode(String riskConditionCode) {
		this.riskConditionCode = riskConditionCode;
	}

	public String getRtsReasonCode() {
		return this.rtsReasonCode;
	}

	public void setRtsReasonCode(String rtsReasonCode) {
		this.rtsReasonCode = rtsReasonCode;
	}

	public String getScoreCode() {
		return this.scoreCode;
	}

	public void setScoreCode(String scoreCode) {
		this.scoreCode = scoreCode;
	}

	public String getSecureCommerceIndicator() {
		return this.secureCommerceIndicator;
	}

	public void setSecureCommerceIndicator(String secureCommerceIndicator) {
		this.secureCommerceIndicator = secureCommerceIndicator;
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

	public BigDecimal getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(BigDecimal serviceCode) {
		this.serviceCode = serviceCode;
	}

	public BigDecimal getSettAmountLocal() {
		return this.settAmountLocal;
	}

	public void setSettAmountLocal(BigDecimal settAmountLocal) {
		this.settAmountLocal = settAmountLocal;
	}

	public BigDecimal getSettAmountOrig() {
		return this.settAmountOrig;
	}

	public void setSettAmountOrig(BigDecimal settAmountOrig) {
		this.settAmountOrig = settAmountOrig;
	}

	public String getSettAuthCode() {
		return this.settAuthCode;
	}

	public void setSettAuthCode(String settAuthCode) {
		this.settAuthCode = settAuthCode;
	}

	public String getSettBatchId() {
		return this.settBatchId;
	}

	public void setSettBatchId(String settBatchId) {
		this.settBatchId = settBatchId;
	}

	public String getSettBatchNumber() {
		return this.settBatchNumber;
	}

	public void setSettBatchNumber(String settBatchNumber) {
		this.settBatchNumber = settBatchNumber;
	}

	public BigDecimal getSettBillAmount() {
		return this.settBillAmount;
	}

	public void setSettBillAmount(BigDecimal settBillAmount) {
		this.settBillAmount = settBillAmount;
	}

	public String getSettBillCurr() {
		return this.settBillCurr;
	}

	public void setSettBillCurr(String settBillCurr) {
		this.settBillCurr = settBillCurr;
	}

	public String getSettBin() {
		return this.settBin;
	}

	public void setSettBin(String settBin) {
		this.settBin = settBin;
	}

	public String getSettChgbckRetReasonCode() {
		return this.settChgbckRetReasonCode;
	}

	public void setSettChgbckRetReasonCode(String settChgbckRetReasonCode) {
		this.settChgbckRetReasonCode = settChgbckRetReasonCode;
	}

	public String getSettCurrLocal() {
		return this.settCurrLocal;
	}

	public void setSettCurrLocal(String settCurrLocal) {
		this.settCurrLocal = settCurrLocal;
	}

	public String getSettCurrOrig() {
		return this.settCurrOrig;
	}

	public void setSettCurrOrig(String settCurrOrig) {
		this.settCurrOrig = settCurrOrig;
	}

	public Date getSettDate() {
		return this.settDate;
	}

	public void setSettDate(Date settDate) {
		this.settDate = settDate;
	}

	public String getSettEmvCvrCdaPerformed() {
		return this.settEmvCvrCdaPerformed;
	}

	public void setSettEmvCvrCdaPerformed(String settEmvCvrCdaPerformed) {
		this.settEmvCvrCdaPerformed = settEmvCvrCdaPerformed;
	}

	public String getSettEmvCvrGoOnlineNxtTxn() {
		return this.settEmvCvrGoOnlineNxtTxn;
	}

	public void setSettEmvCvrGoOnlineNxtTxn(String settEmvCvrGoOnlineNxtTxn) {
		this.settEmvCvrGoOnlineNxtTxn = settEmvCvrGoOnlineNxtTxn;
	}

	public String getSettEmvCvrIssAuthFail() {
		return this.settEmvCvrIssAuthFail;
	}

	public void setSettEmvCvrIssAuthFail(String settEmvCvrIssAuthFail) {
		this.settEmvCvrIssAuthFail = settEmvCvrIssAuthFail;
	}

	public String getSettEmvCvrLowCumAmtXcd() {
		return this.settEmvCvrLowCumAmtXcd;
	}

	public void setSettEmvCvrLowCumAmtXcd(String settEmvCvrLowCumAmtXcd) {
		this.settEmvCvrLowCumAmtXcd = settEmvCvrLowCumAmtXcd;
	}

	public String getSettEmvCvrLowerCumAmtXcd() {
		return this.settEmvCvrLowerCumAmtXcd;
	}

	public void setSettEmvCvrLowerCumAmtXcd(String settEmvCvrLowerCumAmtXcd) {
		this.settEmvCvrLowerCumAmtXcd = settEmvCvrLowerCumAmtXcd;
	}

	public String getSettEmvCvrLowerTxnsXcd() {
		return this.settEmvCvrLowerTxnsXcd;
	}

	public void setSettEmvCvrLowerTxnsXcd(String settEmvCvrLowerTxnsXcd) {
		this.settEmvCvrLowerTxnsXcd = settEmvCvrLowerTxnsXcd;
	}

	public String getSettEmvCvrNoIssuerAuth() {
		return this.settEmvCvrNoIssuerAuth;
	}

	public void setSettEmvCvrNoIssuerAuth(String settEmvCvrNoIssuerAuth) {
		this.settEmvCvrNoIssuerAuth = settEmvCvrNoIssuerAuth;
	}

	public String getSettEmvCvrOfAthFlPrvTxn() {
		return this.settEmvCvrOfAthFlPrvTxn;
	}

	public void setSettEmvCvrOfAthFlPrvTxn(String settEmvCvrOfAthFlPrvTxn) {
		this.settEmvCvrOfAthFlPrvTxn = settEmvCvrOfAthFlPrvTxn;
	}

	public String getSettEmvCvrOffAuFailPrev() {
		return this.settEmvCvrOffAuFailPrev;
	}

	public void setSettEmvCvrOffAuFailPrev(String settEmvCvrOffAuFailPrev) {
		this.settEmvCvrOffAuFailPrev = settEmvCvrOffAuFailPrev;
	}

	public String getSettEmvCvrOffPinVeriFail() {
		return this.settEmvCvrOffPinVeriFail;
	}

	public void setSettEmvCvrOffPinVeriFail(String settEmvCvrOffPinVeriFail) {
		this.settEmvCvrOffPinVeriFail = settEmvCvrOffPinVeriFail;
	}

	public String getSettEmvCvrOffPinVerify() {
		return this.settEmvCvrOffPinVerify;
	}

	public void setSettEmvCvrOffPinVerify(String settEmvCvrOffPinVerify) {
		this.settEmvCvrOffPinVerify = settEmvCvrOffPinVerify;
	}

	public String getSettEmvCvrOfflineDda() {
		return this.settEmvCvrOfflineDda;
	}

	public void setSettEmvCvrOfflineDda(String settEmvCvrOfflineDda) {
		this.settEmvCvrOfflineDda = settEmvCvrOfflineDda;
	}

	public String getSettEmvCvrOfflinePin() {
		return this.settEmvCvrOfflinePin;
	}

	public void setSettEmvCvrOfflinePin(String settEmvCvrOfflinePin) {
		this.settEmvCvrOfflinePin = settEmvCvrOfflinePin;
	}

	public String getSettEmvCvrOfflinePinFail() {
		return this.settEmvCvrOfflinePinFail;
	}

	public void setSettEmvCvrOfflinePinFail(String settEmvCvrOfflinePinFail) {
		this.settEmvCvrOfflinePinFail = settEmvCvrOfflinePinFail;
	}

	public BigDecimal getSettEmvCvrPinRetryCount() {
		return this.settEmvCvrPinRetryCount;
	}

	public void setSettEmvCvrPinRetryCount(BigDecimal settEmvCvrPinRetryCount) {
		this.settEmvCvrPinRetryCount = settEmvCvrPinRetryCount;
	}

	public String getSettEmvCvrPinRetryLimXcd() {
		return this.settEmvCvrPinRetryLimXcd;
	}

	public void setSettEmvCvrPinRetryLimXcd(String settEmvCvrPinRetryLimXcd) {
		this.settEmvCvrPinRetryLimXcd = settEmvCvrPinRetryLimXcd;
	}

	public String getSettEmvCvrPinRetryLmtXcd() {
		return this.settEmvCvrPinRetryLmtXcd;
	}

	public void setSettEmvCvrPinRetryLmtXcd(String settEmvCvrPinRetryLmtXcd) {
		this.settEmvCvrPinRetryLmtXcd = settEmvCvrPinRetryLmtXcd;
	}

	public String getSettEmvCvrPrevIssAuFail() {
		return this.settEmvCvrPrevIssAuFail;
	}

	public void setSettEmvCvrPrevIssAuFail(String settEmvCvrPrevIssAuFail) {
		this.settEmvCvrPrevIssAuFail = settEmvCvrPrevIssAuFail;
	}

	public String getSettEmvCvrPrevTxnIncmplte() {
		return this.settEmvCvrPrevTxnIncmplte;
	}

	public void setSettEmvCvrPrevTxnIncmplte(String settEmvCvrPrevTxnIncmplte) {
		this.settEmvCvrPrevTxnIncmplte = settEmvCvrPrevTxnIncmplte;
	}

	public String getSettEmvCvrPrevTxnIncompl() {
		return this.settEmvCvrPrevTxnIncompl;
	}

	public void setSettEmvCvrPrevTxnIncompl(String settEmvCvrPrevTxnIncompl) {
		this.settEmvCvrPrevTxnIncompl = settEmvCvrPrevTxnIncompl;
	}

	public String getSettEmvCvrScptFlPrevTxn() {
		return this.settEmvCvrScptFlPrevTxn;
	}

	public void setSettEmvCvrScptFlPrevTxn(String settEmvCvrScptFlPrevTxn) {
		this.settEmvCvrScptFlPrevTxn = settEmvCvrScptFlPrevTxn;
	}

	public BigDecimal getSettEmvCvrScrCountPrevTx() {
		return this.settEmvCvrScrCountPrevTx;
	}

	public void setSettEmvCvrScrCountPrevTx(BigDecimal settEmvCvrScrCountPrevTx) {
		this.settEmvCvrScrCountPrevTx = settEmvCvrScrCountPrevTx;
	}

	public String getSettEmvCvrScrFailPrevTxn() {
		return this.settEmvCvrScrFailPrevTxn;
	}

	public void setSettEmvCvrScrFailPrevTxn(String settEmvCvrScrFailPrevTxn) {
		this.settEmvCvrScrFailPrevTxn = settEmvCvrScrFailPrevTxn;
	}

	public String getSettEmvCvrUnableGoOnline() {
		return this.settEmvCvrUnableGoOnline;
	}

	public void setSettEmvCvrUnableGoOnline(String settEmvCvrUnableGoOnline) {
		this.settEmvCvrUnableGoOnline = settEmvCvrUnableGoOnline;
	}

	public String getSettEmvCvrUppOffCumXcd() {
		return this.settEmvCvrUppOffCumXcd;
	}

	public void setSettEmvCvrUppOffCumXcd(String settEmvCvrUppOffCumXcd) {
		this.settEmvCvrUppOffCumXcd = settEmvCvrUppOffCumXcd;
	}

	public String getSettEmvCvrUpperCumAmtXcd() {
		return this.settEmvCvrUpperCumAmtXcd;
	}

	public void setSettEmvCvrUpperCumAmtXcd(String settEmvCvrUpperCumAmtXcd) {
		this.settEmvCvrUpperCumAmtXcd = settEmvCvrUpperCumAmtXcd;
	}

	public String getSettEmvCvrUpperTxnsXcd() {
		return this.settEmvCvrUpperTxnsXcd;
	}

	public void setSettEmvCvrUpperTxnsXcd(String settEmvCvrUpperTxnsXcd) {
		this.settEmvCvrUpperTxnsXcd = settEmvCvrUpperTxnsXcd;
	}

	public String getSettEmvTvrAppNotYetEff() {
		return this.settEmvTvrAppNotYetEff;
	}

	public void setSettEmvTvrAppNotYetEff(String settEmvTvrAppNotYetEff) {
		this.settEmvTvrAppNotYetEff = settEmvTvrAppNotYetEff;
	}

	public String getSettEmvTvrBadVersions() {
		return this.settEmvTvrBadVersions;
	}

	public void setSettEmvTvrBadVersions(String settEmvTvrBadVersions) {
		this.settEmvTvrBadVersions = settEmvTvrBadVersions;
	}

	public String getSettEmvTvrCardOnExcFile() {
		return this.settEmvTvrCardOnExcFile;
	}

	public void setSettEmvTvrCardOnExcFile(String settEmvTvrCardOnExcFile) {
		this.settEmvTvrCardOnExcFile = settEmvTvrCardOnExcFile;
	}

	public String getSettEmvTvrCdaFailed() {
		return this.settEmvTvrCdaFailed;
	}

	public void setSettEmvTvrCdaFailed(String settEmvTvrCdaFailed) {
		this.settEmvTvrCdaFailed = settEmvTvrCdaFailed;
	}

	public String getSettEmvTvrCrdhldrVrfyFail() {
		return this.settEmvTvrCrdhldrVrfyFail;
	}

	public void setSettEmvTvrCrdhldrVrfyFail(String settEmvTvrCrdhldrVrfyFail) {
		this.settEmvTvrCrdhldrVrfyFail = settEmvTvrCrdhldrVrfyFail;
	}

	public String getSettEmvTvrDdaFailed() {
		return this.settEmvTvrDdaFailed;
	}

	public void setSettEmvTvrDdaFailed(String settEmvTvrDdaFailed) {
		this.settEmvTvrDdaFailed = settEmvTvrDdaFailed;
	}

	public String getSettEmvTvrDefaultTdolUsed() {
		return this.settEmvTvrDefaultTdolUsed;
	}

	public void setSettEmvTvrDefaultTdolUsed(String settEmvTvrDefaultTdolUsed) {
		this.settEmvTvrDefaultTdolUsed = settEmvTvrDefaultTdolUsed;
	}

	public String getSettEmvTvrExcdLowConsLim() {
		return this.settEmvTvrExcdLowConsLim;
	}

	public void setSettEmvTvrExcdLowConsLim(String settEmvTvrExcdLowConsLim) {
		this.settEmvTvrExcdLowConsLim = settEmvTvrExcdLowConsLim;
	}

	public String getSettEmvTvrExcdUppConsLim() {
		return this.settEmvTvrExcdUppConsLim;
	}

	public void setSettEmvTvrExcdUppConsLim(String settEmvTvrExcdUppConsLim) {
		this.settEmvTvrExcdUppConsLim = settEmvTvrExcdUppConsLim;
	}

	public String getSettEmvTvrExceedsFloorLim() {
		return this.settEmvTvrExceedsFloorLim;
	}

	public void setSettEmvTvrExceedsFloorLim(String settEmvTvrExceedsFloorLim) {
		this.settEmvTvrExceedsFloorLim = settEmvTvrExceedsFloorLim;
	}

	public String getSettEmvTvrExcsLwrConsLim() {
		return this.settEmvTvrExcsLwrConsLim;
	}

	public void setSettEmvTvrExcsLwrConsLim(String settEmvTvrExcsLwrConsLim) {
		this.settEmvTvrExcsLwrConsLim = settEmvTvrExcsLwrConsLim;
	}

	public String getSettEmvTvrExdsUprConsLim() {
		return this.settEmvTvrExdsUprConsLim;
	}

	public void setSettEmvTvrExdsUprConsLim(String settEmvTvrExdsUprConsLim) {
		this.settEmvTvrExdsUprConsLim = settEmvTvrExdsUprConsLim;
	}

	public String getSettEmvTvrExpiredApp() {
		return this.settEmvTvrExpiredApp;
	}

	public void setSettEmvTvrExpiredApp(String settEmvTvrExpiredApp) {
		this.settEmvTvrExpiredApp = settEmvTvrExpiredApp;
	}

	public String getSettEmvTvrFailPostFinal() {
		return this.settEmvTvrFailPostFinal;
	}

	public void setSettEmvTvrFailPostFinal(String settEmvTvrFailPostFinal) {
		this.settEmvTvrFailPostFinal = settEmvTvrFailPostFinal;
	}

	public String getSettEmvTvrHolderVerifFail() {
		return this.settEmvTvrHolderVerifFail;
	}

	public void setSettEmvTvrHolderVerifFail(String settEmvTvrHolderVerifFail) {
		this.settEmvTvrHolderVerifFail = settEmvTvrHolderVerifFail;
	}

	public String getSettEmvTvrIccDataMissing() {
		return this.settEmvTvrIccDataMissing;
	}

	public void setSettEmvTvrIccDataMissing(String settEmvTvrIccDataMissing) {
		this.settEmvTvrIccDataMissing = settEmvTvrIccDataMissing;
	}

	public String getSettEmvTvrIssScriptFail() {
		return this.settEmvTvrIssScriptFail;
	}

	public void setSettEmvTvrIssScriptFail(String settEmvTvrIssScriptFail) {
		this.settEmvTvrIssScriptFail = settEmvTvrIssScriptFail;
	}

	public String getSettEmvTvrIssuerAuthFail() {
		return this.settEmvTvrIssuerAuthFail;
	}

	public void setSettEmvTvrIssuerAuthFail(String settEmvTvrIssuerAuthFail) {
		this.settEmvTvrIssuerAuthFail = settEmvTvrIssuerAuthFail;
	}

	public String getSettEmvTvrMerchForwardOnl() {
		return this.settEmvTvrMerchForwardOnl;
	}

	public void setSettEmvTvrMerchForwardOnl(String settEmvTvrMerchForwardOnl) {
		this.settEmvTvrMerchForwardOnl = settEmvTvrMerchForwardOnl;
	}

	public String getSettEmvTvrMerchFwdOnline() {
		return this.settEmvTvrMerchFwdOnline;
	}

	public void setSettEmvTvrMerchFwdOnline(String settEmvTvrMerchFwdOnline) {
		this.settEmvTvrMerchFwdOnline = settEmvTvrMerchFwdOnline;
	}

	public String getSettEmvTvrNewCard() {
		return this.settEmvTvrNewCard;
	}

	public void setSettEmvTvrNewCard(String settEmvTvrNewCard) {
		this.settEmvTvrNewCard = settEmvTvrNewCard;
	}

	public String getSettEmvTvrNoWkingPinPad() {
		return this.settEmvTvrNoWkingPinPad;
	}

	public void setSettEmvTvrNoWkingPinPad(String settEmvTvrNoWkingPinPad) {
		this.settEmvTvrNoWkingPinPad = settEmvTvrNoWkingPinPad;
	}

	public String getSettEmvTvrNoWorkingPad() {
		return this.settEmvTvrNoWorkingPad;
	}

	public void setSettEmvTvrNoWorkingPad(String settEmvTvrNoWorkingPad) {
		this.settEmvTvrNoWorkingPad = settEmvTvrNoWorkingPad;
	}

	public String getSettEmvTvrNotOffline() {
		return this.settEmvTvrNotOffline;
	}

	public void setSettEmvTvrNotOffline(String settEmvTvrNotOffline) {
		this.settEmvTvrNotOffline = settEmvTvrNotOffline;
	}

	public String getSettEmvTvrOffPinMaxTries() {
		return this.settEmvTvrOffPinMaxTries;
	}

	public void setSettEmvTvrOffPinMaxTries(String settEmvTvrOffPinMaxTries) {
		this.settEmvTvrOffPinMaxTries = settEmvTvrOffPinMaxTries;
	}

	public String getSettEmvTvrPinEntered() {
		return this.settEmvTvrPinEntered;
	}

	public void setSettEmvTvrPinEntered(String settEmvTvrPinEntered) {
		this.settEmvTvrPinEntered = settEmvTvrPinEntered;
	}

	public String getSettEmvTvrPinNotEntered() {
		return this.settEmvTvrPinNotEntered;
	}

	public void setSettEmvTvrPinNotEntered(String settEmvTvrPinNotEntered) {
		this.settEmvTvrPinNotEntered = settEmvTvrPinNotEntered;
	}

	public String getSettEmvTvrRandomOnlSend() {
		return this.settEmvTvrRandomOnlSend;
	}

	public void setSettEmvTvrRandomOnlSend(String settEmvTvrRandomOnlSend) {
		this.settEmvTvrRandomOnlSend = settEmvTvrRandomOnlSend;
	}

	public String getSettEmvTvrRandomOnlineSnd() {
		return this.settEmvTvrRandomOnlineSnd;
	}

	public void setSettEmvTvrRandomOnlineSnd(String settEmvTvrRandomOnlineSnd) {
		this.settEmvTvrRandomOnlineSnd = settEmvTvrRandomOnlineSnd;
	}

	public String getSettEmvTvrSctFailPostFnl() {
		return this.settEmvTvrSctFailPostFnl;
	}

	public void setSettEmvTvrSctFailPostFnl(String settEmvTvrSctFailPostFnl) {
		this.settEmvTvrSctFailPostFnl = settEmvTvrSctFailPostFnl;
	}

	public String getSettEmvTvrSdaFailed() {
		return this.settEmvTvrSdaFailed;
	}

	public void setSettEmvTvrSdaFailed(String settEmvTvrSdaFailed) {
		this.settEmvTvrSdaFailed = settEmvTvrSdaFailed;
	}

	public String getSettEmvTvrServiceUnallowed() {
		return this.settEmvTvrServiceUnallowed;
	}

	public void setSettEmvTvrServiceUnallowed(String settEmvTvrServiceUnallowed) {
		this.settEmvTvrServiceUnallowed = settEmvTvrServiceUnallowed;
	}

	public String getSettEmvTvrUnrecognisedCvm() {
		return this.settEmvTvrUnrecognisedCvm;
	}

	public void setSettEmvTvrUnrecognisedCvm(String settEmvTvrUnrecognisedCvm) {
		this.settEmvTvrUnrecognisedCvm = settEmvTvrUnrecognisedCvm;
	}

	public String getSettEntryMode() {
		return this.settEntryMode;
	}

	public void setSettEntryMode(String settEntryMode) {
		this.settEntryMode = settEntryMode;
	}

	public BigDecimal getSettId() {
		return this.settId;
	}

	public void setSettId(BigDecimal settId) {
		this.settId = settId;
	}

	public Date getSettLoadDate() {
		return this.settLoadDate;
	}

	public void setSettLoadDate(Date settLoadDate) {
		this.settLoadDate = settLoadDate;
	}

	public BigDecimal getSettMcc() {
		return this.settMcc;
	}

	public void setSettMcc(BigDecimal settMcc) {
		this.settMcc = settMcc;
	}

	public String getSettMerCity() {
		return this.settMerCity;
	}

	public void setSettMerCity(String settMerCity) {
		this.settMerCity = settMerCity;
	}

	public String getSettMerCode() {
		return this.settMerCode;
	}

	public void setSettMerCode(String settMerCode) {
		this.settMerCode = settMerCode;
	}

	public String getSettMerCountry() {
		return this.settMerCountry;
	}

	public void setSettMerCountry(String settMerCountry) {
		this.settMerCountry = settMerCountry;
	}

	public String getSettMerName() {
		return this.settMerName;
	}

	public void setSettMerName(String settMerName) {
		this.settMerName = settMerName;
	}

	public String getSettMsgType() {
		return this.settMsgType;
	}

	public void setSettMsgType(String settMsgType) {
		this.settMsgType = settMsgType;
	}

	public Date getSettPurchaseDate() {
		return this.settPurchaseDate;
	}

	public void setSettPurchaseDate(Date settPurchaseDate) {
		this.settPurchaseDate = settPurchaseDate;
	}

	public String getSettTermId() {
		return this.settTermId;
	}

	public void setSettTermId(String settTermId) {
		this.settTermId = settTermId;
	}

	public String getSettTxntype1() {
		return this.settTxntype1;
	}

	public void setSettTxntype1(String settTxntype1) {
		this.settTxntype1 = settTxntype1;
	}

	public String getSettlementMatchColumn1() {
		return this.settlementMatchColumn1;
	}

	public void setSettlementMatchColumn1(String settlementMatchColumn1) {
		this.settlementMatchColumn1 = settlementMatchColumn1;
	}

	public String getSettlementMatchColumn2() {
		return this.settlementMatchColumn2;
	}

	public void setSettlementMatchColumn2(String settlementMatchColumn2) {
		this.settlementMatchColumn2 = settlementMatchColumn2;
	}

	public String getSettlementMatchColumn3() {
		return this.settlementMatchColumn3;
	}

	public void setSettlementMatchColumn3(String settlementMatchColumn3) {
		this.settlementMatchColumn3 = settlementMatchColumn3;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getTermChipCapability() {
		return this.termChipCapability;
	}

	public void setTermChipCapability(String termChipCapability) {
		this.termChipCapability = termChipCapability;
	}

	public String getTermId() {
		return this.termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getTermPinCapability() {
		return this.termPinCapability;
	}

	public void setTermPinCapability(String termPinCapability) {
		this.termPinCapability = termPinCapability;
	}

	public String getTermType() {
		return this.termType;
	}

	public void setTermType(String termType) {
		this.termType = termType;
	}

	public BigDecimal getTrack1Present() {
		return this.track1Present;
	}

	public void setTrack1Present(BigDecimal track1Present) {
		this.track1Present = track1Present;
	}

	public BigDecimal getTrack2Present() {
		return this.track2Present;
	}

	public void setTrack2Present(BigDecimal track2Present) {
		this.track2Present = track2Present;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTxnCategoryCode() {
		return this.txnCategoryCode;
	}

	public void setTxnCategoryCode(String txnCategoryCode) {
		this.txnCategoryCode = txnCategoryCode;
	}

	public String getTxnInd() {
		return this.txnInd;
	}

	public void setTxnInd(String txnInd) {
		this.txnInd = txnInd;
	}

	public BigDecimal getTxnTotScore() {
		return this.txnTotScore;
	}

	public void setTxnTotScore(BigDecimal txnTotScore) {
		this.txnTotScore = txnTotScore;
	}

	public String getTxnid1() {
		return this.txnid1;
	}

	public void setTxnid1(String txnid1) {
		this.txnid1 = txnid1;
	}

	public String getTxnid2() {
		return this.txnid2;
	}

	public void setTxnid2(String txnid2) {
		this.txnid2 = txnid2;
	}

	public String getUpdateMatchColumn1() {
		return this.updateMatchColumn1;
	}

	public void setUpdateMatchColumn1(String updateMatchColumn1) {
		this.updateMatchColumn1 = updateMatchColumn1;
	}

	public String getUpdateMatchColumn2() {
		return this.updateMatchColumn2;
	}

	public void setUpdateMatchColumn2(String updateMatchColumn2) {
		this.updateMatchColumn2 = updateMatchColumn2;
	}

	public String getUpdateMatchColumn3() {
		return this.updateMatchColumn3;
	}

	public void setUpdateMatchColumn3(String updateMatchColumn3) {
		this.updateMatchColumn3 = updateMatchColumn3;
	}

	public BigDecimal getVisorScore() {
		return this.visorScore;
	}

	public void setVisorScore(BigDecimal visorScore) {
		this.visorScore = visorScore;
	}

}