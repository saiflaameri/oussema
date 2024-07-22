package com.example.EtapStage.Service;
import com.example.EtapStage.Entity.Projet;
import com.example.EtapStage.Repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjetService implements InterfaceProjet<Projet>{
    @Autowired
    ProjetRepository pr;
    @Override
    public List<Projet> afficher() {
        List<Projet> lp=pr.findAll();
        return lp;
    }

    @Override
    public void add(Projet projet) {
        pr.save(projet);

    }

    @Override
    public void delete(Long id) {
    pr.deleteById(id);
    }

    @Override
    public void update(Projet projet) {
        pr.save(projet);
    }
}
