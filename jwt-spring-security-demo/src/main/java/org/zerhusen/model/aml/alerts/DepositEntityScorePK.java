package org.zerhusen.model.aml.alerts;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

/**
 * The primary key class for the DEPOSIT_ENTITY_SCORES database table.
 * 
 */
@Embeddable
public class DepositEntityScorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ENTITY_ID")
	private long entityId;

	@Column(name="INTERNAL_ID")
	private BigInteger internalId;

	public DepositEntityScorePK() {
	}
	public long getEntityId() {
		return this.entityId;
	}
	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}
	public BigInteger getInternalId() {
		return this.internalId;
	}
	public void setInternalId(BigInteger internalId) {
		this.internalId = internalId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DepositEntityScorePK)) {
			return false;
		}
		DepositEntityScorePK castOther = (DepositEntityScorePK)other;
		return 
			(this.entityId == castOther.entityId)
			&& (this.internalId == castOther.internalId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.entityId ^ (this.entityId >>> 32)));
		
		return hash;
	}
}