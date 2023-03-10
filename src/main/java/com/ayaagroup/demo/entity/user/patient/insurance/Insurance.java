package com.ayaagroup.demo.entity.user.patient.insurance;

import com.ayaagroup.demo.entity.user.patient.Patient;
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
@Table(name = "Insurance")
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurance_id")
    private Integer insuranceId;

    //@Column(name = "patient_id")
    private Integer patientId;

    @Column(name = "organization_name")
    private String organizationName;

    @JsonBackReference
    @JoinColumn(name = "patientId", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patientEntity;
}
