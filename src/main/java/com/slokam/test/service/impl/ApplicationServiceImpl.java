package com.slokam.hr.service.impl;

import com.slokam.hr.entity.Application;
import com.slokam.hr.repo.ApplicationRepo;
import com.slokam.hr.service.ApplicationService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ApplicationServiceImpl implements ApplicationService {

      
   

	@Autowired
	private ApplicationRepo repo;
	
	@Override
	public List<Application> getAll() {
		return repo.findAll();
	}

	@Override
	public Application getById(Integer id) {
		
		Optional<Application> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Application save(Application todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Application todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
