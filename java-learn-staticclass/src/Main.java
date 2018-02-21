public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        StaticInnerClass outer = new StaticInnerClass();
        outer.printOuter();

        StaticInnerClass.Inner inner = new StaticInnerClass.Inner();

        inner.printInner();

        System.out.println(StaticInnerClass.numB);

        System.out.println(StaticInnerClass.Inner.numD);


        int[] list = {1, 3, 5, 2, 77, 23, 25};
        Caculate.Pair pair = Caculate.getMaxMin(list);

        System.out.println("pair.getFirst() = " + pair.getFirst());

        System.out.println("pair.getSecond() = " + pair.getSecond());

    }
}

