package com.example.service;
import com.example.entity.ThryvLeadsBannerVisibility;
import com.example.repository.ThryvLeadsBannerVisibilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThryvLeadsBannerVisibilityService {

    @Autowired
    private ThryvLeadsBannerVisibilityRepository repository;

    public ThryvLeadsBannerVisibility saveBannerVisibility(ThryvLeadsBannerVisibility bannerVisibility) {
        return repository.save(bannerVisibility);
    }

    public List<ThryvLeadsBannerVisibility> getAllBannerVisibilities() {
        return repository.findAll();
    }

    public ThryvLeadsBannerVisibility getBannerVisibilityById(Long id) {
        return repository.findById(id).orElse(null);
    }
}