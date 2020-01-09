package com.slokam.test.service;

import com.slokam.test.entity.InteviewLevel;
import com.slokam.test.repo.InteviewLevelRepo;

import java.util.*;

public interface InteviewLevelService {
	
	public List<InteviewLevel> getAll();
	public InteviewLevel getById(Integer id);
	public InteviewLevel save(InteviewLevel InteviewLevel);
	public void remove(InteviewLevel InteviewLevel);
    public void remove(Integer id);
}
