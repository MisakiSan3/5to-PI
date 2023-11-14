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
@Table(name = "section")
public class Events {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_p", length = 50)
    private String name_p;

    @Column(name = "start", length = 50)
    private long start;

     @Column(name = "end", length = 50)
    private long end;

     @Column(name = "description", length = 250)
    private long description;
}
