package com.ayaagroup.demo.entity.user.patient;


import com.ayaagroup.demo.entity.user.User;
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
@Table(name = "patient Diseases")
public class PatientDiseaseEntity {

    // M-M relationship bt atient and disease
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientDisease_id")
    private Integer pdId;


   // @JsonBackReference
  //  @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name = "userId", insertable = false, updatable = false)
  //  private User userEntity;


    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", insertable = false, updatable = false)
    private Patient patients;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "disease_id", insertable = false, updatable = false)
    private DiseaseEntity diseaseEntity;

    @Column(name = "disease_notes")
    private String disease_notes;

}
