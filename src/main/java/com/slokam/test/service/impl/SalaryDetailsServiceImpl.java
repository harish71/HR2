package com.slokam.hr.service.impl;

import com.slokam.hr.entity.SalaryDetails;
import com.slokam.hr.repo.SalaryDetailsRepo;
import com.slokam.hr.service.SalaryDetailsService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SalaryDetailsServiceImpl implements SalaryDetailsService {

      
   

	@Autowired
	private SalaryDetailsRepo repo;
	
	@Override
	public List<SalaryDetails> getAll() {
		return repo.findAll();
	}

	@Override
	public SalaryDetails getById(Integer id) {
		
		Optional<SalaryDetails> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public SalaryDetails save(SalaryDetails todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(SalaryDetails todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
