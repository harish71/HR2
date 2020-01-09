package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.InterviewInvitation;
				@Repository
				public interface InterviewInvitationRepo extends JpaRepository<InterviewInvitation, Integer> {

				}
