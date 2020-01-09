package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Candidate;
				@Repository
				public interface CandidateRepo extends JpaRepository<Candidate, Integer> {

				}
