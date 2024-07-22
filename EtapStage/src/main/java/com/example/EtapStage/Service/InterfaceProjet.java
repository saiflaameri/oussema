package com.example.EtapStage.Service;

import java.util.List;

public interface InterfaceProjet<T> {

    public List<T> afficher();
    public void add(T t);
    public void delete(Long id);
    public void update(T t);
}
