package com.hospital.HospitalBooking.repository;

import com.hospital.HospitalBooking.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository <Doctor,Long> {
}
