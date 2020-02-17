package lektion1.opgave2;

public class ArrayStak implements Stak {
    private String[] array;
    private int size;
    private int stakTop;

    public ArrayStak(int size) {
        this.array = new String[size];
        this.size = size;
        this. stakTop = -1;
    }

    @Override
    public void push(String e) {
        array[++stakTop] = e;
    }

    @Override
    public String pop() {
        if (stakTop == 0) {
            return array[stakTop];
        }
        return array[stakTop--];
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
            if (array[i] != null) {
                printText += " " + array[i];
            }

        }
        System.out.println(printText);
    }
}
