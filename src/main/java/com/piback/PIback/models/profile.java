package com.piback.PIback.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "profile_id")
    private long id;

    @Column(name = "name_u", length = 30)
    private String Name_u;

    @Column(name = "lastname_u", length = 30)
    private String Lastname_u;

    @Column(name = "phone", length = 10)
    private String phone;
    
    @Column(name = "photo", length = 100)
    private String Photo;


    @OneToOne(mappedBy = "profile")
    private User user;
}
