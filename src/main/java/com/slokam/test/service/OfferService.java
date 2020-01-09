package com.slokam.hr.service;

import com.slokam.hr.entity.Offer;
import com.slokam.hr.repo.OfferRepo;

import java.util.*;

public interface OfferService {
	
	public List<Offer> getAll();
	public Offer getById(Integer id);
	public Offer save(Offer Offer);
	public void remove(Offer Offer);
    public void remove(Integer id);
}
