public class Television extends Goods {


    private Double screenSize;
    private String resolution;

    public Television(Double screenSize, String resolution, String title, Double price) {
        super(title, price);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    @Override
    void print() {
        System.out.println("Television print------");
        System.out.println("Title:" + getTitle());
        System.out.println("Price:$" + getPrice());
        System.out.println("ScreenSize:" + getScreenSize());
        System.out.println("Resolution:" + getResolution());
    }



    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }
}
