import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Random random = new Random();

        Passenger[] passengers = new Passenger[6];

        for (int i = 0; i < 6; i++) {
            passengers[i] = new Passenger("Passenger[" + i + "]");

        }

        ICarryPassenger[] icp = new ICarryPassenger[3];
        icp[0] = new Airplane();
        icp[1] = new Car();
        icp[2] = new Train();

        for (int i = 0; i < 6; i++) {
            passengers[i].travelBy(icp[random.nextInt(3)]);

        }
    }
}

