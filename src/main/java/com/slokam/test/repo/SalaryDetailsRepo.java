package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.SalaryDetails;
				@Repository
				public interface SalaryDetailsRepo extends JpaRepository<SalaryDetails, Integer> {

				}
