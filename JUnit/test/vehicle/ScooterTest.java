package vehicle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScooterTest {
    @Test
    public void testDrive() {
        Scooter scooter = new Scooter();
        assertEquals(8, scooter.drive(2, 4));
    }
   
}
