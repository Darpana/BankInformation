package com.bankinfo.BankInformation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "bank_branches")
public class BankBranches {
	
	private String ifsc;
	private String branch;
	private String address;
	private String city;
	private String state;
	private String district;
//	private Banks bank1;
	private int bankId;
	private String bankName;
	
	@Id
	@Column(name = "ifsc")
	@JsonProperty("ifsc")
	public String getIfsc() {
		return ifsc;
	}
	
//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
//	@JoinColumn(name = "bank_id", insertable = false, updatable = false)
//	public Banks getBank1() {
//		return bank1;
//	}
//	public void setBank1(Banks bank1) {
//		this.bank1 = bank1;
//	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	@Column(name = "branch")
	@JsonProperty("branch")
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Column(name = "address")
	@JsonProperty("address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "city")
	@JsonProperty("city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "state")
	@JsonProperty("state")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name = "district")
	@JsonProperty("district")
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	@Column(name = "bank_id")
	@JsonProperty("bank_id")
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	
	@Column(name = "bank_name")
	@JsonProperty("bank_name")
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankBranches [ifsc=" + ifsc + ", branch=" + branch + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", district=" + district + ", bankId=" + bankId + ", bankName=" + bankName + "]";
	}
	
}
