public class Auto{
    public String marca;
    public String modello;
    public String cilindrata;
    public int potenza;
    public String segmento;
    public String alimentazione;
    public String colore;
    public int anno;

    public Auto(String marca, String modello, String cilindrata, int potenza, String segmento, String alimentazione, String colore, int anno){
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.potenza = potenza;
        this.segmento = segmento;
        this.alimentazione = alimentazione;
        this.colore = colore;
        this.anno = anno;
    }

    public void presentaAuto() {
        System.out.println("-" + marca + " , " + modello + " , " + cilindrata + " , " + potenza + "  ," + segmento + " , " + alimentazione + " , " + colore+ " , " + anno + "-" + "\n" + "-------");
    }
}