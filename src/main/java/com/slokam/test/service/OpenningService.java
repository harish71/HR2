package com.slokam.test.service;

import com.slokam.test.entity.Openning;
import com.slokam.test.repo.OpenningRepo;

import java.util.*;

public interface OpenningService {
	
	public List<Openning> getAll();
	public Openning getById(Integer id);
	public Openning save(Openning Openning);
	public void remove(Openning Openning);
    public void remove(Integer id);
}
