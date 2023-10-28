package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Chaine;
import tn.esprit.exam.entity.Projet;

import java.util.HashSet;
import java.util.Set;

@Repository
public interface ChaineRepository extends CrudRepository<Chaine, Long> {

    Set<Chaine> chaines = new HashSet<>();
}