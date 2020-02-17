package lektion2.bmi.funktionalitet;

import lektion2.bmi.data.IData;

public class Funktionalitet implements IFunktionalitet {
    private IData data;

    public Funktionalitet(IData data) {
        this.data = data;
    }

    @Override
    public double getBMI(String cpr) {
        return data.getVaegt(cpr) / (data.getHoejde(cpr) * data.getHoejde(cpr));
    }

    @Override
    public String getTextualBMI(String cpr) {
        double bmi = getBMI(cpr);
        String message = null;
        if (bmi < 18.5) {
            message = "Du vejer for lidt";
        } else if (bmi < 25) {
            message = "Din vægt er passende";
        } else if (bmi <= 30) {
            message = "Du er overvægtig";
        } else {
            message = "Du er svært overvægtig";
        }
        return message;
    }

    @Override
    public String getNavn(String cpr) {
        return data.getNavn(cpr);
    }
}
