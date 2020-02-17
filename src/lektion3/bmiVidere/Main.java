package lektion3.bmiVidere;

import lektion3.bmiVidere.data.Data;
import lektion3.bmiVidere.data.IData;
import lektion3.bmiVidere.funktionalitet.Funktionalitet;
import lektion3.bmiVidere.funktionalitet.IFunktionalitet;
import lektion3.bmiVidere.ui.Graenseflade;
import lektion3.bmiVidere.ui.IGraenseflade;

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
