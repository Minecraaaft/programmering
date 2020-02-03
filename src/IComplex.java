import java.awt.*;

public interface IComplex {


    double abs();
    double phase();
    Complex plus(Complex b);
    Complex minus(Complex b);
    Complex times(Complex b);
    Complex scale(double alpha);
    Complex conjugate();
    Complex reciprocal();
    double re();
    double im();
    Complex divides(Complex b);
    public Complex exp();
    Complex sin();
    Complex cos();
    Complex tan();
    static Complex plus(Complex a, Complex b) {
        return new Complex(3,5);
    }
    boolean equals(Object x);
    int hashCode();

}
