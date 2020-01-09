package com.slokam.hr.service;

import com.slokam.hr.entity.InteviewLevel;
import com.slokam.hr.repo.InteviewLevelRepo;

import java.util.*;

public interface InteviewLevelService {
	
	public List<InteviewLevel> getAll();
	public InteviewLevel getById(Integer id);
	public InteviewLevel save(InteviewLevel InteviewLevel);
	public void remove(InteviewLevel InteviewLevel);
    public void remove(Integer id);
}
