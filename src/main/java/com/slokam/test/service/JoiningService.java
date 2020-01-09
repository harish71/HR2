package com.slokam.hr.service;

import com.slokam.hr.entity.Joining;
import com.slokam.hr.repo.JoiningRepo;

import java.util.*;

public interface JoiningService {
	
	public List<Joining> getAll();
	public Joining getById(Integer id);
	public Joining save(Joining Joining);
	public void remove(Joining Joining);
    public void remove(Integer id);
}
