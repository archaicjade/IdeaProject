public class Airplane implements ICarryPassenger {

    private int passengerNum;


    @Override
    public void carry(Passenger passenger) {
        System.out.println("Passenger:" + passenger.getName() + " travel by Airplane.");
        passengerNum++;
        System.out.println("Airplane carries:" + passengerNum + " passenger.");
    }
}
