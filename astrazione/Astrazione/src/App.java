import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args){
        //upcasting assegno il figlio ad una variabile di tipo padre
        Arm armSx = new Fist(Side.Sx);
        Arm armDx = new Drill(Side.Dx);
        Leg legSx = new Shield();
        Leg legDx = new Shield();

        //object composition, compongo un oggetto a partire dall'esistenza di altri oggetti
        // Jeeg jeeg1 =  new Jeeg(armSx, armDx, legSx, legDx);

        // jeeg1.attack();
        // jeeg1.defence();

        List<Jeeg> JeegList =  new ArrayList<Jeeg>();

        JeegList.add(new Jeeg(armSx, armDx, legSx, legDx));
        JeegList.add(new Jeeg(armSx, armDx, legSx, legDx));
        JeegList.add(new Jeeg(armSx, armDx, legSx, legDx));


        for (Jeeg jeeg: JeegList){
            jeeg.attack();
            jeeg.defence();
        }


        //Iteratos: utile per le collection 
        Iterator<Jeeg> jeegIterator =  JeegList.iterator();
        while(jeegIterator.hasNext()){
            Jeeg jeeg = jeegIterator.next();
            System.out.println("ciao sono un jeeg");
        }

        //come dichiarare una linkedList

        List<Jeeg> jeegLinkedList = new LinkedList<Jeeg>();
        jeegLinkedList.add(new Jeeg(armSx, armDx, legSx, legDx));
        jeegLinkedList.add(new Jeeg(armSx, armDx, legSx, legDx));
        jeegLinkedList.add(new Jeeg(armSx, armDx, legSx, legDx));

        jeegLinkedList.add(2, new Jeeg( armSx, armDx, legSx, legDx));

        for (Jeeg jeeg: jeegLinkedList){
            System.out.println("ciao sono un jeegaaaaList");
        }

        List<Jeeg> jeegLinkedList2 = new LinkedList<Jeeg>();
        List.of(
            new Jeeg(armSx, armDx, legSx, legDx),
            new Jeeg(armSx, armDx, legSx, legDx),
            new Jeeg(armSx, armDx, legSx, legDx)
        );

        for (Jeeg jeeg: jeegLinkedList2){
            System.out.println("ciao sono un jeegaaaaList generato con of" + jeeg);
        }

        //aggiunge i jeeg a partire dall'indice 1.
        jeegLinkedList2.addAll(
            1, List.of(
                new Jeeg(armSx, armDx, legSx, legDx),
                new Jeeg(armSx, armDx, legSx, legDx)
            )
        );

        jeegLinkedList2.get(3);

    }
        
        
        
    //type intent: dico che la funzione riceve un dato di tipo specifico. non si tratta di una dependency injection
    public void test(Jeeg jeeg){}

}
