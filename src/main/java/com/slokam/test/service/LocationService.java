package com.slokam.hr.service;

import com.slokam.hr.entity.Location;
import com.slokam.hr.repo.LocationRepo;

import java.util.*;

public interface LocationService {
	
	public List<Location> getAll();
	public Location getById(Integer id);
	public Location save(Location Location);
	public void remove(Location Location);
    public void remove(Integer id);
}
