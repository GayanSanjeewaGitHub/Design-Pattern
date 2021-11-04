package Exam;

  class InterpriterPaternRunner {

    public static void main(String[] args) {
        String numberToText = "9317";
        String[] split = numberToText.split("");
        System.out.print(numberToText + "--> converted Form :--> ");
        for (String string : split) {
            Expression expression = new NumberToString(string);
            System.out.print(expression.interprit() + " ");
        }
        
        
        System.out.println("");

        String textToNumber = "Nine One Four";
        String[] split2 = textToNumber.split(" ");
        System.out.print(textToNumber + "--> converted Form :--> ");
        for (String string : split2) {
            Expression expression = new StringToNumber(string);
            System.out.print(expression.interprit());
        }
        System.out.println("");
    }

}

interface Expression {

    public abstract String interprit();
}

class StringToNumber implements Expression {

    String text;

    public StringToNumber(String text) {
        this.text = text;
    }

    @Override
    public String interprit() {

        String string = this.text.toLowerCase().trim();

        switch (string) {
            case "zero":
                return "0";
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            default:
                return "-1";
        }

    }

}

class NumberToString implements Expression {

    String text;

    public NumberToString(String text) {
        this.text = text;
    }

    @Override
    public String interprit() {

        String string = this.text.toLowerCase().trim();

        switch (string) {
            case "0":
                return "zero";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            default:
                return "";
        }

    }

}
