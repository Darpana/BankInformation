package com.bankinfo.BankInformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bankinfo.BankInformation.entity.BankBranches;
import com.bankinfo.BankInformation.service.BanksDAOService;

@RestController
public class BankDetailsController {
	
	@Autowired
	private BanksDAOService bs;
	
	@GetMapping("/api/bank/{ifsc}")
	public BankBranches getBranchDetails(@PathVariable("ifsc") String ifsc){
		BankBranches bb = bs.getbranchDetails(String.valueOf(ifsc).toUpperCase());
		return bb;
	}
	
	@GetMapping("/api/bank/{bankName}/{city}")
	public List<BankBranches> getBranchDetails(@PathVariable("bankName") String bankName, @PathVariable("city") String city){
		List<BankBranches> bb = bs.getbankbranchDetails(bankName.toUpperCase(), city.toUpperCase());
		return bb;
	}
}
