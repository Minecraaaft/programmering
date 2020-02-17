package lektion1.opgave2;

public interface Stak {
    void push(String e);
    String pop();
    boolean isEmpty();
    boolean isFull();
    void show();
}
