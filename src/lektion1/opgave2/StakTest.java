package lektion1.opgave2;

public class StakTest {

    public static void main(String[] args) {
        String[] array = {"Dette", "er", "en", "mærkelig", "sætning"};

//        ArrayStak arrayStak = new ArrayStak(5);
//        for (int i = 0; i < array.length; i++) {
//            arrayStak.push(array[i]);
//        }
//
//        for (int i = 0; i < 1; i++) {
//            arrayStak.pop();
//        }
////        System.out.println(arrayStak.pop());
//
//        System.out.println(arrayStak.isEmpty());
//        System.out.println(arrayStak.isFull());
//
//        arrayStak.show();


        LinkedStak linkedStak = new LinkedStak(5);
        for (int i = 0; i < 3; i++) {
            linkedStak.push(array[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(linkedStak.pop());
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            linkedStak.push(array[i+2]);
        }
        linkedStak.push(array[2]);

        for (int i = 0; i < 5; i++) {
            System.out.println(linkedStak.pop());
        }

    }
}
