public abstract class Goods implements Isortable {

    public Goods(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    abstract void print();

    private String title;
    private Double price;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareWith(Object a) {
        Goods g = (Goods) a;

        if (this.price > g.getPrice()) {
            return 1;
        } else if (this.price < g.getPrice()) {
            return -1;
        }
        return 0;
    }
}

