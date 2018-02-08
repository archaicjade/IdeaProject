public class Sort {

    public static void bubbleSort(Isortable[] isortables) {
        for (int i = 0; i < isortables.length - 1; i++) {
            for (int j = 0; j < isortables.length - i - 1; j++) {
                if (isortables[j].compareWith(isortables[j + 1]) < 0) {
                    Isortable tmp = isortables[j + 1];
                    isortables[j + 1] = isortables[j];
                    isortables[j] = tmp;
                }
            }
        }
    }
}
