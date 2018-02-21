public class Main {

    public static void main(String[] args) {

        Outer outer = new Outer();
//        Outer.Inner inner = new Outer().new Inner();

        Outer.Inner inner = outer.getInnerInstance();

        outer.print();
        inner.print();
    }
}

