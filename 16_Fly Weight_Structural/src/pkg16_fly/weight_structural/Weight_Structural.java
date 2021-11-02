
import java.util.HashMap;


 class FlyweightInClass  {
    
    public static void main(String[] args) {
        Car c=CarFactory.getCar(new Colour(300, 20, 75));
        Car c1=CarFactory.getCar(new Colour(100, 60, 65));
        Car c2=CarFactory.getCar(new Colour(300, 20, 75));
        
        System.out.println(c==c2);
        System.out.println(c==c1);
    }
    
}

class Colour{
    int r;
    int g;
    int b;
   

    public Colour(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
       
    }
    
}

class Car{
   Colour colour;

    public Car(Colour colour) {
        this.colour = colour;
    }
   
}
class CarFactory{
       private static final HashMap<String, Car> POOL = new HashMap<>();  
        public static  Car getCar(Colour colour) {    
        Car c= POOL.get((String.valueOf(colour.r+colour.g+colour.b)));
        if (c == null) {
            c = new Car(new Colour(colour.r,colour.g,colour.b));
            POOL.put(String.valueOf(colour.r+colour.g+colour.b), c);
        }
        return c;
    }
}
