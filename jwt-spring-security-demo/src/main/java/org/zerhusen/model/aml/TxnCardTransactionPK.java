package org.zerhusen.model.aml;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

/**
 * The primary key class for the TXN_CARD_TRANSACTIONS database table.
 * 
 */
@Embeddable
public class TxnCardTransactionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="TXN_DATE")
	private java.util.Date txnDate;

	@Column(name="INTERNAL_ID")
	private BigInteger internalId;

	public TxnCardTransactionPK() {
	}
	public java.util.Date getTxnDate() {
		return this.txnDate;
	}
	public void setTxnDate(java.util.Date txnDate) {
		this.txnDate = txnDate;
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
		if (!(other instanceof TxnCardTransactionPK)) {
			return false;
		}
		TxnCardTransactionPK castOther = (TxnCardTransactionPK)other;
		return 
			this.txnDate.equals(castOther.txnDate)
			&& (this.internalId == castOther.internalId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.txnDate.hashCode();		
		return hash;
	}
}