import Date.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    Date date;
    @BeforeEach
    void setUp() {
        date = new Date(3,12,2021);
    }

    @Test
    void day() {
        int day = date.day();
        assertEquals(day,12);
    }

    @Test
    void year() {
        int year = date.year();
        assertEquals(year,2021);
    }

    @Test
    void month() {
        int month = date.month();
        assertEquals(month,3);
    }

    @Test
    void testToString() {
        String s = date.toString();
        assertEquals(s,"3/12/2021");
    }
}