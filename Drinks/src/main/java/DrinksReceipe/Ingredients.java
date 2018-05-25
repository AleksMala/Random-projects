package DrinksReceipe;

public class Ingredients {

    private String nameOfIngredient;

    public Ingredients(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }

    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    public void setNameOfIngredient(String ... nameOfIngredient) {
        this.nameOfIngredient = String.valueOf(nameOfIngredient);
    }
}
