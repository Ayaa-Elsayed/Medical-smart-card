package com.ayaagroup.demo.entity.user.doctor.lab;

import com.ayaagroup.demo.entity.prescription.LabScans;
import com.ayaagroup.demo.entity.prescription.LabTests;
import com.ayaagroup.demo.entity.user.User;
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
@Table(name = "laboratory_doctor",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "lab_technician_id")})
//@DiscriminatorValue("laboratory_doctor")
public class LabTechnician extends User {

    //don't forget to make it unique in the db
    @Column(name = "lab_technician_id")
    private Integer labTechnicianId;

    @Column(name = "lab_name")
    private Integer labName;

    @JsonManagedReference
    @OneToMany(mappedBy = "labTechnicianEntity")
    private List<LabAddress> labAddresses;

    @JsonManagedReference
    @OneToMany(mappedBy = "labTechnician")
    private List<LabTests> labTests;

    @JsonManagedReference
    @OneToMany(mappedBy = "labTechnician")
    private List<LabScans> labScans;
}
