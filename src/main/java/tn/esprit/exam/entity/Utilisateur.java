package tn.esprit.exam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.builder.ToStringExclude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long usrId; // Identifiant projet (Clé primaire)
    String usrNom;
    @Temporal(TemporalType.DATE)
    Date usrDateInscription;
    @Enumerated(EnumType.STRING)
    Profession profession;
    @JsonIgnore
    @ToStringExclude
    @ManyToMany
    Set<Programme> programmes = new HashSet<>();
    @JsonIgnore
    @ManyToOne
    Chaine chaine;

}
