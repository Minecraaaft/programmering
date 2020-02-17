package lektion2.simpel2lag.data;

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
    public String getIngredientName(int id) {
        String name = null;
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).id == id)
                name = ingredients.get(i).name;
        }
        return name;
    }

    @Override
    public int getIngredientAmount(int id) {
        int  amount = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).id == id)
                amount = ingredients.get(i).amount;
        }
        return amount;
    }

    @Override
    public void setIngredientName(int id, String name) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).id == id)
                ingredients.get(i).name = name;
        }
    }

    @Override
    public void setIngredientAmount(int id, int amount) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).id == id)
                ingredients.get(i).amount = amount;
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

