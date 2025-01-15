package com.example.response;

import lombok.Data;

@Data
public class BannerVisibilityResponse {
    private boolean showLiveBanner;
    private boolean showCancelledBanner;

    // Getters and setters
}
