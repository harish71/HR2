package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.SalaryDetails;
				@Repository
				public interface SalaryDetailsRepo extends JpaRepository<SalaryDetails, Integer> {

				}
