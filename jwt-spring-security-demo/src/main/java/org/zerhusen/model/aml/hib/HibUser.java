package org.zerhusen.model.aml.hib;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="HibUser.findAll", query="SELECT u FROM HibUser u")
public class HibUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String email;

	private BigDecimal enabled;

	private String firstname;

	private String lastname;

	private Timestamp lastpasswordresetdate;

	private String password;

	private String username;

	public HibUser() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEnabled() {
		return this.enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Timestamp getLastpasswordresetdate() {
		return this.lastpasswordresetdate;
	}

	public void setLastpasswordresetdate(Timestamp lastpasswordresetdate) {
		this.lastpasswordresetdate = lastpasswordresetdate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}