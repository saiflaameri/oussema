package com.example.EtapStage.Service;

import com.example.EtapStage.Entity.GroupeProjet;
import com.example.EtapStage.Repository.GroupeProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class GroupeProjetService implements interfaceGroupeProjet<GroupeProjet> {
    @Autowired
    GroupeProjetRepository grr;
    @Override
    public List<GroupeProjet> afficher() {
        List<GroupeProjet> grp=grr.findAll();
        return grp;
    }

    @Override
    public List<GroupeProjet> Ajouter(GroupeProjet egrp) {
       grr.save(egrp);

        return afficher();
    }

    @Override
    public void modifier(GroupeProjet groupeProjet) {
        grr.save(groupeProjet);

    }

    @Override
    public void supprimer(Long id) {
        grr.deleteById(id);
    }

    @Override
    public void rechercher(String nom) {
        
    }
}
