package lektion2.bmi.ui;

import lektion2.bmi.funktionalitet.IFunktionalitet;

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
        System.out.println("Enter CPR");
        String cpr = scanner.next();
        double bmi = funktionalitet.getBMI(cpr);
        System.out.println("Personens BMI er: " + bmi);
    }

    public void evaluateBMI() {
        System.out.println("Enter CPR");
        System.out.println(funktionalitet.getTextualBMI(scanner.next()));
    }

    public void getName() {
        System.out.println("Enter CPR");
        System.out.println(funktionalitet.getNavn(scanner.next()));
    }

}
