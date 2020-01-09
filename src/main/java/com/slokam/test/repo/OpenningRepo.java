package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Openning;
				@Repository
				public interface OpenningRepo extends JpaRepository<Openning, Integer> {

				}
