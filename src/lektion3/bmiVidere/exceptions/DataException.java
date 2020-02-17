package lektion3.bmiVidere.exceptions;

public class DataException extends Exception {
    private String cpr;
    public DataException(String cpr) {
        super("no cpr");
        this.cpr = cpr;
    }

    @Override
    public String toString() {
        return "CPR: " +cpr + " was not found.";
    }
}
