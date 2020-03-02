package lektion4.genericsList;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayStak2<E> implements IStak35<E> {
    private List<E> array;
    private int size;
    private int stakTop;

    public ArrayStak2(int size) {
        array = new ArrayList<>();
        this.size = size;
        stakTop = -1;
    }

    @Override
    public void push(E e) {
        array.add(e);
        stakTop++;
    }

    @Override
    public E pop() {
        E ret = null;
        if (stakTop == 0) {
            ret =  array.get(stakTop);
            array.remove(stakTop);
        } else {
            ret =  array.get(stakTop--);
            array.remove(ret);
        }

        return ret;
    }


    @Override
    public boolean isEmpty() {
        return stakTop == -1;
    }

    @Override
    public boolean isFull() {
        return stakTop == size - 1;
    }

    @Override
    public void show() {
        String printText = "";
        for (int i = 0; i < stakTop; i++) {
            if (array.get(i) != null) {
                printText += " " + array.get(i);
            }

        }
        System.out.println(printText);
    }
}
