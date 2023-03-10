//package com.ayaagroup.demo.entity.prescription;
//
//import com.ayaagroup.demo.entity.user.doctor.Doctor;
//import com.ayaagroup.demo.entity.user.patient.Patient;
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "lab")
//public class LabResults {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "lab_id")
//    private Integer labId;
//
//////  nshof eh hwa doctor_id!!!!!!!!!!!!!!!
////    @Column(name = "doctor_id")
////    private Integer labId;
//
//
//    @Column(name = "lab Name")
//    private String labName;
//
//    @Column(name = "branch name")
//    private String branchName;
//
//    //pdf!!!!!!!!!!!!!!
//    @Column(name = "lab result")
//    private String labResult;
//
//
//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "patient_id", insertable = false, updatable = false)
//    private Patient patients;
//
//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "doctorId", insertable = false, updatable = false)
//    private Doctor doctor;
//}
