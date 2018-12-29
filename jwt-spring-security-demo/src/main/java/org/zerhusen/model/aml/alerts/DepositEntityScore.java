package org.zerhusen.model.aml.alerts;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the DEPOSIT_ENTITY_SCORES database table.
 * 
 */
@Entity
@Table(name="DEPOSIT_ENTITY_SCORES")
@NamedQuery(name="DepositEntityScore.findAll", query="SELECT d FROM DepositEntityScore d")
public class DepositEntityScore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DepositEntityScorePK id;

	@Column(name="ALERT_SUPPRESS_REASON")
	private String alertSuppressReason;

	@Column(name="ALERT_SUPPRESSED")
	private String alertSuppressed;

	@Column(name="AUTH_RPM_ELAPSED_TIME")
	private BigDecimal authRpmElapsedTime;

	@Column(name="BATCH_RPM_ELAPSED_TIME")
	private BigDecimal batchRpmElapsedTime;

	@Column(name="EXPRESS_SCORE")
	private BigDecimal expressScore;

	@Column(name="EXPRESS_TRIGGER")
	private String expressTrigger;

	@Temporal(TemporalType.DATE)
	@Column(name="FRAUD_CONFIRMED")
	private Date fraudConfirmed;

	@Temporal(TemporalType.DATE)
	@Column(name="FRAUD_IDENTIFIED")
	private Date fraudIdentified;

	@Column(name="FRAUD_TYPE")
	private String fraudType;

	@Column(name="FRAUD_USER")
	private String fraudUser;

	@Column(name="POST_EXPRESS_RULES_TIMING")
	private BigDecimal postExpressRulesTiming;

	@Column(name="POST_USER_RULES_TIMING")
	private BigDecimal postUserRulesTiming;

	private String processed;

	@Column(name="PSA_TRIGGER")
	private String psaTrigger;

	@Column(name="RETURN_BLOCK_CODE")
	private String returnBlockCode;

	@Column(name="RETURN_REPLY_CODE")
	private String returnReplyCode;

	private BigDecimal score;

	@Column(name="SCORES_DEPOSIT_DATE")
	private Timestamp scoresDepositDate;

	@Column(name="SMS_TRIGGER")
	private String smsTrigger;

	@Column(name="SYSTEM_ALERT")
	private String systemAlert;

	@Temporal(TemporalType.DATE)
	@Column(name="SYSTEM_ALERT_DATE")
	private Date systemAlertDate;

	@Column(name="SYSTEM_TOT_SCORE")
	private BigDecimal systemTotScore;

	@Column(name="USER_ALERT")
	private String userAlert;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_ALERT_DATE")
	private Date userAlertDate;

	@Column(name="USER_TOT_SCORE")
	private BigDecimal userTotScore;

	public DepositEntityScore() {
	}

	public DepositEntityScorePK getId() {
		return this.id;
	}

	public void setId(DepositEntityScorePK id) {
		this.id = id;
	}

	public String getAlertSuppressReason() {
		return this.alertSuppressReason;
	}

	public void setAlertSuppressReason(String alertSuppressReason) {
		this.alertSuppressReason = alertSuppressReason;
	}

	public String getAlertSuppressed() {
		return this.alertSuppressed;
	}

	public void setAlertSuppressed(String alertSuppressed) {
		this.alertSuppressed = alertSuppressed;
	}

	public BigDecimal getAuthRpmElapsedTime() {
		return this.authRpmElapsedTime;
	}

	public void setAuthRpmElapsedTime(BigDecimal authRpmElapsedTime) {
		this.authRpmElapsedTime = authRpmElapsedTime;
	}

	public BigDecimal getBatchRpmElapsedTime() {
		return this.batchRpmElapsedTime;
	}

	public void setBatchRpmElapsedTime(BigDecimal batchRpmElapsedTime) {
		this.batchRpmElapsedTime = batchRpmElapsedTime;
	}

	public BigDecimal getExpressScore() {
		return this.expressScore;
	}

	public void setExpressScore(BigDecimal expressScore) {
		this.expressScore = expressScore;
	}

	public String getExpressTrigger() {
		return this.expressTrigger;
	}

	public void setExpressTrigger(String expressTrigger) {
		this.expressTrigger = expressTrigger;
	}

	public Date getFraudConfirmed() {
		return this.fraudConfirmed;
	}

	public void setFraudConfirmed(Date fraudConfirmed) {
		this.fraudConfirmed = fraudConfirmed;
	}

	public Date getFraudIdentified() {
		return this.fraudIdentified;
	}

	public void setFraudIdentified(Date fraudIdentified) {
		this.fraudIdentified = fraudIdentified;
	}

	public String getFraudType() {
		return this.fraudType;
	}

	public void setFraudType(String fraudType) {
		this.fraudType = fraudType;
	}

	public String getFraudUser() {
		return this.fraudUser;
	}

	public void setFraudUser(String fraudUser) {
		this.fraudUser = fraudUser;
	}

	public BigDecimal getPostExpressRulesTiming() {
		return this.postExpressRulesTiming;
	}

	public void setPostExpressRulesTiming(BigDecimal postExpressRulesTiming) {
		this.postExpressRulesTiming = postExpressRulesTiming;
	}

	public BigDecimal getPostUserRulesTiming() {
		return this.postUserRulesTiming;
	}

	public void setPostUserRulesTiming(BigDecimal postUserRulesTiming) {
		this.postUserRulesTiming = postUserRulesTiming;
	}

	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public String getPsaTrigger() {
		return this.psaTrigger;
	}

	public void setPsaTrigger(String psaTrigger) {
		this.psaTrigger = psaTrigger;
	}

	public String getReturnBlockCode() {
		return this.returnBlockCode;
	}

	public void setReturnBlockCode(String returnBlockCode) {
		this.returnBlockCode = returnBlockCode;
	}

	public String getReturnReplyCode() {
		return this.returnReplyCode;
	}

	public void setReturnReplyCode(String returnReplyCode) {
		this.returnReplyCode = returnReplyCode;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public Timestamp getScoresDepositDate() {
		return this.scoresDepositDate;
	}

	public void setScoresDepositDate(Timestamp scoresDepositDate) {
		this.scoresDepositDate = scoresDepositDate;
	}

	public String getSmsTrigger() {
		return this.smsTrigger;
	}

	public void setSmsTrigger(String smsTrigger) {
		this.smsTrigger = smsTrigger;
	}

	public String getSystemAlert() {
		return this.systemAlert;
	}

	public void setSystemAlert(String systemAlert) {
		this.systemAlert = systemAlert;
	}

	public Date getSystemAlertDate() {
		return this.systemAlertDate;
	}

	public void setSystemAlertDate(Date systemAlertDate) {
		this.systemAlertDate = systemAlertDate;
	}

	public BigDecimal getSystemTotScore() {
		return this.systemTotScore;
	}

	public void setSystemTotScore(BigDecimal systemTotScore) {
		this.systemTotScore = systemTotScore;
	}

	public String getUserAlert() {
		return this.userAlert;
	}

	public void setUserAlert(String userAlert) {
		this.userAlert = userAlert;
	}

	public Date getUserAlertDate() {
		return this.userAlertDate;
	}

	public void setUserAlertDate(Date userAlertDate) {
		this.userAlertDate = userAlertDate;
	}

	public BigDecimal getUserTotScore() {
		return this.userTotScore;
	}

	public void setUserTotScore(BigDecimal userTotScore) {
		this.userTotScore = userTotScore;
	}

}