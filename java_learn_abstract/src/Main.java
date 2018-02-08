public class Main {

    public static void main(String[] args) {

        Goods[] goodsList = new Goods[3];
        goodsList[0] = new Phone("Iphone", 9688.00, 5.8, 24.0);
        goodsList[1]
                = new Computer("i7-7700HQ", "GTX1060", "Alienware15C-R2738", 17699.00);
        goodsList[2]
                = new Television(78.00, "4k", "SAMSUNG UA78KU6900JXXZ", 21999.00);

        Sort.bubbleSort(goodsList);

        for (Goods goods : goodsList) {
            goods.print();
        }
    }
}


