package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the APP_USERS_PASSWORD_HISTORY_V5 database table.
 * 
 */
@Entity
@Table(name="APP_USERS_PASSWORD_HISTORY_V5")
@NamedQuery(name="AppUsersPasswordHistoryV5.findAll", query="SELECT a FROM AppUsersPasswordHistoryV5 a")
public class AppUsersPasswordHistoryV5 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HISTORY_ID")
	private long historyId;

	@Temporal(TemporalType.DATE)
	@Column(name="CHANGE_DATE")
	private Date changeDate;

	@Column(name="CHANGED_BY")
	private String changedBy;

	private String password;

	private String salt;

	@Column(name="USER_ID")
	private String userId;

	public AppUsersPasswordHistoryV5() {
	}

	public long getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(long historyId) {
		this.historyId = historyId;
	}

	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}