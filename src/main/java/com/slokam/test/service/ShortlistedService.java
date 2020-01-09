package com.slokam.test.service;

import com.slokam.test.entity.Shortlisted;
import com.slokam.test.repo.ShortlistedRepo;

import java.util.*;

public interface ShortlistedService {
	
	public List<Shortlisted> getAll();
	public Shortlisted getById(Integer id);
	public Shortlisted save(Shortlisted Shortlisted);
	public void remove(Shortlisted Shortlisted);
    public void remove(Integer id);
}
