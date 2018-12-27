package org.zerhusen.model.aml.hib;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the USER_AUTHORITY database table.
 * 
 */
@Embeddable
public class HibUserAuthorityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="AUTHORITY_ID", insertable=false, updatable=false)
	private long authorityId;

	@Column(name="USER_ID", insertable=false, updatable=false)
	private long userId;

	public HibUserAuthorityPK() {
	}
	public long getAuthorityId() {
		return this.authorityId;
	}
	public void setAuthorityId(long authorityId) {
		this.authorityId = authorityId;
	}
	public long getUserId() {
		return this.userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HibUserAuthorityPK)) {
			return false;
		}
		HibUserAuthorityPK castOther = (HibUserAuthorityPK)other;
		return 
			(this.authorityId == castOther.authorityId)
			&& (this.userId == castOther.userId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.authorityId ^ (this.authorityId >>> 32)));
		hash = hash * prime + ((int) (this.userId ^ (this.userId >>> 32)));
		
		return hash;
	}
}