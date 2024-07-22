package com.example.EtapStage.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@Table(name="Commentaire")

public class Commenatire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contenue;

    private String piecejointe;

    public Commenatire() {

    }
}
