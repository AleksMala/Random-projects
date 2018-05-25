package DrinksReceipe;

import java.util.ArrayList;

public class DrinksIngredients {

    private ArrayList<Ingredients> listOfIngredients;

    public DrinksIngredients(ArrayList<Ingredients> listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public ArrayList<Ingredients> getListOfIngredients() {
        return listOfIngredients;
    }

    public void setListOfIngredients(ArrayList<Ingredients> receipe) {
        this.listOfIngredients = listOfIngredients;
    }
}
