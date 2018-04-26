package com.bankinfo.BankInformation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankinfo.BankInformation.entity.BankBranches;
import com.bankinfo.BankInformation.repository.BanksBranchesRepository;
import com.bankinfo.BankInformation.service.BanksDAOService;

@Service
public class BanksDAOServiceImpl implements BanksDAOService{
	
	@Autowired
	private BanksBranchesRepository bbr;

	public BankBranches getbranchDetails(String ifsc){
		BankBranches bb = bbr.findByIfsc(ifsc);
		return bb;
	}
	
	public List<BankBranches> getbankbranchDetails(String bankName, String city){
		List<BankBranches> bb = bbr.findByNameCity(bankName, city);
		return bb;
	}
}
