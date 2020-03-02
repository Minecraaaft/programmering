package lektion4.collections;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CompareVector implements Comparator<Vector> {
    @Override
    public int compare(Vector o1, Vector o2) {
        int isitbiggerHMMMm = 0;

        double length = Math.sqrt(o1.getX() * o1.getX() + o1.getY() * o1.getY());
        double compareableLength = Math.sqrt(o2.getX() * o2.getX() + o2.getY() * o2.getY());
        if (length > compareableLength) {
            isitbiggerHMMMm = 1;
        } else if (length < compareableLength) {
            isitbiggerHMMMm = -1;
        }
        return isitbiggerHMMMm;
    }

    @Override
    public Comparator<Vector> reversed() {
        return null;
    }

    @Override
    public Comparator<Vector> thenComparing(Comparator<? super Vector> other) {
        return null;
    }

    @Override
    public <U> Comparator<Vector> thenComparing(Function<? super Vector, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Vector> thenComparing(Function<? super Vector, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Vector> thenComparingInt(ToIntFunction<? super Vector> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Vector> thenComparingLong(ToLongFunction<? super Vector> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Vector> thenComparingDouble(ToDoubleFunction<? super Vector> keyExtractor) {
        return null;
    }
}
