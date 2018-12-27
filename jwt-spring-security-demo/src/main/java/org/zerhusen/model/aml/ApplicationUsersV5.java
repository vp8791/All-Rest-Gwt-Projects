package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the APPLICATION_USERS_V5 database table.
 * 
 */
@Entity
@Table(name="APPLICATION_USERS_V5")
@NamedQuery(name="ApplicationUsersV5.findAll", query="SELECT a FROM ApplicationUsersV5 a")
public class ApplicationUsersV5 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private long userId;

	private String animation;

	@Column(name="EMAIL_ID")
	private String emailId;

	private String enabled;

	@Column(name="ENTITY_ID")
	private BigDecimal entityId;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LGE_SEQ")
	private BigDecimal lgeSeq;

	private String password;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="PWD_NEW_DATE")
	private Date pwdNewDate;

	@Column(name="PWD_RESET")
	private String pwdReset;

	@Temporal(TemporalType.DATE)
	@Column(name="PWD_RESET_DATE")
	private Date pwdResetDate;

	private String salt;

	@Column(name="SECOND_NAME")
	private String secondName;

	private String status;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="USER_EXT_ID")
	private String userExtId;

	@Lob
	@Column(name="USER_EXTENDED_CONFIG")
	private String userExtendedConfig;

	public ApplicationUsersV5() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getAnimation() {
		return this.animation;
	}

	public void setAnimation(String animation) {
		this.animation = animation;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public BigDecimal getEntityId() {
		return this.entityId;
	}

	public void setEntityId(BigDecimal entityId) {
		this.entityId = entityId;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public BigDecimal getLgeSeq() {
		return this.lgeSeq;
	}

	public void setLgeSeq(BigDecimal lgeSeq) {
		this.lgeSeq = lgeSeq;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getPwdNewDate() {
		return this.pwdNewDate;
	}

	public void setPwdNewDate(Date pwdNewDate) {
		this.pwdNewDate = pwdNewDate;
	}

	public String getPwdReset() {
		return this.pwdReset;
	}

	public void setPwdReset(String pwdReset) {
		this.pwdReset = pwdReset;
	}

	public Date getPwdResetDate() {
		return this.pwdResetDate;
	}

	public void setPwdResetDate(Date pwdResetDate) {
		this.pwdResetDate = pwdResetDate;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getUserExtId() {
		return this.userExtId;
	}

	public void setUserExtId(String userExtId) {
		this.userExtId = userExtId;
	}

	public String getUserExtendedConfig() {
		return this.userExtendedConfig;
	}

	public void setUserExtendedConfig(String userExtendedConfig) {
		this.userExtendedConfig = userExtendedConfig;
	}

}