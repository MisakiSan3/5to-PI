package com.piback.PIback.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "profile")
public class profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_u", length = 30)
    private String Name_u;

    @Column(name = "lastname_u", length = 30)
    private String Lastname_u;

    @Column(name = "phone", length = 10)
    private String phone;
    
    @Column(name = "photo", length = 100)
    private String Photo;
}
