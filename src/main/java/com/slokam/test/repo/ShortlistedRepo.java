package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Shortlisted;
				@Repository
				public interface ShortlistedRepo extends JpaRepository<Shortlisted, Integer> {

				}
