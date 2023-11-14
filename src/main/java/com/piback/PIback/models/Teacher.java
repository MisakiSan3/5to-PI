package com.piback.PIback.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_p", length = 50)
    private String name_p;
    
     @Column(name = "lastname_p",length = 50)
    private String lastname_p;
    
     @Column(name = "telf",length = 10)
    private String telf;

     @Column(name = "email",length = 30)
    private String email;

    //relaciòn con Subject
    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;

    //Relaciòn con Event
    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Events> events;
}
