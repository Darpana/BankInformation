package com.bankinfo.BankInformation.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bankinfo.BankInformation.entity.BankBranches;


@Transactional
public interface BanksBranchesRepository extends JpaRepository<BankBranches, Long>{
	
	@Query("Select p from BankBranches p where p.ifsc=:ifsc")
	public BankBranches findByIfsc(@Param("ifsc") String ifsc);
	
	@Query("Select p from BankBranches p where p.bankName=:bank_name and p.city=:city")
	public List<BankBranches> findByNameCity(@Param("bank_name") String bankName, @Param("city") String city);
}