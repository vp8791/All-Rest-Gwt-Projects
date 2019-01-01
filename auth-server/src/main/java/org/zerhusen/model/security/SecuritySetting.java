package org.zerhusen.model.security;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SECURITY_SETTINGS database table.
 * 
 */
@Entity
@Table(name="SECURITY_SETTINGS")
public class SecuritySetting  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="KEY")
	private String key;

	@Column(name="VALUE")
	private String value;

	public SecuritySetting() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}