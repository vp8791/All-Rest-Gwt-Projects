package org.zerhusen.model.aml.alerts;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the EBANK_V5_ALERTS database table.
 * 
 */
@Entity
@Table(name="EBANK_V5_ALERTS")
@NamedQuery(name="EbankV5Alert.findAll", query="SELECT e FROM EbankV5Alert e")
public class EbankV5Alert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ALERT_ID")
	private String alertId;

	@Temporal(TemporalType.DATE)
	@Column(name="ALERT_DATE")
	private Date alertDate;

	@Column(name="ALERT_STATUS")
	private BigDecimal alertStatus;

	@Column(name="ASSIGNED_TO_USER")
	private String assignedToUser;

	@Column(name="ENTITY_ID")
	private BigDecimal entityId;

	@Column(name="INTERNAL_ID")
	private BigDecimal internalId;

	@Column(name="LOCKED_TIMESTAMP")
	private Timestamp lockedTimestamp;

	@Column(name="LOCKING_USER")
	private String lockingUser;

	@Temporal(TemporalType.DATE)
	@Column(name="PROC_DATE")
	private Date procDate;

	private BigDecimal score;

	@Column(name="SYSTEM_ALERT")
	private String systemAlert;

	@Column(name="SYSTEM_SCORE")
	private BigDecimal systemScore;

	@Temporal(TemporalType.DATE)
	@Column(name="TXN_DATE")
	private Date txnDate;

	@Column(name="TXN_TYPE")
	private String txnType;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="USER_ALERT")
	private String userAlert;

	@Column(name="USER_SCORE")
	private BigDecimal userScore;

	public EbankV5Alert() {
	}

	public String getAlertId() {
		return this.alertId;
	}

	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}

	public Date getAlertDate() {
		return this.alertDate;
	}

	public void setAlertDate(Date alertDate) {
		this.alertDate = alertDate;
	}

	public BigDecimal getAlertStatus() {
		return this.alertStatus;
	}

	public void setAlertStatus(BigDecimal alertStatus) {
		this.alertStatus = alertStatus;
	}

	public String getAssignedToUser() {
		return this.assignedToUser;
	}

	public void setAssignedToUser(String assignedToUser) {
		this.assignedToUser = assignedToUser;
	}

	public BigDecimal getEntityId() {
		return this.entityId;
	}

	public void setEntityId(BigDecimal entityId) {
		this.entityId = entityId;
	}

	public BigDecimal getInternalId() {
		return this.internalId;
	}

	public void setInternalId(BigDecimal internalId) {
		this.internalId = internalId;
	}

	public Timestamp getLockedTimestamp() {
		return this.lockedTimestamp;
	}

	public void setLockedTimestamp(Timestamp lockedTimestamp) {
		this.lockedTimestamp = lockedTimestamp;
	}

	public String getLockingUser() {
		return this.lockingUser;
	}

	public void setLockingUser(String lockingUser) {
		this.lockingUser = lockingUser;
	}

	public Date getProcDate() {
		return this.procDate;
	}

	public void setProcDate(Date procDate) {
		this.procDate = procDate;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public String getSystemAlert() {
		return this.systemAlert;
	}

	public void setSystemAlert(String systemAlert) {
		this.systemAlert = systemAlert;
	}

	public BigDecimal getSystemScore() {
		return this.systemScore;
	}

	public void setSystemScore(BigDecimal systemScore) {
		this.systemScore = systemScore;
	}

	public Date getTxnDate() {
		return this.txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public String getTxnType() {
		return this.txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUserAlert() {
		return this.userAlert;
	}

	public void setUserAlert(String userAlert) {
		this.userAlert = userAlert;
	}

	public BigDecimal getUserScore() {
		return this.userScore;
	}

	public void setUserScore(BigDecimal userScore) {
		this.userScore = userScore;
	}

}