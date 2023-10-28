package tn.esprit.exam.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Projet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; // Identifiant projet (Clé primaire)
    String sujet;
    @Temporal(TemporalType.DATE)
    Date dateDebut;
    @Enumerated(EnumType.STRING)
    Domaine domaine;

}
