package design.patterns;

abstract class Icecream {

    abstract int getPrice();
}

class VanilaIceCream extends Icecream {

    @Override
    int getPrice() {
        return 50;
    }

}

abstract class IcecreamDecorator extends Icecream {

    Icecream icecream;

    int getPrice() {
        return icecream.getPrice();

    }
}

class Vanilasource extends IcecreamDecorator {

    public Vanilasource(Icecream icecream) {
        this.icecream = icecream;
    }

}

class Cashunut  extends  IcecreamDecorator  {

    public Cashunut(Icecream icecream) {
        this.icecream = icecream;
    }

}

class ChocalateIceCream extends Icecream {

    @Override
    int getPrice() {
        return 80;
    }

}

public class Decorator {

    public static void main(String[] args) {
        VanilaIceCream vi = new VanilaIceCream();
        Vanilasource vs = new Vanilasource(vi);
        System.out.println("Price of Icecream :" + vs.getPrice() + 10);

        ChocalateIceCream ci = new ChocalateIceCream();
        Vanilasource vs2 = new Vanilasource(ci);

    }

}
