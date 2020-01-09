package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Joining;
				@Repository
				public interface JoiningRepo extends JpaRepository<Joining, Integer> {

				}
