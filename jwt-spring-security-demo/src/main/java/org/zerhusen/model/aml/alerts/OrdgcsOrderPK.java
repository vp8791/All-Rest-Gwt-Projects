package org.zerhusen.model.aml.alerts;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

/**
 * The primary key class for the ORDGCS_ORDERS database table.
 * 
 */
@Embeddable
public class OrdgcsOrderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INTERNAL_ID")
	private BigInteger internalId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ORDER_DATE")
	private java.util.Date orderDate;

	public OrdgcsOrderPK() {
	}
	public BigInteger getInternalId() {
		return this.internalId;
	}
	public void setInternalId(BigInteger internalId) {
		this.internalId = internalId;
	}
	public java.util.Date getOrderDate() {
		return this.orderDate;
	}
	public void setOrderDate(java.util.Date orderDate) {
		this.orderDate = orderDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrdgcsOrderPK)) {
			return false;
		}
		OrdgcsOrderPK castOther = (OrdgcsOrderPK)other;
		return 
			(this.internalId == castOther.internalId)
			&& this.orderDate.equals(castOther.orderDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderDate.hashCode();
		
		return hash;
	}
}