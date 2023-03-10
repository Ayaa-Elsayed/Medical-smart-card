package com.ayaagroup.demo.entity.user.doctor.lab;

import com.ayaagroup.demo.entity.prescription.LabScans;
import com.ayaagroup.demo.entity.prescription.LabTests;
import com.ayaagroup.demo.entity.user.doctor.pharmacy.Pharmacist;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lab_address")
public class LabAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "labAddress_id")
    private Integer labAddress_id;

    @Column(name = "Lab Name")
    private String labName;

    private Integer labTechnicianId;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "apartment")
    private String apartment;



    @JsonManagedReference
    @OneToMany(mappedBy = "labAddress")
    private List<LabTests> labTests;

    @JsonManagedReference
    @OneToMany(mappedBy = "labAddress")
    private List<LabScans> labScans;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "labTechnicianId", insertable = false, updatable = false)
    private  LabTechnician labTechnicianEntity;
}
