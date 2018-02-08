public class Train implements ICarryPassenger {
    int passengerNum;


    @Override
    public void carry(Passenger passenger) {
        System.out.println("Passenger:" + passenger.getName() + " travel by Tran.");
        passengerNum++;
        System.out.println("Train carries:" + passengerNum + " passenger.");
    }
}
