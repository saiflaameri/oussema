package com.example.EtapStage.Service;

import java.util.List;

public interface interfaceGroupeProjet <T>{

    public List<T>afficher();

    public List<T>Ajouter(T t);

    public void modifier(T t);

    public void supprimer(Long id);

    public void rechercher(String nom);
}
