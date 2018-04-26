package com.bankinfo.BankInformation.service;

import java.util.List;

import com.bankinfo.BankInformation.entity.BankBranches;

public interface BanksDAOService {

	public BankBranches getbranchDetails(String ifsc);
	public List<BankBranches> getbankbranchDetails(String bankName, String city);
}