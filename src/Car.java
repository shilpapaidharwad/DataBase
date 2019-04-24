public class Car implements Parkable
{


    @Override
    public void park(ParkingLot parkingLot) {
        parkingLot.addVehicle();
        System.out.println("Added car");

    }

    @Override
    public void unpark(ParkingLot parkingLot) {
        parkingLot.removeVehicle();
        System.out.println("Removed car");

    }
}
