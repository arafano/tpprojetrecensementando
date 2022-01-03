package fr.epsi.b3.recensement.compilation;

import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.recherche.*;
import fr.epsi.b3.recensement.service.Tools;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main{
    public Main(){
        }

        public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Ordi\\Desktop\\recensement_2016.csv");
        Recensement MonRecensement = Tools.ListeVille(path);
            int Choix = Tools.Menu();
        switch(Choix){
            case 1:
                Scanner sc = Tools.Ville();
                RecherchePopulationVille recherchePopulationVille = new RecherchePopulationVille();
                recherchePopulationVille.traiter(MonRecensement, sc);
                break;

            case 2:
                RechercheVilleLaPlusPeuplee rechercheVilleLaPlusPeuplee = new RechercheVilleLaPlusPeuplee();
                rechercheVilleLaPlusPeuplee.traiter(MonRecensement);
                break;


            case 3:
                Scanner sc1 = Tools.Departement();
                RecherchePopulationDepartement recherchePopulationDepartement = new RecherchePopulationDepartement();
                recherchePopulationDepartement.traiter(MonRecensement, sc1);
                break;

            case 4:
                Scanner sc2 = Tools.Region();
                RecherchePopulationRegion recherchePopulationRegion = new RecherchePopulationRegion();
                recherchePopulationRegion.traiter(MonRecensement, sc2);
                break;


            case 5:
                RechercheDixRegionLaPlusPeuplee rechercheDixRegionLaPlusPeuplee = new RechercheDixRegionLaPlusPeuplee();
                rechercheDixRegionLaPlusPeuplee.traiter(MonRecensement);
                break;

            case 6:
                RechercheDixDepartementLaPlusPeuplee rechercheDixDepartementLaPlusPeuplee = new RechercheDixDepartementLaPlusPeuplee();
                rechercheDixDepartementLaPlusPeuplee.traiter(MonRecensement);
                break;

            case 7:
                Scanner sc3 = Tools.region();
                DixVillePlusPeupleeReg dixVillePlusPeupleeReg = new DixVillePlusPeupleeReg();
                dixVillePlusPeupleeReg.traiter(MonRecensement, sc3);
                break;

            case 8:
                Scanner sc4 = Tools.departement();
                DixVillePlusPeupleeDep dixVillePlusPeupleeDep = new DixVillePlusPeupleeDep();
                dixVillePlusPeupleeDep.traiter(MonRecensement, sc4);
                break;
            case 9:
                DixVillePlusPeupleeFr dixVillePlusPeupleeFr = new DixVillePlusPeupleeFr();
                dixVillePlusPeupleeFr.traiter(MonRecensement);
                break;



        }

        }

}