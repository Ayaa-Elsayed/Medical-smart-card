package com.ayaagroup.demo.entity.user.doctor.specialistDoctor;

import com.ayaagroup.demo.entity.prescription.PrescriptionEntity;
import com.ayaagroup.demo.entity.user.User;
import com.ayaagroup.demo.entity.user.doctor.pharmacy.PharmacyAddress;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "specialist_doctor")
@Table(name = "SpecialistDoctor",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "specialist_doctor_id")})
//@DiscriminatorValue("specialist_doctor")
public class SpecialistDoctor extends User {

    //don't forget to make it unique in the db
    @Column(name = "specialist_doctor_id")
    private Integer specialistDoctorId;

    @Column(name = "specialization")
    private String specialization;

    //asdy hna a5saey wla est4ary
    @Column(name = "experience")
    private String experience;

    @Column(name = "hospital_name")
    private String hospitalName;


    @JsonManagedReference
    @OneToMany(mappedBy = "specialistDoctor")
    private List<hospitalAddress> hospitalAddresses;

    @JsonManagedReference
    @OneToOne(mappedBy = "specialistDoctor")
    private PrescriptionEntity prescriptionEntity;

}
