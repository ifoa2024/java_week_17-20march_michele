public class Animal {
    public String Species;
    public String typology;
    public String habitat;

    public Animal(String Species, String typology, String habitat) {
        this.Species = Species;
        this.typology = typology;
        this.habitat = habitat;
    }

    public void printAnimal() {
        System.out.println("Species: " + Species);
    }
    
}
