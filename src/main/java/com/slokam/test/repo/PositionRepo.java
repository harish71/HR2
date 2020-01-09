package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Position;
				@Repository
				public interface PositionRepo extends JpaRepository<Position, Integer> {

				}
