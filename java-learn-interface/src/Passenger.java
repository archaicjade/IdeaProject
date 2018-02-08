public class Passenger {

    public void travelBy(ICarryPassenger ic) {
        ic.carry(this);
    }

    public Passenger() {

    }

    public Passenger(String name) {
        this();
        this.name = name;
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
