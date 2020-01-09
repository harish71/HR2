package com.slokam.test.service;

import com.slokam.test.entity.InterviewInvitation;
import com.slokam.test.repo.InterviewInvitationRepo;

import java.util.*;

public interface InterviewInvitationService {
	
	public List<InterviewInvitation> getAll();
	public InterviewInvitation getById(Integer id);
	public InterviewInvitation save(InterviewInvitation InterviewInvitation);
	public void remove(InterviewInvitation InterviewInvitation);
    public void remove(Integer id);
}
