package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the APPLICATION_ROLE_ACCESS database table.
 * 
 */
@Embeddable
public class ApplicationRoleAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String feature;

	@Column(name="ACCESS_LEVEL")
	private String accessLevel;

	@Column(name="ROLE_ID", insertable=false, updatable=false)
	private long roleId;

	public ApplicationRoleAccessPK() {
	}
	public String getFeature() {
		return this.feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getAccessLevel() {
		return this.accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
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
		if (!(other instanceof ApplicationRoleAccessPK)) {
			return false;
		}
		ApplicationRoleAccessPK castOther = (ApplicationRoleAccessPK)other;
		return 
			this.feature.equals(castOther.feature)
			&& this.accessLevel.equals(castOther.accessLevel)
			&& (this.roleId == castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.feature.hashCode();
		hash = hash * prime + this.accessLevel.hashCode();
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		
		return hash;
	}
}