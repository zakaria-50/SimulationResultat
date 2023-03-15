package metier;
import dao.IDao;
import lombok.* ;
import modele.Resultat ;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResultatMetier implements IMetierResultat {
    IDao<Resultat, Long> resultatDao ;


    public Resultat calculer_Moyennee(Long idResultat) throws Exception {
        var resultat = resultatDao.trouverParId(idResultat) ;
        if (resultat == null)
            throw new Exception("L' id du resultat est incorrect :: [Resultat non trouvé]") ;
        else {
            double coeff1             = resultat.getCoefficient1() ;
            double coeff2             = resultat.getCoefficient2() ;

            double note1         = resultat.getNote1() ;
            double note2         = resultat.getNote2() ;

            double moyenne      =((note1 * coeff1)+(note2 * coeff2))/coeff1+coeff2 ;
            DecimalFormat df = new DecimalFormat("0.00");
            df.format(moyenne) ;

            resultat.setMoyenne(moyenne);
            return resultat ;

        }
    }

    @Override
    public Resultat calculer_Moyenne(Long idResultat) throws Exception {
        return null  ;
    }


}