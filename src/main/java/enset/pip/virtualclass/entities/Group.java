package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    Long id;
    String nom;
    String DateCreation;

    @OneToMany(mappedBy = "group")
    private Set<Message> messageSet;

    @ManyToMany
    List<Compte> compteList;

}
