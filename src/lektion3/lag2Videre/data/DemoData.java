package lektion3.lag2Videre.data;

import lektion3.lag2Videre.exceptions.IngredientNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DemoData implements IData {
    @Override
    public String[] getAllIngredients() {
        String[] ingredientsArr = new String[ingredients.size()];
        for (int i = 0; i < ingredientsArr.length; i++) {
            ingredientsArr[i] = ingredients.get(i).name;
        }
        return ingredientsArr;
    }

    @Override
    public String getIngredientName(int id) throws IngredientNotFoundException {
        String name = null;
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).id == id)
                name = ingredients.get(i).name;
        }
        if (name == null) {
            throw new IngredientNotFoundException();
        }
        return name;
    }

    @Override
    public int getIngredientAmount(int id) throws IngredientNotFoundException {
        int  amount = -1;
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).id == id)
                amount = ingredients.get(i).amount;

        }
        if (amount == -1) {
            throw new IngredientNotFoundException();
        }
        return amount;
    }

    @Override
    public void setIngredientName(int id, String name) throws IngredientNotFoundException {
        boolean change = false;
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).id == id) {
                ingredients.get(i).name = name;
                change = true;
            }
        }
        if (change) {
            throw new IngredientNotFoundException();
        }
    }

    @Override
    public void setIngredientAmount(int id, int amount) throws IngredientNotFoundException {
        boolean change = false;
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).id == id)
                ingredients.get(i).amount = amount;
            else
                throw new IngredientNotFoundException();
        }
        if (change) {
            throw new IngredientNotFoundException();
        }
    }

    @Override
    public void createIngredient(int id, String name, int amount) {
        ingredients.add(new Ingredient(id, name, amount));
    }

    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            //TODO: lav konstruktør
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        @Override
        public String toString() {
            //TODO: lav toString metode
            return "ID: " + id + ", Name: " + name + ", amount: " + amount;
        }
    }

    private List<Ingredient> ingredients;

    public DemoData() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1, "flormelis", 60));
        ingredients.add(new Ingredient(2, "mel", 240));
        ingredients.add(new Ingredient(3, "smør", 185));
    }
    //TODO: implementer metoder
}

