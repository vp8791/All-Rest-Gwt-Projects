package org.zerhusen.security.repository.hib.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class HibUsersDto implements Serializable {

	private long id;

	private String email;

	private BigDecimal enabled;

	private String firstname;

	private String lastname;

	private Timestamp lastpasswordresetdate;

	private String password;

	private String username;
	
	private List<HibAuthorityDto> hibAuthorities;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEnabled() {
		return enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Timestamp getLastpasswordresetdate() {
		return lastpasswordresetdate;
	}

	public void setLastpasswordresetdate(Timestamp lastpasswordresetdate) {
		this.lastpasswordresetdate = lastpasswordresetdate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<HibAuthorityDto> getHibAuthorities() {
		return hibAuthorities;
	}

	public void setHibAuthorities(List<HibAuthorityDto> hibAuthorities) {
		this.hibAuthorities = hibAuthorities;
	}
	
	
	
}
