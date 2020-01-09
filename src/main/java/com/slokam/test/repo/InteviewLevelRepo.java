package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.InteviewLevel;
				@Repository
				public interface InteviewLevelRepo extends JpaRepository<InteviewLevel, Integer> {

				}
