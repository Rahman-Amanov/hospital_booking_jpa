package com.hospital.HospitalBooking.model.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patients")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private PatientGender gender;

    @Column
    private int dateOfBirth;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private PatientCity city;

    @Column
    private String address;

    @Column(name = "health_insurance")
    private boolean healthInsurance;



    /*
       id (tckn) (String)
        name (String)
        gender (Enum type)
        dateOfBirth (yıl) (Integer)
        city (Enum type)
        address (String)
        healthInsurance (boolean)
     */

}
