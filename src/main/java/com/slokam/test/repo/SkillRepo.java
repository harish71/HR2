package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Skill;
				@Repository
				public interface SkillRepo extends JpaRepository<Skill, Integer> {

				}
