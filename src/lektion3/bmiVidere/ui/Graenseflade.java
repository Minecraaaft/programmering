package lektion3.bmiVidere.ui;

import lektion3.bmiVidere.exceptions.DataException;
import lektion3.bmiVidere.funktionalitet.IFunktionalitet;

import java.util.Scanner;

public class Graenseflade implements IGraenseflade {
    private IFunktionalitet funktionalitet;
    private Scanner scanner = new Scanner(System.in);

    public Graenseflade(IFunktionalitet funktionalitet) {
        this.funktionalitet = funktionalitet;
    }

    public void dialog() {
        System.out.println("Press 1 for to get BMI from CPR, 2 for evaluation of BMI from CPR and 3 to get name from CPR");
        switch (scanner.nextInt()) {
            case 1:
                printBMI();
                break;

            case 2:
                evaluateBMI();
                break;

            case 3:
                getName();
                break;

        }
    }

    public void printBMI() {
        try {
            System.out.println("Enter CPR");
            String cpr = scanner.next();
            double bmi = funktionalitet.getBMI(cpr);
            System.out.println("Personens BMI er: " + bmi);
        } catch (DataException e) {
            System.out.println(e);
        }

    }

    public void evaluateBMI() {
        try {
            System.out.println("Enter CPR");
            System.out.println(funktionalitet.getTextualBMI(scanner.next()));
        } catch (DataException e) {
            System.out.println(e);
        }

    }

    public void getName() {
        try {
            System.out.println("Enter CPR");
            System.out.println(funktionalitet.getNavn(scanner.next()));
        } catch (DataException e) {
            System.out.println(e);
        }

    }

}
