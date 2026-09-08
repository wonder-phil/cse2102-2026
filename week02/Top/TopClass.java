import Middle.Bottom.BottomClass;
import Middle.MiddleClass;


class TopClass {


    public static void main(String[] args) {

        MiddleClass mclass = new MiddleClass();
        mclass.printMe();

        BottomClass bclass = new BottomClass();

        bclass.printMe();
    }

}