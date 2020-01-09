package com.slokam.test.service.impl;

import com.slokam.test.entity.Shortlisted;
import com.slokam.test.repo.ShortlistedRepo;
import com.slokam.test.service.ShortlistedService;
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
