package com.hospital.HospitalBooking.controller;

import com.hospital.HospitalBooking.model.patient.Patient;
import com.hospital.HospitalBooking.service.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/getAllPatients")
    public List<Patient> getAllPtaients(){
        return patientService.gelAllPatients();
    }

    @GetMapping("/getPatientById/{id}")
    public Patient getPatientById(@PathVariable("id") Long id, @RequestBody Patient patient){
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/deletePatientById/{id}")
    public String getPatientById(@PathVariable("id") Long id){
        return patientService.deletePatient(id);
    }

    @PostMapping("/updatePatientById/{id}")
    public Patient updatePatientById(@PathVariable("id") Long id, @RequestBody Patient patient){
        return patientService.updatePatient(id,patient);
    }

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

}
