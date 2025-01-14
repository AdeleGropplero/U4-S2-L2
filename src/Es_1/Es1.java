package Es_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Es1 {
    Set<String> listaParole = new HashSet<String>();

    List<String> listaParoleDuplicate = new ArrayList<>();

    public void setList(java.util.Scanner sc) {
        System.out.println("inserisci il numero di elementi che vuoi nella tua lista:");
        int numOfElements = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("scegli la parola n: " + (i + 1));
            String word = sc.nextLine();
            if (!listaParole.add(word)){
                listaParoleDuplicate.add(word);
            }else {listaParole.add(word);}

            // System.out.println(word);
        }
        //System.out.println(listaParole);
        readList(sc);
    }

    private void readList(java.util.Scanner sc){
        System.out.println("Seleziona cosa vuoi verificare:");
        System.out.println("1) parole duplicate");
        System.out.println("2) numero parole distinte");
        System.out.println("3) elenco parole distinte");

        int selection = sc.nextInt();
        sc.nextLine();

        if (selection == 1){
            System.out.println("Parole duplicate: " + listaParoleDuplicate);
        } else if (selection == 2) {
            System.out.println("hai selezionato 2. Il numero di parole distinte è: " + listaParole.size());
        } else if (selection==3) {
            System.out.println("hai selezionato 3. Le parole distinte sono: " + listaParole);
        }else {
            System.out.println("per favore inserisci un valore tra 1 e 3");
        }
    }


}
