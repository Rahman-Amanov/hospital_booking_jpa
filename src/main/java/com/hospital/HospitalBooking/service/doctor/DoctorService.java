package com.hospital.HospitalBooking.service.doctor;

import com.hospital.HospitalBooking.model.doctor.Doctor;

import java.util.List;

public interface DoctorService {

    List<Doctor> getAllDoctors();
    Doctor getDoctorById(Long id);
    Doctor addDoctor(Doctor doctor);
    String deleteDoctor(Long id);
    Doctor updateDoctor(Long id, Doctor doctor);

}
