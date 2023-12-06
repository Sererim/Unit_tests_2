package tests;

// Junit imports.
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

// Test cases imports.
import src.Vehicle;
import src.Motorcycle;

// Unit tests.
public class testMotorcycle {
    
    private static Motorcycle motorcycle = new Motorcycle(null, null, 0);

    // Tests
    // Проверим так же что motorcycle действительно является экземпляром Vehicle.
    @Test
    void testMotorcycleConstructor() {
        assertInstanceOf(Vehicle.class, motorcycle);
    }

    // Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void testMotorcycleWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения.
    @Test
    void testMotorcycleSpeed() {
        assertEquals(0, motorcycle.getSpeed());
        motorcycle.testDrive();
        assertEquals(75, motorcycle);
    }

    // Проверить, что в режиме парковки (сначала testDrive, 
    // потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void testMotorcycleParking() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

    
}
