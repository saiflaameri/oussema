package com.example.EtapStage.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@Table(name = "Ticket")

public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sujet;
    private String Description;
    @Enumerated(EnumType.STRING)
    private TypeIntervention typeIntervention;

    @Enumerated(EnumType.STRING)
    private DegreUrgence degreUrgence;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    private Date datecreation;
    private Date datecloture;

    public Ticket() {

    }
}
