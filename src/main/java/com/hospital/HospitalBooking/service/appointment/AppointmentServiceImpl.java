package com.hospital.HospitalBooking.service.appointment;

import com.hospital.HospitalBooking.model.appointment.Appointment;
import com.hospital.HospitalBooking.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        Optional<Appointment> appointment=appointmentRepository.findById(id);
        if(appointment.isPresent()){
            return appointment.get();
        }
        return null;
    }

    @Override
    public String deleteAppointmentById(Long id) {
        appointmentRepository.deleteById(id);
        return "successfully deleted!";
    }

    @Override
    public Appointment updateAppointmentById(Long id, Appointment appointment) {
        Optional<Appointment> appointmentById=appointmentRepository.findById(id);
        if(appointmentById.isPresent()){
            Appointment updatedAppointment=appointmentById.get();
            updatedAppointment.setId(appointment.getId());
            updatedAppointment.setDocktorId(appointment.getDocktorId());
            updatedAppointment.setPatientId(appointment.getPatientId());
            updatedAppointment.setCreatedDate(appointment.getCreatedDate());
            updatedAppointment.setCreatedHour(appointment.getCreatedHour());
            updatedAppointment.setCreatedMinute(appointment.getCreatedMinute());
            updatedAppointment.setNotes(appointment.getNotes());

            return appointmentRepository.save(updatedAppointment);
        }
        return null;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        List<Appointment> appointments=new ArrayList<>();
        appointmentRepository.findAll().forEach(appointment -> appointments.add(appointment));
        return appointments;
    }
}
