package com.slokam.hr.service;

import com.slokam.hr.entity.Skill;
import com.slokam.hr.repo.SkillRepo;

import java.util.*;

public interface SkillService {
	
	public List<Skill> getAll();
	public Skill getById(Integer id);
	public Skill save(Skill Skill);
	public void remove(Skill Skill);
    public void remove(Integer id);
}
