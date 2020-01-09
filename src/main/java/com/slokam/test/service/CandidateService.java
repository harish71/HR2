package com.slokam.hr.service;

import com.slokam.hr.entity.Candidate;
import com.slokam.hr.repo.CandidateRepo;

import java.util.*;

public interface CandidateService {
	
	public List<Candidate> getAll();
	public Candidate getById(Integer id);
	public Candidate save(Candidate Candidate);
	public void remove(Candidate Candidate);
    public void remove(Integer id);
}
