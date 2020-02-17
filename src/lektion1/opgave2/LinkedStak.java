package lektion1.opgave2;

public class LinkedStak implements Stak {
    private String[] array;
    private int size;
    private int stackTop;


    public LinkedStak(int size) {
         array = new String[size];
         this.size = size;
         stackTop = -1;
    }

    @Override
    public void push(String e) {
        array[++stackTop] = e;
    }

    @Override
    public String pop() {
        stackTop--;
        String toReturn = array[0];
        String[] tempArr = new String[size];
        for (int i = 1; i < tempArr.length; i++) {
            tempArr[i] = array[-1];
        }
        tempArr[size - 1] = null;
        array = tempArr;
        return toReturn;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                empty = false;
        }
        return empty;
    }

    @Override
    public boolean isFull() {
        boolean full = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                full = false;
        }
        return full;
    }

    @Override
    public void show() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
