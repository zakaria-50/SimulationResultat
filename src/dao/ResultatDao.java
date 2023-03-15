package dao;

import modele.Resultat;
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ResultatDao implements IDao<Resultat , Long> {
    public static Set<Resultat> DBResultats() {

        return new HashSet<Resultat>(
                Arrays.asList(
                        new Resultat(1L , 18 , 15 , 2 , 2 , "issam" , 0.0),
                        new Resultat(2L, 20, 9, 2,2, "Tarek", 0.0),
                        new Resultat(3L, 17, 10, 2,1.5 , "sarah", 0.0),
                        new Resultat(4L, 7, 11, 2.0, 3, "Tanae", 0.0)

                ));
    }


    @Override
    public Resultat trouverParId(Long id){
        System.out.println("[DAO = DS volatile ] trouver le Resultat n' :"+ id);
        return      DBResultats()
                .stream()
                .filter(resultat -> resultat.getId() == id)
                .findFirst()
                .orElse(null) ;
    }
}
