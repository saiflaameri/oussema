package com.example.EtapStage.Controller;

import com.example.EtapStage.Entity.Projet;
import com.example.EtapStage.Service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/Projet")
public class ProjetController {

    @Autowired
    ProjetService ps;

    @GetMapping("/getall")
    public List<Projet> getall(){
        return ps.afficher();
    }

    @PostMapping("/add")
    public void add(@RequestBody Projet projet){

        ps.add(projet);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        ps.delete(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id,@RequestBody Projet projet){
        projet.setId(id);
        ps.update(projet);
    }
}
