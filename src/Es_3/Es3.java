package Es_3;

import java.util.HashMap;
import java.util.Map;

public class Es3 {
    Map <String, String> rubrica =new HashMap<>();

    public void inserisciInRubrica(java.util.Scanner sc){
        System.out.println("Inserisci il - Nome - del nuovo contatto");
        String nome = sc.nextLine();
        System.out.println("Inserisci il - Numero - del nuovo contatto");
        String numero = sc.nextLine();
        rubrica.put(nome, numero);
        System.out.println(nome + " " + numero + " aggiunto in rubrica ");
    }

    public void cancellaInRubrica(java.util.Scanner sc){
        System.out.println("Inserisci il - Nome - del contatto da cancellare");
        String nome = sc.nextLine();
        rubrica.remove(nome);
        System.out.println(nome + " è stato cancellato dai tuoi contatti");
    }

    public void cercaInRubricaNumero(java.util.Scanner sc){
        System.out.println("Inserisci il - Numero - del contatto da cercare");
        String numero = sc.nextLine();
        Boolean contatto = rubrica.containsValue(numero);
        System.out.println(contatto);
    }

    public void cercaInRubricaNome(java.util.Scanner sc){
        System.out.println("Inserisci il - Nome - del contatto da cercare");
        String nome = sc.nextLine();
        String contatto = rubrica.get(nome);
        System.out.println(contatto);
    }
}
