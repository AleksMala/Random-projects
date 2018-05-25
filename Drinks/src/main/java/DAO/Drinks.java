package DAO;

import DrinksReceipe.DrinksIngredients;
import DrinksReceipe.Receipe;

public class Drinks {

    private String name;
    private DrinksIngredients listOfIngredients;
    private Receipe receipe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DrinksIngredients getListOfIngredients() {
        return listOfIngredients;
    }

    public void setReceipe(DrinksIngredients listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public Receipe getReceipe() {
        return receipe;
    }

    public void setReceipe(Receipe receipe) {
        this.receipe = receipe;
    }
}
