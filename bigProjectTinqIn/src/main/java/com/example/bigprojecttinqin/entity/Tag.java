package com.example.bigprojecttinqin.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@Entity
@Table(name = "Tag")
public class Tag {
    @Id
    private UUID uuid;

    @Column(name = "title")
    private String title;
    @ManyToMany
    private Set<Item> items;
}