package org.zerhusen.model.aml.audit;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the JWT_AUDIT database table.
 * 
 */
@Entity
@Table(name="JWT_AUDIT")
@NamedQuery(name="JwtAudit.findAll", query="SELECT j FROM JwtAudit j")
public class JwtAudit implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="JWT_AUDIT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JWT_AUDIT_SEQUENCE")
	@SequenceGenerator(sequenceName = "JWT_AUDIT_SEQUENCE", allocationSize = 1, name = "JWT_AUDIT_SEQUENCE")
	private long jwtAuditId;

	@Column(name="JWT_TOKEN")
	private String jwtToken;


	public JwtAudit() {
	}

	public long getJwtAuditId() {
		return this.jwtAuditId;
	}

	public void setJwtAuditId(long jwtAuditId) {
		this.jwtAuditId = jwtAuditId;
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}


}