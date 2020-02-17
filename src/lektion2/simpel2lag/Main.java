package lektion2.simpel2lag;

import lektion2.simpel2lag.data.DemoData;
import lektion2.simpel2lag.data.IData;
import lektion2.simpel2lag.ui.IUI;
import lektion2.simpel2lag.ui.TUI;

public class Main {
    public static void main(String[] args) {
        IData data = new DemoData();
        IUI ui = new TUI(data);
        while (true){
            ui.showMenu();
        }
    }
}
