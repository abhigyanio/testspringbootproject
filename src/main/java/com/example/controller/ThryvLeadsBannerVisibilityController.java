package com.example.controller;

import com.example.entity.ThryvLeadsBannerVisibility;
import com.example.service.ThryvLeadsBannerVisibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banner-visibility")
public class ThryvLeadsBannerVisibilityController {

    @Autowired
    private ThryvLeadsBannerVisibilityService service;

    @PostMapping
    public ResponseEntity<ThryvLeadsBannerVisibility> createBannerVisibility(@RequestBody ThryvLeadsBannerVisibility bannerVisibility) {
        ThryvLeadsBannerVisibility savedBannerVisibility = service.saveBannerVisibility(bannerVisibility);
        return ResponseEntity.ok(savedBannerVisibility);
    }
    @GetMapping
    public ResponseEntity<List<ThryvLeadsBannerVisibility>> getAllBannerVisibilities() {
        List<ThryvLeadsBannerVisibility> bannerVisibilities = service.getAllBannerVisibilities();
        return ResponseEntity.ok(bannerVisibilities);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ThryvLeadsBannerVisibility> getBannerVisibilityById(@PathVariable Long id) {
        ThryvLeadsBannerVisibility bannerVisibility = service.getBannerVisibilityById(id);
        return ResponseEntity.ok(bannerVisibility);
    }
}
