package com.slokam.test.service.impl;

import com.slokam.test.entity.Joining;
import com.slokam.test.repo.JoiningRepo;
import com.slokam.test.service.JoiningService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class JoiningServiceImpl implements JoiningService {

      
   

	@Autowired
	private JoiningRepo repo;
	
	@Override
	public List<Joining> getAll() {
		return repo.findAll();
	}

	@Override
	public Joining getById(Integer id) {
		
		Optional<Joining> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Joining save(Joining todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Joining todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
