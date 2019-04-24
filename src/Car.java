public class Car {

    private int  reg;


    public void park(ParkingLot parkingLot) {
        parkingLot.addCar();


    }
    public void unPark(ParkingLot parkingLot) {
        parkingLot.removeCar();
    }


}
