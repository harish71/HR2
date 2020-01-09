package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.InterviewInvitation;
				@Repository
				public interface InterviewInvitationRepo extends JpaRepository<InterviewInvitation, Integer> {

				}
