import java.lang.reflect.Array;

public abstract class Dish {
    public String name;
    public int calories;
    public Array ingredients;

    public Dish (String name, int calories, Array ingredients){
        this.name = name;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public Array getIngredients() {
        return ingredients;
    }

    public void setName(String name) {  
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredients(Array ingredients) {
        this.ingredients = ingredients;
    }

    public void menu(){
        System.out.println("Dish:" + name + "Calories:" + calories + "Ingredients:" + ingredients);
    }


}
