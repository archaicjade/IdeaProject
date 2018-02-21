public class Caculate {

    static class Pair {

        private int first;

        private int second;

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

        public Pair(int first, int second) {

            this.first = first;
            this.second = second;
        }
    }

    public static Pair getMaxMin(int[] values) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int value : values) {
            if (min > value) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }
        return new Pair(min, max);

    }
}
