//package com.ayaagroup.demo.entity.user.doctor;
//
//import com.ayaagroup.demo.entity.user.doctor.Doctor;
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
//@Table(name = "doctor_work_address")
//public class DoctorWorkAddress {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "address_id")
//    private Integer addressId;
//
//    //@Column(name = "user_id")
//    private Integer userId;
//
//    @Column(name = "country")
//    private String country;
//
//    @Column(name = "city")
//    private String city;
//
//    @Column(name = "street")
//    private String street;
//
//    @Column(name = "apartment")
//    private String apartment;
//
//
//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "userId", insertable = false, updatable = false)
//    private Doctor doctorEntity;
//}
