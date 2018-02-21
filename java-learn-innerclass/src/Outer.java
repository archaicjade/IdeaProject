public class Outer {

    /*
     *
     */
    private int num;

    private Inner inner;

    public Outer() {
        num = 1;
        inner = new Inner();

    }

    public void print() {

        System.out.println("Outer.print();");
        System.out.println(inner.num);

        System.out.println(num);

    }

    public Inner getInnerInstance() {
        return new Inner();
    }

    protected class Inner {

        public int num;


        public Inner() {
            num = 2;
        }

        public void print() {
            System.out.println("Inner.print()");
            System.out.println(this.num);
            System.out.println(Outer.this.num);

        }
    }
}
