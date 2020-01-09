package com.slokam.hr.service.impl;

import com.slokam.hr.entity.Shortlisted;
import com.slokam.hr.repo.ShortlistedRepo;
import com.slokam.hr.service.ShortlistedService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ShortlistedServiceImpl implements ShortlistedService {

      
   

	@Autowired
	private ShortlistedRepo repo;
	
	@Override
	public List<Shortlisted> getAll() {
		return repo.findAll();
	}

	@Override
	public Shortlisted getById(Integer id) {
		
		Optional<Shortlisted> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Shortlisted save(Shortlisted todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Shortlisted todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
