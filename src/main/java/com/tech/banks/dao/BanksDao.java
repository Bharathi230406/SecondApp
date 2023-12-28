package com.tech.banks.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.banks.entity.Banks;
import com.tech.banks.repository.BanksRepository;

@Repository
public class BanksDao {
	@Autowired
	BanksRepository bankrepo;

	public String addBankList(List<Banks> b) {
		bankrepo.saveAll(b);
		return "List added successfully";
	}

	public List<Banks> getBankList() {
		return bankrepo.findAll();

	}

	public String updateBanks(List<Banks> b) {
		bankrepo.saveAll(b);
		return "List Updated Successfully";
	}

	public Banks getById(int id) {
		return bankrepo.findById(id).get();
	}

	public String getBranchByIfsc(@PathVariable String ifsc) {
		return bankrepo.getBranchByIfsc(ifsc);
	}
}
