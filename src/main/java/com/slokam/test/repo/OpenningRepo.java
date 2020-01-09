package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Openning;
				@Repository
				public interface OpenningRepo extends JpaRepository<Openning, Integer> {

				}
