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
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_at", length = 50)
    private String name_at;

    @Column(name = "worth")
    private long worth;

    @Column(name = "type", length = 30)
    private String type;

    @Column(name = "description", length = 255)
    private String description;

    

}
