package org.zerhusen.model.aml.hib;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER_AUTHORITY database table.
 * 
 */
@Entity
@Table(name="USER_AUTHORITY")
@NamedQuery(name="HibUserAuthority.findAll", query="SELECT u FROM HibUserAuthority u")
public class HibUserAuthority implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HibUserAuthorityPK id;

	public HibUserAuthority() {
	}

	public HibUserAuthorityPK getId() {
		return this.id;
	}

	public void setId(HibUserAuthorityPK id) {
		this.id = id;
	}

}