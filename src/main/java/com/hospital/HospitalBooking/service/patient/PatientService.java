package com.hospital.HospitalBooking.service.patient;

import com.hospital.HospitalBooking.model.patient.Patient;

import java.util.List;

public interface PatientService {
    Patient addPatient(Patient patient);
    Patient updatePatient(Long id,Patient patient);
    Patient getPatientById(Long id);
    String deletePatient(Long id);
    List<Patient> gelAllPatients();
}
