package com.slokam.test.service;

import com.slokam.test.entity.SalaryDetails;
import com.slokam.test.repo.SalaryDetailsRepo;

import java.util.*;

public interface SalaryDetailsService {
	
	public List<SalaryDetails> getAll();
	public SalaryDetails getById(Integer id);
	public SalaryDetails save(SalaryDetails SalaryDetails);
	public void remove(SalaryDetails SalaryDetails);
    public void remove(Integer id);
}
