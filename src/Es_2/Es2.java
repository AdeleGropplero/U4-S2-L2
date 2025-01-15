package Es_2;

import java.util.*;

public class Es2 {
    Random random = new Random();
    List<Integer> listRandom = new ArrayList<>(); //si può omettere il secondo <Integer>

    public void printListRandom(java.util.Scanner sc) {
        System.out.println("Di quanti numeri vuoi la tua lista?");
        int lunghezzaLista = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < lunghezzaLista; i++) {
            listRandom.add(random.nextInt(100));
        }
        System.out.println("Lista generata: " + listRandom);
        System.out.println("----------------------------------");
        printListRandomReverse();
        System.out.println("----------------------------------");
        printListRandomBoolean(sc);

    }

    private void printListRandomReverse() {
        //for (number : listRandom){}
        Collections.reverse(listRandom);
        /*Collections.reverse() è un metodo statico fornito dalla classe Collections in Java,
        che permette di invertire l'ordine degli elementi di una lista.
        Questo metodo è molto utile quando vuoi invertire rapidamente una lista
        senza dover implementare manualmente un ciclo di scambio.*/
        System.out.println("Lista invertita: " + listRandom);
    }

    private void printListRandomBoolean(java.util.Scanner sc) {
        System.out.println("Premi 1 per visualizzare i numeri in posizioni DISPARI");
        System.out.println("Premi 2 per visualizzare i numeri in posizioni PARI");
        int selection = sc.nextInt();
        sc.nextLine();
        boolean selected = false;
        if (selection == 1) {
            selected = true;
        } else if (selection == 2) {
            selected = false;
        }
        if (selected) {
            for (int i = 0; i < listRandom.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(listRandom.get(i));
                }
            }
        } else {
            for (int i = 0; i < listRandom.size(); i++) {
                if (i % 2 != 0) {
                    System.out.println(listRandom.get(i));
                }
            }
        }

    }

}
