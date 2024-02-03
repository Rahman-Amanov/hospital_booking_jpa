package com.hospital.HospitalBooking.model.appointment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "appointments")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "docktor_id")
    private String docktorId;

    @Column(name = "patient_id")
    private String patientId;

    private String createdDate;

    private int createdHour;

    private int  createdMinute;

    @Column(name = "notes")
    private String notes;



//    id (auto increment) (Integer)
//    docktorId (String)
//    patientId (String)
//    date (String)
//    hour (Integer)
//    minute (Integer)
//    notes (String)
}
