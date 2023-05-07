package cs3500.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testConstructor() {
        assertDoesNotThrow(() -> new GradeBookEntry(100, 100, 100));
    }

}