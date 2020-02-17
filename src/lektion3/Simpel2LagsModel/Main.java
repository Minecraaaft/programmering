package lektion3.Simpel2LagsModel;

import Simpel2LagsModel.Data.DemoData;
import Simpel2LagsModel.Data.IData;
import Simpel2LagsModel.UI.IUI;
import Simpel2LagsModel.UI.TUI;

public class Main {
    public static void main(String[] args) {
        IData data = new DemoData();
        IUI ui = new TUI(data);
        while (true){
            ui.showMenu();
        }


    }
}
