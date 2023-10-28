package tn.esprit.exam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
public class Chaine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long chId; // Identifiant projet (Clé primaire)
    String chNom;
    @Enumerated(EnumType.STRING)
    Thematique chTheme;
    
}
