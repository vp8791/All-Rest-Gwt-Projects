package org.zerhusen.model.aml.grid;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the GRID_PROPERTY database table.
 * 
 */
@Entity
@Table(name="GRID_PROPERTY")
@NamedQuery(name="GridProperty.findAll", query="SELECT g FROM GridProperty g")
public class GridProperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GRID_ID")
	private String gridId;

	@Column(name="ROWS_PER_PAGE")
	private BigDecimal rowsPerPage;

	private String title;

	@Column(name="UPDATE_DATE")
	private Timestamp updateDate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	public GridProperty() {
	}

	public String getGridId() {
		return this.gridId;
	}

	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	public BigDecimal getRowsPerPage() {
		return this.rowsPerPage;
	}

	public void setRowsPerPage(BigDecimal rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}