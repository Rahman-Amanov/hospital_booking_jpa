package com.hospital.HospitalBooking.controller;

import com.hospital.HospitalBooking.model.appointment.Appointment;
import com.hospital.HospitalBooking.service.appointment.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @PostMapping ("/addAppointment")
    public Appointment addAppointment(@RequestBody Appointment appointment){
        return appointmentService.addAppointment(appointment);
    }

    @GetMapping("/getAppointmentById/{id}")
    public Appointment getAppointmentById(@PathVariable("id") Long id, @RequestBody Appointment appointment){
        return appointmentService.getAppointmentById(id);
    }

    @GetMapping("/getAllAppointments")
    public List<Appointment> getAllAppointments(@RequestBody Appointment appointment){
         return appointmentService.getAllAppointments();
    }

    @DeleteMapping("/deleteAppointmentById/{id}")
    public String deleteAppointmentById(@PathVariable Long id){
        appointmentService.deleteAppointmentById(id);
        return "successfully deleted!";
    }

    @PostMapping("/updateAppointmentById/{id}")
    public Appointment updateAppointmentById(@PathVariable Long id, @RequestBody Appointment appointment){
        return appointmentService.updateAppointmentById(id,appointment);
    }

}
