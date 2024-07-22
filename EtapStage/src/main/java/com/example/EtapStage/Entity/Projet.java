package com.example.EtapStage.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString(exclude = "groupeProjet")
@Table(name = "Projet")
public class Projet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String Description;
    @ManyToOne(fetch =FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "groupe_projet_id")
    private GroupeProjet groupeProjet;





    public Projet(){}
}
