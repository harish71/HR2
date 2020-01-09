package com.slokam.test.service;

import com.slokam.test.entity.Candidate;
import com.slokam.test.repo.CandidateRepo;

import java.util.*;

public interface CandidateService {
	
	public List<Candidate> getAll();
	public Candidate getById(Integer id);
	public Candidate save(Candidate Candidate);
	public void remove(Candidate Candidate);
    public void remove(Integer id);
}
