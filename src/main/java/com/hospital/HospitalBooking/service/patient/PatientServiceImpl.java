package com.hospital.HospitalBooking.service.patient;

import com.hospital.HospitalBooking.model.patient.Patient;
import com.hospital.HospitalBooking.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Long id, Patient patient) {
        Optional<Patient> patientById=patientRepository.findById(id);
        if(patientById.isPresent()){
            Patient updatedPatient=patientById.get();
            updatedPatient.setId(patient.getId());
            updatedPatient.setName(patient.getName());
            updatedPatient.setGender(patient.getGender());
            updatedPatient.setDateOfBirth(patient.getDateOfBirth());
            updatedPatient.setCity(patient.getCity());
            updatedPatient.setAddress(patient.getAddress());
            updatedPatient.setHealthInsurance(patient.isHealthInsurance());

            return patientRepository.save(updatedPatient);
        }

        return null;
    }

    @Override
    public Patient getPatientById(Long id) {
        Optional<Patient> patient=patientRepository.findById(id);
        if(patient.isPresent()){
            return patient.get();
        }
        return null;
    }

    @Override
    public String deletePatient(Long id) {
        patientRepository.deleteById(id);
        return "successfully deleted!";
    }

    @Override
    public List<Patient> gelAllPatients() {
        List<Patient> patients=new ArrayList<>();
        patientRepository.findAll().forEach(patient -> patients.add(patient));
        return patients;
    }
}
