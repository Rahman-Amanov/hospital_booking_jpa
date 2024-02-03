package com.hospital.HospitalBooking.model.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doctors")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="name" )
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @Column(name ="name_prefix" )
    private DoctorNamePrefix namePrefix ; // enum

    @Enumerated(EnumType.ORDINAL)
    @Column(name ="department" )
    private DoctorDepartment department ; // enum

    @Column(name ="date_of_graduate" )
    private int dateOfGraduate ;

    @Column(name ="date_of_start" )
    private int dateOfStart ;


    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
