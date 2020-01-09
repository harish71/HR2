package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Candidate;
				@Repository
				public interface CandidateRepo extends JpaRepository<Candidate, Integer> {

				}
