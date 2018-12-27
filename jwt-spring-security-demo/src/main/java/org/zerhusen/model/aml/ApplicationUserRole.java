package org.zerhusen.model.aml;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the APPLICATION_USER_ROLE database table.
 * 
 */
@Entity
@Table(name="APPLICATION_USER_ROLE")
@NamedQuery(name="ApplicationUserRole.findAll", query="SELECT a FROM ApplicationUserRole a")
public class ApplicationUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApplicationUserRolePK id;

	public ApplicationUserRole() {
	}

	public ApplicationUserRolePK getId() {
		return this.id;
	}

	public void setId(ApplicationUserRolePK id) {
		this.id = id;
	}

}