package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the APPLICATION_USER_ROLE database table.
 * 
 */
@Embeddable
public class ApplicationUserRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="USER_ID")
	private String userId;

	@Column(name="ROLE_ID")
	private long roleId;

	public ApplicationUserRolePK() {
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		if (!(other instanceof ApplicationUserRolePK)) {
			return false;
		}
		ApplicationUserRolePK castOther = (ApplicationUserRolePK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.roleId == castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		
		return hash;
	}
}