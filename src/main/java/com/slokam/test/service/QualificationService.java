package com.slokam.test.service;

import com.slokam.test.entity.Qualification;
import com.slokam.test.repo.QualificationRepo;

import java.util.*;

public interface QualificationService {
	
	public List<Qualification> getAll();
	public Qualification getById(Integer id);
	public Qualification save(Qualification Qualification);
	public void remove(Qualification Qualification);
    public void remove(Integer id);
}
