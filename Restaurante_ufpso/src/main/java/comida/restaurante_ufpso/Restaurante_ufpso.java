package comida.restaurante_ufpso;

import java.util.Scanner;
public class Restaurante_ufpso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Customer administrative= new Customer(CustomerRole.ADMINISTRATIVE, "1", "Pepito Perez");
        Customer student= new Customer(CustomerRole.STUDENT, "1", "Pepito Perez");
        administrative.sellFood();
        student.sellFood();
        
        
        Menu menu = new Menu();
        
        Food breakfast1= new Food(DishType.BREAKFAST, "huevos fritos",2400, "huevos, sal, primienta", 20 );
        Food breakfast2= new Food(DishType.BREAKFAST, "Caldo",2400, "carne, papa, platano", 20 );
        Food lunch1= new Food(DishType.LAUNCH, "pastas",2400, "pastas, albondiga, arroz", 20 );
        
        menu.addFood(breakfast1);
        menu.addFood(breakfast2);
        menu.addFood(lunch1);
        
        System.out.println(menu);
    }
}
