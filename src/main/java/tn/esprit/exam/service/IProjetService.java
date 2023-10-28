package tn.esprit.exam.service;

import tn.esprit.exam.entity.Chaine;
import tn.esprit.exam.entity.Programme;
import tn.esprit.exam.entity.Projet;
import tn.esprit.exam.entity.Utilisateur;

import java.util.List;

public interface IProjetService {
    public Utilisateur ajouterUtilisateur(Utilisateur u);

    public Programme ajouterProgrammeEtChaine(Programme p);

    public Chaine ajouterChaine(Chaine c);

    public Programme ajouterProgrammeEtAffecterChaine(Programme p, Long chId);

    // public List<Projet> retrieveAllProjets();

    public Projet retrieveProjet(Long projetId);

    public Projet addProjet(Projet p);

    public void removeProjet(Long projetId);

    public Projet modifyProjet(Projet projet);

}
