package lektion2.bmi;

import lektion2.bmi.data.Data;
import lektion2.bmi.data.IData;
import lektion2.bmi.funktionalitet.Funktionalitet;
import lektion2.bmi.funktionalitet.IFunktionalitet;
import lektion2.bmi.ui.Graenseflade;
import lektion2.bmi.ui.IGraenseflade;

public class Main {
    public static void main(String[] args) {
        IData d = new Data();
        IFunktionalitet f = new Funktionalitet(d);
        IGraenseflade g = new Graenseflade(f);
        while (true) {
            g.dialog();
        }

    }
}
