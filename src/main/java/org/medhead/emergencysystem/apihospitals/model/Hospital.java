package org.medhead.emergencysystem.apihospitals.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="longitude")
    private String longitude;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "bedsquantity")
    private String bedsQuantity;

    @Column(name = "bedsavailable")
    private String bedsAvailable;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "incidentid")
    private String incidentId;

    @Column(name = "attributedby")
    private String attributedBy;
}