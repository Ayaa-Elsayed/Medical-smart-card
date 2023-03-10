package com.ayaagroup.demo.entity.user.doctor.pharmacy;

import com.ayaagroup.demo.entity.prescription.RequiredMedication;
import com.ayaagroup.demo.entity.user.User;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "pharmacist")
//@DiscriminatorValue("job_type")
@Table(name = "Pharmacist",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "pharmacist_id")})
public class Pharmacist extends User {

    //don't forget to ake it unique in the db
    @Column(name = "pharmacist_id")
    private Integer pharmacistId;

    @Column(name = "pharmacy_name")
    private Integer pharmacyName;

    @JsonManagedReference
    @OneToMany(mappedBy = "pharmacistEntity")
    private List<PharmacyAddress> pharmacyAddresses;


    @JsonManagedReference
    @OneToMany(mappedBy = "pharmacist")
    private List<RequiredMedication> requiredMedications;



}
