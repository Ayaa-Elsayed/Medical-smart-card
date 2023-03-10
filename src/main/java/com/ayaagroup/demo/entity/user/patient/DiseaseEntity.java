package com.ayaagroup.demo.entity.user.patient;

import com.ayaagroup.demo.entity.user.User;
import com.ayaagroup.demo.entity.user.patient.PatientDiseaseEntity;
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
@Table(name = "Diseases")
public class DiseaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disease_id")
    private Integer diseaseId;

    @Column(name = "disease_name")
    private String diseaseName;



  //  @JsonBackReference
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "userId", insertable = false, updatable = false)
    //private User userEntity;

    @JsonManagedReference
    @OneToMany(mappedBy = "diseaseEntity")
    private List<PatientDiseaseEntity> patientDiseaseEntities;


//    //elmfroud lists w prev sergories kman wkol 7aga mn dol ykon leha lab scans wkda + mmkn kman taken vaccines
//    @Column(name = "current disease")
//    private String currentDisease;
//
//    @Column(name = "chronic disease")
//    private String chronicDisease;


}
