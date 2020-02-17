package lektion2.simpel2lag.ui;

import lektion2.simpel2lag.data.IData;
import lektion2.simpel2lag.ui.IUI;

import java.util.Scanner;

public class TUI implements IUI {
    private IData data;
    private Scanner scanner = new Scanner(System.in);

    public TUI(IData data) {
        this.data = data;
    }

    @Override
    public void showMenu() {
        System.out.println();
        System.out.println();
        System.out.println("Hello press 1 for show all ingredients, 2 for show ingredient for ID, 3 for change ingredient for ID");
        System.out.println("or 4 for creating an ingredient");

        int choosenMenu = scanner.nextInt();
        switch (choosenMenu) {
            case 1:
                showIngredients();
                break;
            case 2:
                showIngredient();
                break;

            case 3:
                changeIngredient();
                break;

            case 4:
                createIngredient();
                break;
        }


    }

    @Override
    public void showIngredients() {
        String[] ingredientNames = data.getAllIngredients();
        String ingredientString = "";
        for (int i = 0; i < ingredientNames.length; i++) {
            if (i != ingredientNames.length -1)
                ingredientString += ingredientNames[i] + ", ";
            else
                ingredientString += ingredientNames[i];
        }
        System.out.println(ingredientString);
    }

    @Override
    public void showIngredient() {
        System.out.println("Write the ID for the ingredient you want to ingredient you want");
        System.out.println(data.getIngredientName(scanner.nextInt()));

    }

    @Override
    public void changeIngredient() {
        System.out.println("Write the ID and the name you want it to have");
        int ID = scanner.nextInt();
        String name = scanner.nextLine();
        System.out.println(data.getIngredientName(ID) + " has been change to " + name);
        data.setIngredientName(ID, name);
    }

    @Override
    public void createIngredient() {
        System.out.println("Enter the ID, name and amount: ");
        int ID = scanner.nextInt();
        String name = scanner.nextLine();
        int amount = scanner.nextInt();

        data.createIngredient(ID, name, amount);
        System.out.println(name + " is made :)");
    }
}
