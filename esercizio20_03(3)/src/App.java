import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Auto> catalogoAuto = new ArrayList<>(List.of(
            new Auto("Fiat", "Panda", "1200cc", 60, "Utilitaria", "Benzina", "Bianco", 2019),
            new Auto("Ford", "Fiesta", "1400cc", 80, "Utilitaria", "Benzina", "Blu", 2018),
            new Auto("Audi", "A3", "2000cc", 150, "Berlina", "Diesel", "Nero", 2017),
            new Auto("BMW", "X5", "3000cc", 250, "SUV", "Diesel", "Grigio", 2016),
            new Auto("Fiat", "500", "900cc", 70, "Utilitaria", "Benzina", "Rosso", 2019),
            new Auto("Ferrari", "F8", "3900cc", 720, "Supercar", "Benzina", "Rosso", 2020),
            new Auto("Lamborghini", "Urus", "4000cc", 650, "SUV", "Benzina", "Giallo", 2020)
        ));

        System.out.println("Catalogo Auto");
        for(Auto auto : catalogoAuto) {
            auto.presentaAuto();
        }

        System.out.print("Inserisci il modello dell'auto doppione che vuoi eliminare:");
        String sceltaModello = sc.nextLine();

       for(Auto auto : catalogoAuto){
        if(auto.modello.equalsIgnoreCase(sceltaModello)){
            catalogoAuto.remove(auto);
            break;
        }
       }

        System.out.println("Catalogo auto aggiornato:");
        for (Auto auto : catalogoAuto) {
            auto.presentaAuto();
        }

        sc.close();
    }
}



