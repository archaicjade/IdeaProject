public class Computer extends Goods {

    private String cpu;
    private String graphicsCard;

    /**
     *
     */
    public Computer(String cpu, String graphicsCard, String title, Double price) {
        super(title, price);
        this.cpu = cpu;
        this.graphicsCard = graphicsCard;
    }

    @Override
    void print() {
        System.out.println("Computer print------");
        System.out.println("Title" + getTitle());
        System.out.println("Price:$" + getPrice());
        System.out.println("CPU:" + getCpu());
        System.out.println("GraphicsCard:" + getGraphicsCard());
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}

