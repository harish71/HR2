package com.slokam.hr.service;

import com.slokam.hr.entity.Shortlisted;
import com.slokam.hr.repo.ShortlistedRepo;

import java.util.*;

public interface ShortlistedService {
	
	public List<Shortlisted> getAll();
	public Shortlisted getById(Integer id);
	public Shortlisted save(Shortlisted Shortlisted);
	public void remove(Shortlisted Shortlisted);
    public void remove(Integer id);
}
