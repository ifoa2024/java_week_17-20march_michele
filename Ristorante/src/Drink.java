public abstract class Drink {
    public String name;
    public int price;

    public Drink(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {  
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void menu(){
        System.out.println("Drink:" + name + "price:" + price);
    }
}
