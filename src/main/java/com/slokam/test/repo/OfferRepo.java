package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Offer;
				@Repository
				public interface OfferRepo extends JpaRepository<Offer, Integer> {

				}
