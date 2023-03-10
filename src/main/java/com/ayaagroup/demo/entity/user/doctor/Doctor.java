//package com.ayaagroup.demo.entity.user.doctor;
//
//import com.ayaagroup.demo.entity.user.User;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.List;
//
//@Getter
//@Setter
////@AllArgsConstructor
////@NoArgsConstructor
//@Entity
//@Table(name = "doctors")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "job_type")
//public abstract class Doctor extends User {
//
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    @Column(name = "doctor_id")
////    private Integer userId;
//
//    //asdy hna hwa 3la kayd el3mal wla laa
//    @Column(name = "doctor_state")
//    private String doctorState;
//
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "doctorEntity")
//    private List<DoctorWorkAddress> doctorWorkAddresses;
//
////    @JsonManagedReference
////    @OneToMany(mappedBy = "doctor")ion;
////    private List<LabResults> labResults;
////
////    @JsonManagedReference
////    @OneToOne(mappedBy = "doctor")
////    private PrescriptionEntity prescriptionEntity ;
//
//}
