package fr.epsi.b3.recensement.infos;

import java.util.List;
import java.util.Objects;

public class Departement implements Comparable<Departement> {
    public String codeDepartement;
    public int populationMunicipale;
    public int populationTotale;

    public Departement(){}

    public Departement(String codeDepartement){
        this.codeDepartement = codeDepartement;


    }

    public void calculpopulationtotale(List<Ville> ListeVilles ){
        if(populationTotale == 0)
            for (Ville v : ListeVilles){
                if(Objects.equals(v.codeDepartement, this.codeDepartement)){
                    this.populationTotale += v.populationTotale;
                }

            }

    }

    public String getCodeDepartement(){return this.codeDepartement;}
    public void setCodeDepartement(String codeDepartement) {this.codeDepartement = codeDepartement;}

    public int getPopulationMunicipale(){return this.populationMunicipale;}
    public void setPopulationMunicipale(int populationMunicipale){this.populationMunicipale = populationMunicipale;}

    public int getPopulationTotale() {return this.populationTotale;}
    public void setPopulationTotale(int populationTotale){this.populationTotale = populationTotale;}


    @Override
    public int compareTo(Departement o) {
        return o.populationTotale - this.populationTotale;
    }
}