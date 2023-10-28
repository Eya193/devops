package tn.esprit.exam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.Chaine;
import tn.esprit.exam.entity.Programme;
import tn.esprit.exam.entity.Projet;
import tn.esprit.exam.entity.Utilisateur;
import tn.esprit.exam.repository.ChaineRepository;
import tn.esprit.exam.repository.ProgrammeRepository;
import tn.esprit.exam.repository.ProjetRepository;
import tn.esprit.exam.repository.UtilisateurRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class ProjetServiceImpl implements IProjetService {
    @Autowired
    ProjetRepository projetRepository;
    @Autowired
    ChaineRepository chaineRepository;
    @Autowired
    ProgrammeRepository programmeRepository;
    @Autowired
    UtilisateurRepository utilisateurRepository;

    public Utilisateur ajouterUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);

    }

    @Override

    public Programme ajouterProgrammeEtChaine(Programme p) {
        programmeRepository.save(p);
        return p;
    }

    @Override
    public Programme ajouterProgrammeEtAffecterChaine(Programme p, Long chId) {
        Chaine chaine = chaineRepository.findById(chId).get();
        p.setChaine(chaine);
        programmeRepository.save(p);
        return p;

    }

    @Override
    public Chaine ajouterChaine(Chaine c) {
        return chaineRepository.save(c);
    }
//    @Scheduled(fixedDelay = 10000)
    //   public List<Projet> retrieveAllProjets() {

    //log.info("In Method : retrieveAllProjets ");

    //      List<Projet> listProjets = projetRepository.findAll();
    //      for (Projet projet : listProjets) {
    //          log.info("j'affiche un prjet : " + projet);
    //       }

    //log.info("Out of Method : retrieveAllProjets ");

    //       return listProjets;

    //   }

    public Projet retrieveProjet(Long projetId) {
        return projetRepository.findById(projetId).get();
    }

    public Projet addProjet(Projet p) {
        return projetRepository.save(p);
    }

    public void removeProjet(Long projetId) {
        projetRepository.deleteById(projetId);
    }

    public Projet modifyProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    // Projet et ProjetDeail ne sont pas encore créés (cascade) :
    // Dans le JSON on met le Projet et le Projet Detail
    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {
        return projetRepository.save(projet);
    }


}
