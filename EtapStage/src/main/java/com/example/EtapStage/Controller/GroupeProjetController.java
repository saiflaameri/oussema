package com.example.EtapStage.Controller;

import com.example.EtapStage.Entity.GroupeProjet;
import com.example.EtapStage.Service.GroupeProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api/auth/GroupeProjet")

public class GroupeProjetController {
    @Autowired
    GroupeProjetService gps;

    @GetMapping("/getall")
    public List<GroupeProjet> getall(){
        return gps.afficher();
    }
    @PostMapping("/add")
    public List<GroupeProjet>add(@RequestBody GroupeProjet gp){
        gps.Ajouter(gp);
        return getall();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        gps.supprimer(id);
    }
    @PutMapping("update/{id}")
    public void update(@PathVariable  Long id,@RequestBody GroupeProjet gp){
        gp.setId(id);
        gps.modifier(gp);
    }

}
