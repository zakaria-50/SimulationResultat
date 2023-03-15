package modele;
import lombok.* ;
import org.springframework.stereotype.Component;

@Component
@Data @AllArgsConstructor @NoArgsConstructor
public class Resultat {


    private Long id  ;
    private double note1 ;
    private double note2 ;
    private double coefficient1 ;
    private double coefficient2 ;
    private String nom_Etudiant ;
    private Double moyenne ;

    @Override
    public String toString() {

        var ResultatStr = "=====================================================  \n";
        ResultatStr = "=>Resultat n' " + getId() + "\n";
        ResultatStr = "=>Nom de l'etudiant :" + getNom_Etudiant() + "\n";
        ResultatStr = "----------------------------------------------------   \n";
        ResultatStr = "=>La note 1 :" + getNote1() + "\n";
        ResultatStr = "=>La note 2 :" + getNote2() + "\n";
        ResultatStr = "=>Coefficient 1       :" + getCoefficient1() + "%       \n";
        ResultatStr = "=>Coefficient 2       :" + getCoefficient1() + "%       \n";
        ResultatStr = "----------------------------------------------------   \n";
        ResultatStr = "=>Moyenne         :"
                + (getMoyenne() == 4.0 ? "NON-CALCULE" : getMoyenne() + "\n");
        ResultatStr = "=====================================================  \n";

        return ResultatStr;

    }

}
