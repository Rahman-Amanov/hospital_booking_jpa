package com.hospital.HospitalBooking.service.doctor;

import com.hospital.HospitalBooking.model.doctor.Doctor;
import com.hospital.HospitalBooking.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors=new ArrayList<>();
        doctorRepository.findAll().forEach(doctor -> doctors.add(doctor));
        return doctors;
    }

    @Override
    public Doctor getDoctorById(Long id) {
        Optional<Doctor> doctor=doctorRepository.findById(id);
        if(doctor.isPresent()){
            return doctor.get();
        }
        return null;
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public String deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
        return "successfully deleted!";
    }

    @Override
    public Doctor updateDoctor(Long id, Doctor doctor) {

        Optional<Doctor> doctorById=doctorRepository.findById(id);

        if(doctorById.isPresent()){

            Doctor updatedDoctor=doctorById.get();
            updatedDoctor.setId(doctor.getId());
            updatedDoctor.setName(doctor.getName());
            updatedDoctor.setNamePrefix(doctor.getNamePrefix());
            updatedDoctor.setDepartment(doctor.getDepartment());
            updatedDoctor.setDateOfGraduate(doctor.getDateOfGraduate());
            updatedDoctor.setDateOfStart(doctor.getDateOfStart());

            return doctorRepository.save(updatedDoctor);
        }
        return null;
    }
}
