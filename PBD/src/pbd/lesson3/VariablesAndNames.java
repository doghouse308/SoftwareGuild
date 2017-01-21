package pbd.lesson3;

/**
 *
 * @author Paul Peterson
 */
public class VariablesAndNames {

    public static void main(String[] args) {
        //originally space_in_a_car, carpool_capacitywere and average_passengers_per_car
        //were declared as a double, since we cannot have partial
        // people I changed them to integers
        int cars, drivers, passengers, cars_not_driven, cars_driven,
                space_in_a_car, carpool_capacity, average_passengers_per_car;
        // set variable car to 100
        cars = 100;
        // set variable space_in_a_car to 4
        space_in_a_car = 4;
        // set variable drivers to 30
        drivers = 30;
        // set variable passengers to 90
        passengers = 90;
        //cars_not_driven equals 100 - 30 = 70
        cars_not_driven = cars - drivers;
        //cars_driven equals 30
        cars_driven = drivers;
        //carpool_capacity equals 30 * 4 equals 120
        carpool_capacity = cars_driven * space_in_a_car;
        //average passengers_per_car euals 90 / 30 = 3
        average_passengers_per_car = passengers / cars_driven;

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car 
                + " passengers in each car.");
    }
}
