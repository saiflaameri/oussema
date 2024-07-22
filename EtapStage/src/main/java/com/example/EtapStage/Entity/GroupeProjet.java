package com.example.EtapStage.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@ToString(exclude = "projet")
@Entity
@Table(name = "GroupeProjet")

public class GroupeProjet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom ;

    @OneToMany(mappedBy = "groupeProjet", cascade = CascadeType.ALL, orphanRemoval = true) // Added cascade and orphanRemoval options
    private List<Projet> projets = new ArrayList<>();




    public GroupeProjet() {

    }
}
