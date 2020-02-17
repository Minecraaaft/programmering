package lektion1.opgave1;

public interface IComplex {


    double abs();
    double phase();
    IComplex plus(IComplex b);
    IComplex minus(IComplex b);
    IComplex times(IComplex b);
    IComplex scale(double alpha);
    IComplex conjugate();
    IComplex reciprocal();
    double re();
    double im();
    IComplex divides(IComplex b);
    IComplex exp();
    IComplex sin();
    IComplex cos();
    IComplex tan();
    static IComplex plus(IComplex a, IComplex b) {
        return new Complex(3,5);
    }
    boolean equals(Object x);
    int hashCode();

}
