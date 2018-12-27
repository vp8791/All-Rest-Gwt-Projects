package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the APPLICATION_SESSION_ROLE database table.
 * 
 */
@Embeddable
public class ApplicationSessionRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SESSION_ID")
	private String sessionId;

	@Column(name="ROLE_ID")
	private long roleId;

	public ApplicationSessionRolePK() {
	}
	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApplicationSessionRolePK)) {
			return false;
		}
		ApplicationSessionRolePK castOther = (ApplicationSessionRolePK)other;
		return 
			this.sessionId.equals(castOther.sessionId)
			&& (this.roleId == castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sessionId.hashCode();
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		
		return hash;
	}
}