package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "Employee")

public class Employee {

    @Id
    private long id;

    @Column(name = "Email",length = 30, unique = true)
    private String email;

    //@Column(name = "Profile")
    //@OneToMany
    //private List<Profile> profile;

    //@Column(name = "Enterprise")
    //@ManyToOne
    //private Enterprise enterprise;

    //@OneToMany(mappedBy = "Employee", cascade = CascadeType.ALL)
    //private List<Transaction>transactions;

    @Column(name = "UpdateAt")
    private Date UpdateAt;

    @Column(name = "CreatedAt")
    private Date createdAt;




}
