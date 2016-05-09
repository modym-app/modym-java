/************************************************************************
 * Copyright MODYM, Ltd.
 */
package com.modym.client.objects;

import java.math.BigDecimal;

import org.joda.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bashar
 *
 */
@Getter
@Setter
public class ModymCustomer extends UDFType {

    private long customerId;
    private String referenceId;
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneMobile;
    private String phoneOther;
    private ModymGender gender;
    private ModymMaritalStatus maritalStatus;
    private LocalDate dateOfBirth;
    private Integer age;
    private String address1;
    private String address2;
    private String zip;
    private String city;
    private String country;
    private String company;
    private String position;
    private String language;
    private LocalDate registered;

    private BigDecimal lifetimeRevenue = null;
    private String lifetimeRevenueCurrency = null;
    private Integer activityCount = null;
    private Integer purchaseCount = null;
    private LocalDate lastActivity = null;
    private LocalDate lastPurchase = null;

    private Long accountId;
    private Long levelId;
    private String levelName;
    private BigDecimal totalPoints;
    private BigDecimal availablePoints;
    private LocalDate loyaltyJoinDate;

    private boolean enabled;

    public static enum ModymGender {
        MALE,
        FEMALE,
        UNSPECIFIED;
    }

    public static enum ModymMaritalStatus {
        SINGLE,
        MARRIED,
        WIDOWED,
        DIVORCED,
        UNSPECIFIED;
    }
}