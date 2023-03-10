package com.ayaagroup.demo.dao;

import com.ayaagroup.demo.entity.user.patient.PatientDiseaseEntity;
import com.ayaagroup.demo.repository.PatientDiseaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientDao {
    @Autowired
    private PatientDiseaseRepo repo;

    public Optional<PatientDiseaseEntity> getDiseaseNotesByPdId(Integer pdId){
        return this.repo.findDiseaseNotesByPdId(pdId);
    }
}
