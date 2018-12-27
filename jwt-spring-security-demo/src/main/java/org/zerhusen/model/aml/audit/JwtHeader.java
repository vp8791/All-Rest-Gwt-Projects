package org.zerhusen.model.aml.audit;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the JWT_HEADERS database table.
 * 
 */
@Entity
@Table(name="JWT_HEADERS")
@NamedQuery(name="JwtHeader.findAll", query="SELECT j FROM JwtHeader j")
public class JwtHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JWT_HEADERS_SEQUENCE")
	@SequenceGenerator(sequenceName = "JWT_HEADERS_SEQUENCE", allocationSize = 1, name = "JWT_HEADERS_SEQUENCE")
	private long id;

	@Column(name="HEADER_VALUE")
	private String headerValue;

	@Column(name="HEADER_NAME")
	private String headerName;
	
	@Column(name="JWT_AUDIT_ID")
	private Long jwtAuditId;

	public JwtHeader() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getJwtAuditId() {
		return jwtAuditId;
	}

	public void setJwtAuditId(Long jwtAuditId) {
		this.jwtAuditId = jwtAuditId;
	}

	public String getHeaderValue() {
		return this.headerValue;
	}

	public void setHeaderValue(String headerValue) {
		this.headerValue = headerValue;
	}


	public String getHeaderName() {
		return headerName;
	}

	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}


}