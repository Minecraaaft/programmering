package lektion3.lag2Videre;

import lektion3.lag2Videre.data.DemoData;
import lektion3.lag2Videre.data.IData;
import lektion3.lag2Videre.ui.IUI;
import lektion3.lag2Videre.ui.TUI;

public class Main {
    public static void main(String[] args) {
        IData data = new DemoData();
        IUI ui = new TUI(data);
        while (true){
            ui.showMenu();
        }
    }
}
