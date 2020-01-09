package com.slokam.hr.service;

import com.slokam.hr.entity.Openning;
import com.slokam.hr.repo.OpenningRepo;

import java.util.*;

public interface OpenningService {
	
	public List<Openning> getAll();
	public Openning getById(Integer id);
	public Openning save(Openning Openning);
	public void remove(Openning Openning);
    public void remove(Integer id);
}
