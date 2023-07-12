package com.example.bigprojecttinqin.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@Entity
@Table(name = "Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;


    @ManyToOne
    private Vendor vendor;


    @OneToMany
    private Set<Multimedia> multimedia;


    @ManyToMany
    private Set<Tag> tags;

    @Column
    private boolean archived;
}







