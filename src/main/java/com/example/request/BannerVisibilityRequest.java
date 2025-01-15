package com.example.request;

import lombok.Data;

@Data
public class BannerVisibilityRequest {
    private String thryvId;
    private String tlcId;
    private String userId;
    private String userType;

    // Getters and setters
}
