import java.util.Scanner;
import java.util.regex.Pattern;

public class HelloWorld{
    public static void main (String[] args) {
        System.out.println("hello World!");

        // int[] numeri = new int[5];

        // boolean ripeti = true;
        // do{
        //     System.out.println("faccio roba");
        //     if (ripeti = true) {
        //         ripeti = false;
        //     }

        // }while(ripeti == false);

        String[] indirizzo = {"Città", "via", "civico", "CAP", "Paese"};
        int numero = 2;

        if (2 % 2 == 0) {
            numero *= numero;
            System.out.println(numero);
            System.out.println(indirizzo);
        }
 
        // while (numero > 0){
        //     System.out.println(numero);
        // }

        for (int i = 0; i < indirizzo.length; i++) {
            System.out.println(indirizzo[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa:");
        int input = scanner.nextInt();
        System.out.println("Hai inserito:" + input);
        scanner.close();

        


    }
}  