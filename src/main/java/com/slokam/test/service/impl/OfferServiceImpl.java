package com.slokam.hr.service.impl;

import com.slokam.hr.entity.Offer;
import com.slokam.hr.repo.OfferRepo;
import com.slokam.hr.service.OfferService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OfferServiceImpl implements OfferService {

      
   

	@Autowired
	private OfferRepo repo;
	
	@Override
	public List<Offer> getAll() {
		return repo.findAll();
	}

	@Override
	public Offer getById(Integer id) {
		
		Optional<Offer> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Offer save(Offer todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Offer todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
