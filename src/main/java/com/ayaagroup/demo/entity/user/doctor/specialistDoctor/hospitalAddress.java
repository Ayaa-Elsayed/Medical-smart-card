package com.ayaagroup.demo.entity.user.doctor.specialistDoctor;

import com.ayaagroup.demo.entity.user.doctor.pharmacy.Pharmacist;
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
@Table(name = "hospital_address")
public class hospitalAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;

    private Integer pharmacistId;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "apartment")
    private String apartment;


    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialistDoctorId", insertable = false, updatable = false)
    private SpecialistDoctor specialistDoctor;
}
