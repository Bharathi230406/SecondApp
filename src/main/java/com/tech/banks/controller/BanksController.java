package com.tech.banks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tech.banks.entity.Banks;
import com.tech.banks.service.BanksService;

@RestController
@RequestMapping(value = "/banks")
public class BanksController {
	@Autowired
	BanksService bankser;

	@PostMapping(value = "/insertList")
	public String addBankList(@RequestBody List<Banks> b) {
		return bankser.addBankList(b);
	}

	@GetMapping(value = "/getList")
	public List<Banks> getBankList() {
		return bankser.getBankList();
	}

	@PutMapping(value = "/update")
	public String updateBanks(@RequestBody List<Banks> b) {
		return bankser.updateBanks(b);
	}

	@GetMapping(value = "/getById/{id}")
	public Banks getById(@PathVariable int id) {
		return bankser.getById(id);
	}

	@GetMapping(value = "/getBranch/{ifsc}")
	public String getBranchByIfsc(@PathVariable String ifsc) {
		return bankser.getBranchByIfsc(ifsc);
	}
}
