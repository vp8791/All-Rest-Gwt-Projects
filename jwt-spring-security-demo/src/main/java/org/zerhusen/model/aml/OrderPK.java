package org.zerhusen.model.aml;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

/**
 * The primary key class for the ORDERS database table.
 * 
 */
@Embeddable
public class OrderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INTERNAL_ID")
	private BigInteger internalId;

	@Temporal(TemporalType.DATE)
	@Column(name="ORIGINAL_ORDER_DATE")
	private java.util.Date originalOrderDate;

	public OrderPK() {
	}
	public BigInteger getInternalId() {
		return this.internalId;
	}
	public void setInternalId(BigInteger internalId) {
		this.internalId = internalId;
	}
	public java.util.Date getOriginalOrderDate() {
		return this.originalOrderDate;
	}
	public void setOriginalOrderDate(java.util.Date originalOrderDate) {
		this.originalOrderDate = originalOrderDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderPK)) {
			return false;
		}
		OrderPK castOther = (OrderPK)other;
		return 
			(this.internalId == castOther.internalId)
			&& this.originalOrderDate.equals(castOther.originalOrderDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.originalOrderDate.hashCode();
		
		return hash;
	}
}