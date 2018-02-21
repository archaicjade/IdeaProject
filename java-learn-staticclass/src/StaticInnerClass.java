public class StaticInnerClass {

    private int numA = 1;
    public static int numB = 2;

    static class Inner {

        private int numC = 3;

        public static int numD = 4;

        public void printInner() {
            System.out.println("printInner");
            System.out.println(numB);
            System.out.println(numC);
            System.out.println(numD);
        }
    }

    public void printOuter() {
        System.out.println("printOuter");
    }
}
