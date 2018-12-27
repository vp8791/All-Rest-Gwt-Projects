package org.zerhusen.model.aml.hib;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AUTHORITY database table.
 * 
 */
@Entity
@Table(name = "AUTHORITY")
@NamedQuery(name="HibAuthority.findAll", query="SELECT a FROM HibAuthority a")
public class HibAuthority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String name;

	public HibAuthority() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}