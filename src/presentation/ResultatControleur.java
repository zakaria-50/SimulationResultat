package presentation;
import lombok.* ;
import metier.IMetierResultat;

@Data @AllArgsConstructor @NoArgsConstructor
public class ResultatControleur implements IResultatControleur{

    IMetierResultat resultatMetier ;


    @Override
    public void afficher_Moyenne(Long idResultat)throws Exception{
        var ResultatAvecMoyenne  = resultatMetier.calculer_Moyenne(idResultat) ;
        System.out.println(ResultatAvecMoyenne);
    }
}
