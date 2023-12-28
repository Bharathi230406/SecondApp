package com.tech.banks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tech.banks.entity.Banks;

public interface BanksRepository extends JpaRepository<Banks, Integer> {
	@Query(value = "SELECT branch FROM banks WHERE ifsc=?", nativeQuery = true)
	public String getBranchByIfsc(String ifsc);
}
