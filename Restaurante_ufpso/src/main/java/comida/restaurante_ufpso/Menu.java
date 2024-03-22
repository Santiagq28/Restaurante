package comida.restaurante_ufpso;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Food> dishlist;

    public Menu() {
      this.dishlist = new ArrayList<>();
      
      
            
    }

    public Menu(ArrayList<Food> foodlist) {
        this.dishlist = foodlist;
    }
    
    public void addFood(Food food){
     this.dishlist.add(food);
    }
    
    public ArrayList<String> getDishPerType(DishType dishType){
    ArrayList<String> foundDishes = new ArrayList<>();
    
    for(Food dish : dishlist){
      if(dish.getType() == dishType){
         foundDishes.add(dish.getName());
      }
    }
    
    return foundDishes;
    }
    
}
