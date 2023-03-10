package com.ayaagroup.demo.controller;

import com.ayaagroup.demo.dao.PatientDao;

import com.ayaagroup.demo.entity.user.patient.PatientDiseaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PatientController {

    @Autowired
    private PatientDao patientDao;

  /*  @GetMapping(path = "/")
    public String home(){
        return "<h1> hello all </h1>";
    }

    @GetMapping(path = "/user")
    public String user(){
        return "<h1> hello user </h1>";
    }

    @GetMapping(path = "/admin")
    public String admin(){
        return "<h1> hello admin </h1>";
    }
*/

    @GetMapping("/BasicInfo")
    public String getDiseaseNotesByPdId(@RequestParam Integer pdId){
        Optional<PatientDiseaseEntity> diseaseNotes = this.patientDao.getDiseaseNotesByPdId(pdId);
        if(diseaseNotes.isPresent()){
            return diseaseNotes.get().getDisease_notes();
        }
        else{
            return "the diseaseNotes is not exist";
        }
    }

}
