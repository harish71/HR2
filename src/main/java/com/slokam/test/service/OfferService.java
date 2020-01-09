package com.slokam.test.service;

import com.slokam.test.entity.Offer;
import com.slokam.test.repo.OfferRepo;

import java.util.*;

public interface OfferService {
	
	public List<Offer> getAll();
	public Offer getById(Integer id);
	public Offer save(Offer Offer);
	public void remove(Offer Offer);
    public void remove(Integer id);
}
