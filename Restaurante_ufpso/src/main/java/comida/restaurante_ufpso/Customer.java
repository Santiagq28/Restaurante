package comida.restaurante_ufpso;
public class Customer {
    CustomerRole role;
    String id;
    String fullname;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    
    
 
    void SayMenu(){
    }
    
    void buyFood(){
    }
    
    void cancelBuy(){
    }
    
    public void sellFood(){
    if (this.role != CustomerRole.ADMINISTRATIVE){
    System.out.println("Usted no tiene permiso para vender");
    return;
    }
    System.out.println("Ya te atiendo wey");
    }
}
