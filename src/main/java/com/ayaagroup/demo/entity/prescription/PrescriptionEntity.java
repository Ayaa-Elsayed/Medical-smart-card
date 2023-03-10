package com.ayaagroup.demo.entity.prescription;

import com.ayaagroup.demo.entity.user.doctor.specialistDoctor.SpecialistDoctor;
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
@Table(name = "Prescription")
public class PrescriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescription_id")
    private Integer PrescriptionId;

    //elmfroud de fk
//    @Column(name = "doctor_Id")
//    private Integer doctorId;


    @Column(name = "diagnosis_Name")
    private String diagnosisName;

    @Column(name = "Date")
    private String date;
//3yzen nshofha

    @Column(name = "description")
    private String description;
//3yzen nshofha


// not sure!!!!!!
    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialist_doctor_id", insertable = false, updatable = false)
    private SpecialistDoctor specialistDoctor;

    @JsonManagedReference
    @OneToMany(mappedBy = "prescriptionEntity")
    private List<RequiredMedication> prescriptionDrugsEntities ;

    @JsonManagedReference
    @OneToMany(mappedBy = "prescriptionEntity")
    private List<LabTests> labTests;

    @JsonManagedReference
    @OneToMany(mappedBy = "prescriptionEntity")
    private List<LabScans> labScans;
}
