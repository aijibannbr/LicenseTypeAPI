package com.example.licensetypeapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LicenseType {
    @Id
    private String licenseTypeCode;
    private String description;
    private String descriptionTranslated;
    private String ministryCode;
    private String ministryDescription;
    private boolean canBeUsedPartially;
    private boolean active;
}