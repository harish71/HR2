package com.slokam.test.service;

import com.slokam.test.entity.Position;
import com.slokam.test.repo.PositionRepo;

import java.util.*;

public interface PositionService {
	
	public List<Position> getAll();
	public Position getById(Integer id);
	public Position save(Position Position);
	public void remove(Position Position);
    public void remove(Integer id);
}
