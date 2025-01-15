package com.example.repository;

import com.example.entity.ThryvLeadsBannerVisibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThryvLeadsBannerVisibilityRepository extends JpaRepository<ThryvLeadsBannerVisibility, Long> {
    // Custom query methods can be defined here if needed
}
