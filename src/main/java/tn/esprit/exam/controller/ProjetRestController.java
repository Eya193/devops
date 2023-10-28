package tn.esprit.exam.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.Chaine;
import tn.esprit.exam.entity.Programme;
import tn.esprit.exam.entity.Projet;
import tn.esprit.exam.entity.Utilisateur;
import tn.esprit.exam.service.IProjetService;

import java.util.List;

@Tag(name = "Web Services pour la gestion de Projets")
@RestController
@RequestMapping("/projet")
public class ProjetRestController {

    @Autowired
    IProjetService projetService;

    // http://localhost:8089/exam/projet/retrieve-all-projets

    //   @Operation(description = "Ceci récupère la liste de tous les Projets")
    //   @GetMapping("/retrieve-all-projets")
    //   public List<Projet> getProjets() {
    //       List<Projet> listProjets = projetService.retrieveAllProjets();
    //       return listProjets;
    //   }


    // http://localhost:8089/exam/projet/retrieve-projet/8
    @GetMapping("/retrieve-projet/{projet-id}")
    public Projet retrieveProjet(@PathVariable("projet-id") Long proejtId) {
        Projet projet = projetService.retrieveProjet(proejtId);
        return projet;
    }

    @PostMapping("add-User")
    public Utilisateur addUser(@RequestBody Utilisateur u) {
        Utilisateur utilisateur = projetService.ajouterUtilisateur(u);
        return utilisateur;
    }

    @PostMapping("add-progC")
    public Programme addProfC(@RequestBody Programme p) {
        Programme programme = projetService.ajouterProgrammeEtChaine(p);
        return programme;
    }

  
    @PostMapping("Affect-Chaine/{chId}")
    public Programme affectChaineProg(@RequestBody Programme p, @PathVariable("chId") long chId) {
        return projetService.ajouterProgrammeEtAffecterChaine(p, chId);
    }

    // http://localhost:8089/exam/projet/add-projet
    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet p) {
        Projet projet = projetService.addProjet(p);
        return projet;
    }

    // http://localhost:8089/exam/projet/remove-projet/{projet-id}
    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") Long proejtId) {
        projetService.removeProjet(proejtId);
    }

    // http://localhost:8089/exam/projet/modify-projet
    @PutMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet p) {
        Projet projet = projetService.modifyProjet(p);
        return projet;
    }


}
