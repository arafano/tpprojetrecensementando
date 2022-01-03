package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.MenuService;
import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.infos.Region;
import fr.epsi.b3.recensement.infos.Ville;


import java.util.*;
import java.util.stream.Collectors;

public class DixVillePlusPeupleeFr extends MenuService {


    @Override
    public void traiter(Recensement recensement, Scanner scanner) {}

    public void traiter(Recensement recensement) {

        /***
         ///char[] newarray = new char[10];
         Region DixRegionPlusPeuplee = new Region();
         for(int i=1;i<recensement.ListeRegions.size();i++){
         if(DixRegionPlusPeuplee.populationTotale < recensement.ListeRegions.get(i).populationTotale){
         DixRegionPlusPeuplee = recensement.ListeRegions.get(i);
         //newarray[i]=DixRegionPlusPeuplee;
         }
         }
         System.out.println("Les dix régions les plus peuplées sont :  " +DixRegionPlusPeuplee.nomRegion +"avec un total de "+DixRegionPlusPeuplee.populationTotale);
         }
         ***/

        /***
         Region RegionPlusPeuplee = new Region();
         HashMap<String, Integer> compteurs = new HashMap<>();
         for(int i=0;i<recensement.ListeRegions.size();i++){
         //List<String> ListeRegionTrier = recensement.ListeRegions.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
         RegionPlusPeuplee = recensement.ListeRegions.get(i);
         System.out.println("Les Regions sont : " +RegionPlusPeuplee.nomRegion +"avec un total de "+RegionPlusPeuplee.populationTotale);
         }
         ***/


        Collections.sort(recensement.getListeVilles());
        for (int i = 0 ; i<10; i++){
            Ville VillePlusPeuplee = recensement.ListeVilles.get(i);
            System.out.println(VillePlusPeuplee.nomCommune +" avec un total de "+VillePlusPeuplee.populationTotale +" habitants ");

        }



    }

}
