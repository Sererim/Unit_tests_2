package tests;

// Junit imports.
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

// Test cases imports.
import src.Vehicle;
import src.Car;

// Unit tests.
public class testVehicle {

    private static Car car = new Car(null, null, 0);

    // Tests
    // Проверить, что экземпляр объекта Car также является экземпляром 
    // транспортного средства (используя оператор instanceof).
    @Test
    void testConstructor() {
        assertInstanceOf(Vehicle.class, car);
    }

    // Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void testCarWheels() {
        assertEquals(4, car.getNumWheels());
    }

    // Проверить, что объект Car развивает скорость 60 в режиме тестового вождения.
    @Test
    void testCarSpeed() {
        assertEquals(0, car.getSpeed());
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    // Проверить, что в режиме парковки (сначала testDrive, 
    // потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void testCarParking() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}
