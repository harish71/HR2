package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Joining;
				@Repository
				public interface JoiningRepo extends JpaRepository<Joining, Integer> {

				}
