package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Application;
				@Repository
				public interface ApplicationRepo extends JpaRepository<Application, Integer> {

				}
