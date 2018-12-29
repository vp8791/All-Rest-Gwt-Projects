package org.zerhusen.model.aml.alerts;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TXN_ALERTS database table.
 * 
 */
@Embeddable
public class TxnAlertPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ALERT_ID")
	private String alertId;

	private long pan;

	public TxnAlertPK() {
	}
	public String getAlertId() {
		return this.alertId;
	}
	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}
	public long getPan() {
		return this.pan;
	}
	public void setPan(long pan) {
		this.pan = pan;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TxnAlertPK)) {
			return false;
		}
		TxnAlertPK castOther = (TxnAlertPK)other;
		return 
			this.alertId.equals(castOther.alertId)
			&& (this.pan == castOther.pan);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.alertId.hashCode();
		hash = hash * prime + ((int) (this.pan ^ (this.pan >>> 32)));
		
		return hash;
	}
}