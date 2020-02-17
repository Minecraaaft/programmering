package lektion1.opgave3;

public interface IVector {
    String toString();
    IVector times(IVector vector, double constant);
    IVector add(IVector a, IVector b);
    boolean equals(IVector vector);
}
