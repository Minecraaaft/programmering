package lektion3.Simpel2LagsModel.UI;


import lektion3.Simpel2LagsModel.Data.IData;
import lektion3.Simpel2LagsModel.Data.IngredientNotFoundException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI implements IUI {
    private IData data;
    private Scanner scanner;

    public TUI(IData data) {
        this.data = data;
        scanner = new Scanner(System.in);
    }

    @Override
    public void showMenu() {
        try {
            scanner = new Scanner(System.in);
            System.out.println("------------------------");
            System.out.println("1. Vis alle ingredienser");
            System.out.println("2. Vis en ingrediens");
            System.out.println("3. Ændrer en ingrediens");
            System.out.println("4. Indtast ny ingrediens");

            System.out.println("Indtast valg: ");
            int menuID = scanner.nextInt();
            switch (menuID) {
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
                default:
                    System.out.println("Try again!");
                    showMenu();
                    break;
            }
        } catch (InputMismatchException i) {
            System.out.println("Wrong input mate");
        }
    }

    @Override
    public void showIngredients() {
        System.out.println("Alle ingredienser: ");
        for(String i : data.getAllIngredients()) {
            System.out.println(i);
        }
    }

    @Override
    public void showIngredient() {
        try {

            System.out.println("Indtast ID på ingrediensen: ");
            int input = scanner.nextInt();
            String a = data.getIngredientName(input) + " " + data.getIngredientAmount(input) + " gram";
            System.out.println(a);
        } catch (InputMismatchException i) {
            System.out.println("Wrong input mate");
        } catch (IngredientNotFoundException e) {
            System.out.println("Forkert id");
        }
    }

    @Override
    public void changeIngredient() {
        try {
            System.out.println("Indtast ID på ingrediensen: ");
            int input = scanner.nextInt();
            String a = data.getIngredientName(input) + " " + data.getIngredientAmount(input) + " gram";
            System.out.println(a);

            System.out.println("1 Ændre navn");
            System.out.println("2 Ændre mængde");
            System.out.println("3 Annullér");

            System.out.print("Indtast valg: ");
            int menuItem = scanner.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.print("Indtast navn: ");
                    data.setIngredientName(input, scanner.next());
                    break;
                case 2:
                    System.out.print("Indtast mængde: ");
                    data.setIngredientAmount(input, scanner.nextInt());
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException i) {
            System.out.println("Wrong input mate");
        } catch (IngredientNotFoundException e) {
            System.out.println("Forkert id");
        }
    }


    @Override
    public void createIngredient() {
        System.out.println("Skriv id på den nye ingrediens ");
        try {
            int id = scanner.nextInt();
            System.out.println("Indtast navn på ingrediensen ");
            String navn = scanner.nextLine();
            System.out.println("Indtast mængden ");
            int maengde = scanner.nextInt();

            data.createIngredient(id, navn, maengde);
        } catch (InputMismatchException i) {
            System.out.println("Wrong input mate");
        }

    }
}
