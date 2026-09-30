public class MyMain {

    public static void main(String[] args) {
        TopInterface top0, top1;

        top0 = new Base();
        top0.printMyName();

        top1 = new Derived();
        top1.printMyName();

    }
}