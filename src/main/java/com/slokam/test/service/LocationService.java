package com.slokam.test.service;

import com.slokam.test.entity.Location;
import com.slokam.test.repo.LocationRepo;

import java.util.*;

public interface LocationService {
	
	public List<Location> getAll();
	public Location getById(Integer id);
	public Location save(Location Location);
	public void remove(Location Location);
    public void remove(Integer id);
}
