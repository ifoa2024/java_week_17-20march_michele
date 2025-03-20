public class Menu {
    public Dish dish;
    public Drink drink;

    public Menu(Dish dish, Drink drink){
        this.dish = dish;
        this.drink = drink;
    }   

    public void menu(){
        System.out.println("Dish:" + dish.getName() + "Calories:" + dish.getCalories() + "Ingredients:" + dish.getIngredients());
        System.out.println("Drink:" + drink.getName() + "price:" + drink.getPrice());
    }
}
