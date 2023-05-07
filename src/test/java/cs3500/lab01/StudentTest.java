package cs3500.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testConstructor() {
        assertDoesNotThrow(() -> new GradeBookEntry(100, 100, 100));
    }

    @Test
    void testCourseGrade() {
        GradeBookEntry g = new GradeBookEntry(100,100,100);
        double avg = g.getCourseGrade();
        assertEquals(100.0, avg, 0.01);
    }
}