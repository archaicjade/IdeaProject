public class Outer2 {
    public void print() {
        class Inner2 {
            public void test() {
                System.out.println("Inner.print()");

            }
        }

        Inner2 inner2 = new Inner2();
        inner2.test();

    }
}
