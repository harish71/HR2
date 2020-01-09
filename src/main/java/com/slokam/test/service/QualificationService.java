package com.slokam.hr.service;

import com.slokam.hr.entity.Qualification;
import com.slokam.hr.repo.QualificationRepo;

import java.util.*;

public interface QualificationService {
	
	public List<Qualification> getAll();
	public Qualification getById(Integer id);
	public Qualification save(Qualification Qualification);
	public void remove(Qualification Qualification);
    public void remove(Integer id);
}
