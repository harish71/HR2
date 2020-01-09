package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Shortlisted;
				@Repository
				public interface ShortlistedRepo extends JpaRepository<Shortlisted, Integer> {

				}
