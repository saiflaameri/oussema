package com.example.EtapStage.Service;

import java.util.List;

public interface InterfaceUtilisateur <T>{

    public List<T> getall();
    public void add(T t);
    public void delete(Long id);
    public void update(T t);
}
