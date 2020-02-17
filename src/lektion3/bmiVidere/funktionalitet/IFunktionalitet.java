package lektion3.bmiVidere.funktionalitet;

import lektion3.bmiVidere.exceptions.DataException;

public interface IFunktionalitet {
    // beregn BMI udfra personens CPR-nr
    double getBMI(String cpr)  throws DataException;
    // returnér en tekst der beskriver BMI intervallet
    String getTextualBMI(String cpr)  throws DataException;
    // returnér person navn udfra CPR-nr
    String getNavn(String cpr)  throws DataException;
}
