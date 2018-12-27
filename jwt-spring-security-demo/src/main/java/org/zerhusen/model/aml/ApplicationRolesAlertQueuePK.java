package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the APPLICATION_ROLES_ALERT_QUEUES database table.
 * 
 */
@Embeddable
public class ApplicationRolesAlertQueuePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ROLE_ID", insertable=false, updatable=false)
	private long roleId;

	@Column(name="ALERT_QUEUE_ID", insertable=false, updatable=false)
	private long alertQueueId;

	public ApplicationRolesAlertQueuePK() {
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public long getAlertQueueId() {
		return this.alertQueueId;
	}
	public void setAlertQueueId(long alertQueueId) {
		this.alertQueueId = alertQueueId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApplicationRolesAlertQueuePK)) {
			return false;
		}
		ApplicationRolesAlertQueuePK castOther = (ApplicationRolesAlertQueuePK)other;
		return 
			(this.roleId == castOther.roleId)
			&& (this.alertQueueId == castOther.alertQueueId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		hash = hash * prime + ((int) (this.alertQueueId ^ (this.alertQueueId >>> 32)));
		
		return hash;
	}
}