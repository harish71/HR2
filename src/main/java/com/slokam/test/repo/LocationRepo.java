package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Location;
				@Repository
				public interface LocationRepo extends JpaRepository<Location, Integer> {

				}
