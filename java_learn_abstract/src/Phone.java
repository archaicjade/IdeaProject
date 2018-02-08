/*
 *
 * */
public class Phone extends Goods {

    private Double screenSize;//屏幕大小
    private Double batteryLife;//续航时间

    public Phone(String title, Double price, Double screenSize, Double batteryLife) {
        super(title, price);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    @Override
    void print() {

        System.out.println("Phone print------");
        System.out.println("ScreenSize:" + getScreenSize() + "inches");
        System.out.println("Title:" + getTitle());
        System.out.println("BatteryLife:" + getBatteryLife() + " h");
        System.out.println("Price:$" + getPrice());
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(Double batteryLife) {
        this.batteryLife = batteryLife;
    }
}

