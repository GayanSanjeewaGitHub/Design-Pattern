
/**
 *
 * @author GAYAN SANJEEWA
 */
public class PractiseInClass {

    public static void main(String[] args) {
        String expression = "10+5-3+8";
    }
}

interface ExpressionInterface {

    abstract int interpret();
}

class Number implements ExpressionInterface {

    String number;

    public Number(String number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return Integer.parseInt(number);
    }

}

class Plus implements ExpressionInterface {

    ExpressionInterface ex1;
    ExpressionInterface ex2;

    @Override
    public int interpret() {
        return ex1.interpret() + ex2.interpret();
    }

    public Plus(ExpressionInterface ex1, ExpressionInterface ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

}

class Subtract implements ExpressionInterface {

    ExpressionInterface ex1;
    ExpressionInterface ex2;

    @Override
    public int interpret() {
        return ex1.interpret() - ex2.interpret();
    }

    public Subtract(ExpressionInterface ex1, ExpressionInterface ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

}

class Multiply implements ExpressionInterface {

    ExpressionInterface ex1;
    ExpressionInterface ex2;

    @Override
    public int interpret() {
        return ex1.interpret() * ex2.interpret();
    }

    public Multiply(ExpressionInterface ex1, ExpressionInterface ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

}

class Devide implements ExpressionInterface {

    ExpressionInterface ex1;
    ExpressionInterface ex2;

    @Override
    public int interpret() {
        return (ex1.interpret() / ex2.interpret());
    }

    public Devide(ExpressionInterface ex1, ExpressionInterface ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

}
