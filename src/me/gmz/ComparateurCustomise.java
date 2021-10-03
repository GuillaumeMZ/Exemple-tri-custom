package me.gmz;

import java.util.Comparator;

public class ComparateurCustomise implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        float difference = item.valeur / item.poids - t1.valeur / t1.poids;
        if(difference > 0)
            return -1; //On doit renvoyer -1 si le premier item est plus petit que le second
        if(difference < 0)
            return 1; //On doit renvoyer 1 si le premier item est plus grand que le second
        return 0; //On doit renvoyer 0 si les deux items sont égaux

        //En l'occurence, on renvoie l'inverse (-1 si le premier item est le plus grand et 1 si le premier item est le plus petit) pour trier par ordre décroissant
    }
}
