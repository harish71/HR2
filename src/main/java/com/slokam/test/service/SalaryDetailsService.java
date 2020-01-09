package com.slokam.hr.service;

import com.slokam.hr.entity.SalaryDetails;
import com.slokam.hr.repo.SalaryDetailsRepo;

import java.util.*;

public interface SalaryDetailsService {
	
	public List<SalaryDetails> getAll();
	public SalaryDetails getById(Integer id);
	public SalaryDetails save(SalaryDetails SalaryDetails);
	public void remove(SalaryDetails SalaryDetails);
    public void remove(Integer id);
}
