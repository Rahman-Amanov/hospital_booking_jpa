package com.hospital.HospitalBooking.controller;

import com.hospital.HospitalBooking.model.doctor.Doctor;
import com.hospital.HospitalBooking.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/getAllDoctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/getDoctorById/{id}")
    public Doctor getDoctorById(@PathVariable("id") Long id) {
       return doctorService.getDoctorById(id);
    }

    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }

    @PostMapping("/updateDoctorById/{id}")
    public Doctor updateDoctorById(@PathVariable("id") Long id, @RequestBody Doctor doctor) {
        return doctorService.updateDoctor(id,doctor);
    }

    @DeleteMapping("/deleteDoctorById/{id}")
    public String deleteDoctorById(@PathVariable("id") Long id) {
        return doctorService.deleteDoctor(id);
    }

}
