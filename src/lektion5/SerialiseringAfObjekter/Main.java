package lektion5.SerialiseringAfObjekter;



import lektion5.SerialiseringAfObjekter.Complex;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Complex[] c = new Complex[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Complex(2*i, 3*i);
        }

        File file = new File("testdoc.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c);

    }
}
