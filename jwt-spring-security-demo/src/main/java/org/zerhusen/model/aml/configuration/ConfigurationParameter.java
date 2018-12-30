package org.zerhusen.model.aml.configuration;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CONFIGURATION_PARAMETERS database table.
 * 
 */
@Entity
@Table(name="CONFIGURATION_PARAMETERS")
@NamedQuery(name="ConfigurationParameter.findAll", query="SELECT c FROM ConfigurationParameter c")
public class ConfigurationParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONFIGURATION_ID")
	private long configurationId;

	@Column(name="KEY")
	private String key;

	@Column(name="VALUE")
	private String value;

	public ConfigurationParameter() {
	}

	public long getConfigurationId() {
		return this.configurationId;
	}

	public void setConfigurationId(long configurationId) {
		this.configurationId = configurationId;
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