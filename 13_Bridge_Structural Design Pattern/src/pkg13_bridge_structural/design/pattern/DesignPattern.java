package pkg13_bridge_structural.design.pattern;

/**
 *
 * @author GAYAN SANJEEWA
 */
abstract class Shape {

    Color color;

    public Shape(Color c) {
        this.color = c;
    }

    public abstract void draw();
}

interface Color {

    public abstract void fill();
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Fill Red Color");
    }
}
    class Blue implements Color {

        @Override
        public void fill() {
            System.out.println("Fill Blue Color");
        }

    }
    class Green implements Color {

        @Override
        public void fill() {
            System.out.println("Fill Green Color");
        }

    }

    class Circle extends Shape {

        public Circle(Color c) {
            super(c);
        }

        @Override
        public void draw() {
            color.fill();
        }

    }

    class Rectangle extends Shape {

        public Rectangle(Color c) {
            super(c);
        }

        @Override
        public void draw() {

            color.fill();
        }

    }

    public class DesignPattern {

        public static void main(String[] args) {
             
           new Circle(new Red()).draw();
            
        }

    }
