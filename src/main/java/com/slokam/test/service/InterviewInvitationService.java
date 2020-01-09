package com.slokam.hr.service;

import com.slokam.hr.entity.InterviewInvitation;
import com.slokam.hr.repo.InterviewInvitationRepo;

import java.util.*;

public interface InterviewInvitationService {
	
	public List<InterviewInvitation> getAll();
	public InterviewInvitation getById(Integer id);
	public InterviewInvitation save(InterviewInvitation InterviewInvitation);
	public void remove(InterviewInvitation InterviewInvitation);
    public void remove(Integer id);
}
