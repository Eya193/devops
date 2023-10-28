package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Projet;

@Repository
public interface ProjetRepository extends CrudRepository<Projet, Long> {


}