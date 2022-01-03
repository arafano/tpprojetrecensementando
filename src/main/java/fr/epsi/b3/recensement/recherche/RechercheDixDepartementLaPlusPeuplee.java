package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.*;


import java.util.*;
import java.util.stream.Collectors;

public class RechercheDixDepartementLaPlusPeuplee extends MenuService {


    @Override
    public void traiter(Recensement recensement, Scanner scanner) {}

    public void traiter(Recensement recensement) {


        Collections.sort(recensement.getListeDepartements());
        for (int i = 0 ; i<10; i++){
            Departement DepartementPlusPeuplee = recensement.ListeDepartements.get(i);
            System.out.println(DepartementPlusPeuplee.codeDepartement +" avec un total de "+DepartementPlusPeuplee.populationTotale + "habitants");

        }



    }

}
