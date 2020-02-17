package lektion1.opgave3;

import java.util.Arrays;

public class Vector implements IVector, Comparable<Vector> {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    @Override
    public IVector times(IVector vector, double constant) {
        ((Vector) vector).x = ((Vector) vector).x * constant;
        ((Vector) vector).y = ((Vector) vector).y * constant;
        return vector;
    }

    @Override
    public IVector add(IVector a, IVector b) {
        ((Vector) a).x = ((Vector) a).x + ((Vector) b).x;
        ((Vector) a).y = ((Vector) a).y + ((Vector) b).y;
        return a;
    }

    @Override
    public boolean equals(IVector vector) {
        boolean isEqual = false;
        if (this.x == ((Vector) vector).x && this.y == ((Vector) vector).y) {
            isEqual = true;
        }
        return isEqual;
    }

    @Override
    public int compareTo(Vector o) {
        int isitbiggerHMMMm = 0;

        double length = Math.sqrt(this.x * this.x + this.y * this.y);
        double compareableLength = Math.sqrt(o.x * o.x + o.y * o.y);
        if (length > compareableLength) {
            isitbiggerHMMMm = 1;
        } else if (length < compareableLength) {
            isitbiggerHMMMm = -1;
        }

        return isitbiggerHMMMm;
    }

    public static void main(String[] args) {
        Vector[] Vs = {new Vector(1337,4), new Vector(4,4), new Vector(2,2), new Vector(3,48), new Vector(132,4), new Vector(2,42)};
        Arrays.sort(Vs);
        for (int i = 0; i < Vs.length; i++) {
            System.out.println(Vs[i].x + ", " + Vs[i].y );
        }
    }
}
