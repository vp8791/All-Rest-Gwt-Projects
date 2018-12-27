package org.zerhusen.pojos;

import java.io.Serializable;

public class Cpp implements Serializable {
	
	public String getCpp() {
		return cpp;
	}
	public void setCpp(String cpp) {
		this.cpp = cpp;
	}
	public int getCppId() {
		return cppId;
	}
	public void setCppId(int cppId) {
		this.cppId = cppId;
	}
	public String getCppTranctionId() {
		return cppTranctionId;
	}
	public void setCppTranctionId(String cppTranctionId) {
		this.cppTranctionId = cppTranctionId;
	}
	public String getTransactionReference() {
		return transactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
	private String cpp;
	private int cppId;
	private String cppTranctionId;
	private String transactionReference;

}
