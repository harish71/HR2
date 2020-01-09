package com.slokam.test.service.impl;

import com.slokam.test.entity.Qualification;
import com.slokam.test.repo.QualificationRepo;
import com.slokam.test.service.QualificationService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class QualificationServiceImpl implements QualificationService {

      
   

	@Autowired
	private QualificationRepo repo;
	
	@Override
	public List<Qualification> getAll() {
		return repo.findAll();
	}

	@Override
	public Qualification getById(Integer id) {
		
		Optional<Qualification> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Qualification save(Qualification todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Qualification todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
