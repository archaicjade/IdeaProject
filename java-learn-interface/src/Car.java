public class Car implements ICarryPassenger {

    int passengerNum;

    @Override
    public void carry(Passenger passenger) {
        System.out.println("Passenger:" + passenger.getName() + " travel by Car.");
        passengerNum++;
        System.out.println("Car carries:" + passengerNum + " passenger.");
    }
}
