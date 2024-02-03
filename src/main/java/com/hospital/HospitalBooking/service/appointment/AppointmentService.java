package com.hospital.HospitalBooking.service.appointment;

import com.hospital.HospitalBooking.model.appointment.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment addAppointment(Appointment appointment);
    Appointment getAppointmentById(Long id);
    String deleteAppointmentById(Long id);
    Appointment updateAppointmentById(Long id, Appointment appointment);
    List<Appointment> getAllAppointments();
}
