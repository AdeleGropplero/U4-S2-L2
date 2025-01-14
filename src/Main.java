import Es_1.Es1;
import Es_2.Es2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("-----Es.1-----");
        Es1 es1 = new Es1();
       // es1.setList(sc);

        System.out.println("-----Es.2-----");
        Es2 es2 = new Es2();
        es2.printListRandom(sc);
    }
}
