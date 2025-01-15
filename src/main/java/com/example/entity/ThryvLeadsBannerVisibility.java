package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "thryv_leads_banner_visibility")
public class ThryvLeadsBannerVisibility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "thryv_id", nullable = false, length = 255)
    private String thryvId;

    @Column(name = "tlc_id", nullable = false, length = 255)
    private String tlcId;

    @Column(name = "user_id", length = 50)
    private String userId;

    @Column(name = "user_type", length = 20)
    private String userType;

    @Column(name = "show_live_banner", nullable = false)
    private Boolean showLiveBanner = true;

    @Column(name = "show_cancelled_banner", nullable = false)
    private Boolean showCancelledBanner = true;

    @Column(name = "created_date", nullable = false, updatable = false)
    private Timestamp createdDate;

    @Column(name = "created_by", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "updated_date", nullable = false)
    private Timestamp updatedDate;

    @Column(name = "updated_by", length = 50)
    private String updatedBy;
}


