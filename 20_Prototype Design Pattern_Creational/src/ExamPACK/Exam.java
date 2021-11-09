package ExamPACK;


import java.util.HashMap;
import java.util.Map;

abstract class Car implements Cloneable {

    protected String colorName;
    protected String brandName;
    protected int year;

    abstract void show();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class BenzCar extends Car {

    public BenzCar() {
        this.colorName = "White";
        this.brandName = "Benz";
        this.year = 2021;
    }

    @Override
    void show() {
        System.out.println("Benz car shows ");
    }

}

class AudiCar extends Car {

    public AudiCar() {
        this.colorName = "black";
        this.brandName = "Audi";
        this.year = 2020;
    }

    @Override
    void show() {
        System.out.println("Audi Car Shows");
    }
}

class CarStore {

    private static Map<String, Car> carMap = new HashMap<String, Car>();

    static {
        carMap.put("benz", new BenzCar());
        carMap.put("audi", new AudiCar());
    }

    public static Car getCar(String carName) {
        return (Car) carMap.get(carName).clone();
    }
}

class Prototype {

    public static void main(String[] args) {
        CarStore.getCar("benz").show();
        CarStore.getCar("audi").show();

    }
}
