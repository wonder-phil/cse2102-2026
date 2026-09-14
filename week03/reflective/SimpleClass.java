public class SimpleClass {


    private int value1, value2;
    public int number1, number2;

    public static void main(String[] args) {
        System.out.println("Hello wonderful world!");
    }

    public int addValues(int a, int b) {
        return a+b;
    }

    public int subtractValues(int first, int second) {
        return first-second;
    }

    public void setValue1(int v1) {
        value1 = v1;
    }

    public void setValue2(int v2) {
        value2 = v2;
    }

    public void printValues() {
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
    }

    public void setNumbers() {
        number1 = 1;
        number2 = 2;
    }

}