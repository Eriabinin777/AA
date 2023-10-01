package REVGARAGE;

import java.util.Collection;

public interface Garage {
    Collection<Owner> allCarsUniqueOwners();
    Collection<Car> topThreeCarsByMaxVelocity();
    Collection<Car> allCarsOfBrand(String var1);
    Collection<Car> carsWithPowerMoreThan(int var1);
    Collection<Car> allCarsOfOwner(Owner var1);
    int meanOwnersAgeOfCarBrand(String var1);
    int meanCarNumberForEachOwner();
    Car removeCar(int var1);
    void addNewCar(Car var1, Owner var2);
    record Car(int carId, String brand, String modelName, int maxVelocity, int power, int ownerId) {
    }
    record Owner(String name, String lastName, int age) {
    }
}
