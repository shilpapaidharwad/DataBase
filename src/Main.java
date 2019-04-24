public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car1=new Car();
        ParkingLot parkingLot= new ParkingLot(2);
        car1.park(parkingLot);
        Car cr2=new Car();
        cr2.park(parkingLot);
        System.out.print(parkingLot.isFull());


    }
}


