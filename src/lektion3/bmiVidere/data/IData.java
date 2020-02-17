package lektion3.bmiVidere.data;

import lektion3.bmiVidere.exceptions.DataException;

public interface IData {
    String getNavn(String cpr) throws DataException;
    double getVaegt(String cpr) throws DataException;
    double getHoejde(String cpr) throws DataException;

}
