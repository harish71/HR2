package com.slokam.test.service;

import com.slokam.test.entity.Skill;
import com.slokam.test.repo.SkillRepo;

import java.util.*;

public interface SkillService {
	
	public List<Skill> getAll();
	public Skill getById(Integer id);
	public Skill save(Skill Skill);
	public void remove(Skill Skill);
    public void remove(Integer id);
}
