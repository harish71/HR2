package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Skill;
				@Repository
				public interface SkillRepo extends JpaRepository<Skill, Integer> {

				}
