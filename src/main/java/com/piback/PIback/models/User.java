package com.piback.PIback.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nickname", length = 30)
    private String nickname;

    @Column(name = "email", length = 30)
    private String email;

    @Column(name = "password", length = 30)
    private String password;


   /*@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
   private Profile profile;


   //relacion one to many con la tabla bloc//S
   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
   private List<Bloc> bloc;

   //relacion one to many con la tabla subject//
   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
   private List<Subject> subject;/* */
    
}
