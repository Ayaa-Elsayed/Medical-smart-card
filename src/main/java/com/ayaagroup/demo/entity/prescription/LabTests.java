package com.ayaagroup.demo.entity.prescription;

import com.ayaagroup.demo.entity.user.doctor.lab.LabAddress;
import com.ayaagroup.demo.entity.user.doctor.lab.LabTechnician;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prescription Tests")
public class LabTests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    private Integer testId;

    @Column(name = "Test name")
    private String testName;

    @Column(name = "more notes")
    private String notes;

    @Column(name = "Test result")
    private String testResult;


    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id", insertable = false, updatable = false)
    private PrescriptionEntity prescriptionEntity;


    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "labAddress_id", insertable = false, updatable = false)
    private LabAddress labAddress;


    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lab_technician_id", insertable = false, updatable = false)
    private LabTechnician labTechnician;

}

