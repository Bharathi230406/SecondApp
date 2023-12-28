package com.tech.banks.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.tech.banks.dao.BanksDao;
import com.tech.banks.entity.Banks;

@Service
public class BanksService {
	@Autowired
	BanksDao bankdao;

	public String addBankList(List<Banks> b) {
		return bankdao.addBankList(b);
	}

	public List<Banks> getBankList() {
		return bankdao.getBankList();
	}

	public String updateBanks(List<Banks> b) {
		return bankdao.updateBanks(b);
	}

	public Banks getById(int id) {
		return bankdao.getById(id);
	}

	public String getBranchByIfsc(@PathVariable String ifsc) {
		return bankdao.getBranchByIfsc(ifsc);
	}

}
