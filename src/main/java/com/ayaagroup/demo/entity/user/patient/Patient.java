package com.ayaagroup.demo.entity.user.patient;

import com.ayaagroup.demo.entity.user.User;
import com.ayaagroup.demo.entity.user.patient.insurance.Insurance;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "patients")
      //  uniqueConstraints = {
     //   @UniqueConstraint(columnNames = "patient_id")})
public class Patient {
 //extends User
    //Unique id Not primary Don't forget to make it unique in the DB
//    @Column(name = "patient_id")
 //   private Integer patientId;
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "patient_id")
 private Integer patientId;

    @Column(name = "overview_state")
    private String overviewState;

    @JsonManagedReference
    @OneToMany(mappedBy = "patientEntity")
    private List<Insurance> insurances;

    @JsonManagedReference
    @OneToMany(mappedBy = "patients")
    private List<PatientDiseaseEntity> patientDiseaseEntities;


@JsonBackReference
@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "user_id", insertable = false, updatable = false)
private User user;

//    @JsonManagedReference
//    @OneToMany(mappedBy = "patients")
//    private List<LabResults> labResults;
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "patients")
//    private List<PatientDiseaseEntity> patientDiseaseEntities;
}
