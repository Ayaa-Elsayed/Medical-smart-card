package com.ayaagroup.demo.entity.prescription;

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
@Table(name = "Prescription Drugs")
public class RequiredMedication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicine_id")
    private Integer medicineId;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "doses")
    private Integer medicineDoses;

    @Column(name = "Instructions")
    private Integer drugInstruction;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id", insertable = false, updatable = false)
    private PrescriptionEntity prescriptionEntity;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pharmacist_id", insertable = false, updatable = false)
    private Pharmacist pharmacist;
}
