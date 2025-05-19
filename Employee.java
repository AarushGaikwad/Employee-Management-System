package com.example.EmployeeManagemantSystem.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    private String email;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", nullable = false) //an employee deatils can only be add after getting the department id for that we have used this
    private Department department;

}
