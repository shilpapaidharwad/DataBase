public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ParkingLot parkingLot= new ParkingLot(2);

        Parkable car1= new Car();
        car1.park(parkingLot);
        Parkable car2= new Car();


        car2.park(parkingLot);

        /*car1.park(parkingLot);
        car2.unpark(parkingLot);*/

        System.out.print(parkingLot.isFull());


    }
}


