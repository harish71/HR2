package com.slokam.hr.service;

import com.slokam.hr.entity.Position;
import com.slokam.hr.repo.PositionRepo;

import java.util.*;

public interface PositionService {
	
	public List<Position> getAll();
	public Position getById(Integer id);
	public Position save(Position Position);
	public void remove(Position Position);
    public void remove(Integer id);
}
