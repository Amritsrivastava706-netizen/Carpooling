import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        RideBookingSystem rideBookingSystem = new RideBookingSystem();

        rideBookingSystem.createRide(1,"Jaipur", "Delhi", 5, 725.00);
        rideBookingSystem.createRide(2,"Greater Noida", "Agra", 3, 340.00);
        rideBookingSystem.createRide(3,"Gurugram", "Faridabad", 2, 180.00);
        rideBookingSystem.createRide(4,"Gurugram", "Delhi", 2, 80.00);
        rideBookingSystem.createRide(5,"Gurugram", "Varanasi", 2, 340.00);
        System.out.println(rideBookingSystem.showAllRide());
    }
}