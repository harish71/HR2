package com.slokam.hr.service;

import com.slokam.hr.entity.Application;
import com.slokam.hr.repo.ApplicationRepo;

import java.util.*;

public interface ApplicationService {
	
	public List<Application> getAll();
	public Application getById(Integer id);
	public Application save(Application Application);
	public void remove(Application Application);
    public void remove(Integer id);
}
