package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Offer;
				@Repository
				public interface OfferRepo extends JpaRepository<Offer, Integer> {

				}
