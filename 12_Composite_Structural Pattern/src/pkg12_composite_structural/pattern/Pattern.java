package pkg12_composite_structural.pattern;

import java.util.ArrayList;

/**
 *
 * @author GAYAN SANJEEWA
 */
abstract class AbstractSuperClass {

    String name;
    int value;

    String getName() {
        return name;
    }

    abstract int getValue();

}

class Child extends AbstractSuperClass {

    public Child(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    int getValue() {
        return value;
    }

}

class Parent extends AbstractSuperClass {

    public Parent(String name, int value) {
        this.name = name;
        this.value = value;
    }
    ArrayList<AbstractSuperClass> abslist = new ArrayList();

    void addChild(AbstractSuperClass child) {
        abslist.add(child);
    }

    @Override
    int getValue() {
        int v = this.value;
        for (AbstractSuperClass child : abslist) {
            v += child.getValue();
        }
        return v;
    }

}

public class Pattern {

    public static void main(String[] args) {
        Parent p1 = new Parent("A", 5);
        Parent p2 = new Parent("B", 3);
        Parent p3 = new Parent("C", 8);
        Child c1 = new Child("X", 2);
        Child c2 = new Child("Y", 1);
        Child c3 = new Child("Z", 6);
        Child c4 = new Child("P", 2);

        p1.addChild(c1);
        p1.addChild(p2);
        p2.addChild(p3);
        p2.addChild(c2);
        p2.addChild(c3);
        p3.addChild(c4);

        System.out.println(p2.getValue());

    }

}
