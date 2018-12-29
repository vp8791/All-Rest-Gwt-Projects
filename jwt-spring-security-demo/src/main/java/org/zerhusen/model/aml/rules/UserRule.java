package org.zerhusen.model.aml.rules;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the USER_RULE database table.
 * 
 */
@Entity
@Table(name="USER_RULE")
@NamedQuery(name="UserRule.findAll", query="SELECT u FROM UserRule u")
public class UserRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RULE_ID")
	private long ruleId;

	@Column(name="ACTION_TYPE")
	private String actionType;

	@Column(name="ALERT_ACTION")
	private String alertAction;

	@Column(name="ALERTING_ENTITY")
	private String alertingEntity;

	@Column(name="BLOCK_CODE")
	private String blockCode;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CURRENT_STATUS_LAST_UPDATED")
	private Timestamp currentStatusLastUpdated;

	@Column(name="EMAIL_CODE")
	private String emailCode;

	@Column(name="EMAIL_FLAG")
	private String emailFlag;

	@Column(name="ENTITY_ID")
	private BigDecimal entityId;

	@Column(name="EXEC_ALWAYS")
	private String execAlways;

	@Temporal(TemporalType.DATE)
	@Column(name="EXEC_END")
	private Date execEnd;

	@Column(name="EXEC_FREQ")
	private String execFreq;

	@Column(name="EXEC_MODE")
	private String execMode;

	@Column(name="EXEC_PERIOD")
	private String execPeriod;

	@Temporal(TemporalType.DATE)
	@Column(name="EXEC_START")
	private Date execStart;

	@Column(name="KEY_ID")
	private BigDecimal keyId;

	@Column(name="PENDING_REVIEW")
	private String pendingReview;

	@Column(name="RAISE_ALERT_FLAG")
	private String raiseAlertFlag;

	@Column(name="REALTIME_RESPONSE_FLAG")
	private String realtimeResponseFlag;

	@Column(name="REALTIME_RESPONSE_ID")
	private String realtimeResponseId;

	@Column(name="RULE_CODE")
	private String ruleCode;

	@Column(name="RULE_DESC")
	private String ruleDesc;

	@Column(name="RULE_EXPRESSION")
	private String ruleExpression;

	@Lob
	@Column(name="RULE_OBJECT")
	private String ruleObject;

	@Column(name="RULE_PRECONDITION")
	private String rulePrecondition;

	@Column(name="RULE_STATUS")
	private String ruleStatus;

	@Column(name="RULE_TYPE")
	private String ruleType;

	@Column(name="SMS_CODE")
	private String smsCode;

	@Column(name="SMS_FLAG")
	private String smsFlag;

	private String summary;

	@Column(name="SUPPRESS_ALERT_FLAG")
	private String suppressAlertFlag;

	@Column(name="SUPPRESS_RT_RESPONSE_FLAG")
	private String suppressRtResponseFlag;

	@Column(name="TRACKING_TYPE")
	private String trackingType;

	@Column(name="TXN_TYPE")
	private String txnType;

	@Column(name="UPDATE_DATE")
	private Timestamp updateDate;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_SESSION_TIME")
	private Date updateSessionTime;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="VERSION_NUMBER")
	private BigDecimal versionNumber;

	private String vertical;

	private BigDecimal weighting;

	public UserRule() {
	}

	public long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(long ruleId) {
		this.ruleId = ruleId;
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAlertAction() {
		return this.alertAction;
	}

	public void setAlertAction(String alertAction) {
		this.alertAction = alertAction;
	}

	public String getAlertingEntity() {
		return this.alertingEntity;
	}

	public void setAlertingEntity(String alertingEntity) {
		this.alertingEntity = alertingEntity;
	}

	public String getBlockCode() {
		return this.blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCurrentStatusLastUpdated() {
		return this.currentStatusLastUpdated;
	}

	public void setCurrentStatusLastUpdated(Timestamp currentStatusLastUpdated) {
		this.currentStatusLastUpdated = currentStatusLastUpdated;
	}

	public String getEmailCode() {
		return this.emailCode;
	}

	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}

	public String getEmailFlag() {
		return this.emailFlag;
	}

	public void setEmailFlag(String emailFlag) {
		this.emailFlag = emailFlag;
	}

	public BigDecimal getEntityId() {
		return this.entityId;
	}

	public void setEntityId(BigDecimal entityId) {
		this.entityId = entityId;
	}

	public String getExecAlways() {
		return this.execAlways;
	}

	public void setExecAlways(String execAlways) {
		this.execAlways = execAlways;
	}

	public Date getExecEnd() {
		return this.execEnd;
	}

	public void setExecEnd(Date execEnd) {
		this.execEnd = execEnd;
	}

	public String getExecFreq() {
		return this.execFreq;
	}

	public void setExecFreq(String execFreq) {
		this.execFreq = execFreq;
	}

	public String getExecMode() {
		return this.execMode;
	}

	public void setExecMode(String execMode) {
		this.execMode = execMode;
	}

	public String getExecPeriod() {
		return this.execPeriod;
	}

	public void setExecPeriod(String execPeriod) {
		this.execPeriod = execPeriod;
	}

	public Date getExecStart() {
		return this.execStart;
	}

	public void setExecStart(Date execStart) {
		this.execStart = execStart;
	}

	public BigDecimal getKeyId() {
		return this.keyId;
	}

	public void setKeyId(BigDecimal keyId) {
		this.keyId = keyId;
	}

	public String getPendingReview() {
		return this.pendingReview;
	}

	public void setPendingReview(String pendingReview) {
		this.pendingReview = pendingReview;
	}

	public String getRaiseAlertFlag() {
		return this.raiseAlertFlag;
	}

	public void setRaiseAlertFlag(String raiseAlertFlag) {
		this.raiseAlertFlag = raiseAlertFlag;
	}

	public String getRealtimeResponseFlag() {
		return this.realtimeResponseFlag;
	}

	public void setRealtimeResponseFlag(String realtimeResponseFlag) {
		this.realtimeResponseFlag = realtimeResponseFlag;
	}

	public String getRealtimeResponseId() {
		return this.realtimeResponseId;
	}

	public void setRealtimeResponseId(String realtimeResponseId) {
		this.realtimeResponseId = realtimeResponseId;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	public String getRuleExpression() {
		return this.ruleExpression;
	}

	public void setRuleExpression(String ruleExpression) {
		this.ruleExpression = ruleExpression;
	}

	public String getRuleObject() {
		return this.ruleObject;
	}

	public void setRuleObject(String ruleObject) {
		this.ruleObject = ruleObject;
	}

	public String getRulePrecondition() {
		return this.rulePrecondition;
	}

	public void setRulePrecondition(String rulePrecondition) {
		this.rulePrecondition = rulePrecondition;
	}

	public String getRuleStatus() {
		return this.ruleStatus;
	}

	public void setRuleStatus(String ruleStatus) {
		this.ruleStatus = ruleStatus;
	}

	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getSmsCode() {
		return this.smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getSmsFlag() {
		return this.smsFlag;
	}

	public void setSmsFlag(String smsFlag) {
		this.smsFlag = smsFlag;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSuppressAlertFlag() {
		return this.suppressAlertFlag;
	}

	public void setSuppressAlertFlag(String suppressAlertFlag) {
		this.suppressAlertFlag = suppressAlertFlag;
	}

	public String getSuppressRtResponseFlag() {
		return this.suppressRtResponseFlag;
	}

	public void setSuppressRtResponseFlag(String suppressRtResponseFlag) {
		this.suppressRtResponseFlag = suppressRtResponseFlag;
	}

	public String getTrackingType() {
		return this.trackingType;
	}

	public void setTrackingType(String trackingType) {
		this.trackingType = trackingType;
	}

	public String getTxnType() {
		return this.txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public Date getUpdateSessionTime() {
		return this.updateSessionTime;
	}

	public void setUpdateSessionTime(Date updateSessionTime) {
		this.updateSessionTime = updateSessionTime;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getVertical() {
		return this.vertical;
	}

	public void setVertical(String vertical) {
		this.vertical = vertical;
	}

	public BigDecimal getWeighting() {
		return this.weighting;
	}

	public void setWeighting(BigDecimal weighting) {
		this.weighting = weighting;
	}

}