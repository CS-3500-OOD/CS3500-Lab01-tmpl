package cs3500.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testToString() {

        Student s = new Student("Mark Fontenot", 3.6);
        assertEquals(s.toString(), "Mark Fontenot");

    }
}