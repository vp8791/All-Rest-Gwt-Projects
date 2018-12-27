package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the APPLICATION_SESSION_ROLE database table.
 * 
 */
@Entity
@Table(name="APPLICATION_SESSION_ROLE")
@NamedQuery(name="ApplicationSessionRole.findAll", query="SELECT a FROM ApplicationSessionRole a")
public class ApplicationSessionRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApplicationSessionRolePK id;

	public ApplicationSessionRole() {
	}

	public ApplicationSessionRolePK getId() {
		return this.id;
	}

	public void setId(ApplicationSessionRolePK id) {
		this.id = id;
	}

}