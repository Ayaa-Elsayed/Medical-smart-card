package com.ayaagroup.demo.repository;

import com.ayaagroup.demo.entity.user.patient.PatientDiseaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientDiseaseRepo extends JpaRepository<PatientDiseaseEntity,Integer> {
   Optional<PatientDiseaseEntity> findDiseaseNotesByPdId(Integer pdId);

   //List<PatientDiseaseEntity> findDiseaseNotesByPdId(Integer pdId);

}
