package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.*;

import java.util.*;



public class DixVillePlusPeupleeDep extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {


        String departement = scanner.nextLine();
        List<Ville> ListeVille = recensement.getListeVilles();
        List<String> listVille = new ArrayList<>();
        List<String> listHabitant = new ArrayList<>();
        Collections.sort((recensement.getListeVilles()));
        for (int i = 0; i < ListeVille.size(); i++) {
            if ((ListeVille.get(i).codeDepartement).equals(departement)) {
                listVille.add(recensement.getListeVilles().get(i).getNomCommune());
                listHabitant.add(String.valueOf(recensement.getListeVilles().get(i).getPopulationTotale()));
            }

        }
        String[][] tab2D = new String[listVille.size()][2];
        for (int x = 0; x < listVille.size(); x++)
        {
            tab2D[x][0] = listVille.get(x);
            tab2D[x][1] = listHabitant.get(x);
        }
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < tab2D[i].length; j++)
                System.out.print(tab2D[i][j] + " ");
            System.out.print("habitants");
            System.out.println();
        }
    }



    @Override
    public void traiter(Recensement recensement) {

    }
}
