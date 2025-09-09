package org.timeConvertor;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TimeConvertorTest {

    private final TimeConvertor timeConvertor = new TimeConvertor();

    @org.junit.Test
    public void testMidnight() {
        Assertions.assertEquals("midnight", timeConvertor.convertTimeToBritish(0, 0));
    }

    @Test
    void testNoon() {
        Assertions.assertEquals("noon", timeConvertor.convertTimeToBritish(12, 0));
    }

    @Test
    void testOClock() {
        Assertions.assertEquals("one o'clock", timeConvertor.convertTimeToBritish(1, 0));
        Assertions.assertEquals("noon", timeConvertor.convertTimeToBritish(12, 0));
    }

    @Test
    void testQuarterPast() {
        Assertions.assertEquals("quarter past four", timeConvertor.convertTimeToBritish(4, 15));
    }

    @Test
    void testHalfPast() {
        Assertions.assertEquals("half past seven", timeConvertor.convertTimeToBritish(7, 30));
    }

    @Test
    void testQuarterTo() {
        Assertions.assertEquals("quarter to ten", timeConvertor.convertTimeToBritish(9, 45));
        Assertions.assertEquals("quarter to one", timeConvertor.convertTimeToBritish(12, 45));
    }

    @Test
    void testPastMinutes() {
        Assertions.assertEquals("five past two", timeConvertor.convertTimeToBritish(2, 5));
        Assertions.assertEquals("twenty past five", timeConvertor.convertTimeToBritish(5, 20));
        Assertions.assertEquals("twenty-five past six", timeConvertor.convertTimeToBritish(6, 25));
    }

    @Test
    void testToMinutes() {
        Assertions.assertEquals("twenty-five to eight", timeConvertor.convertTimeToBritish(7, 35));
        Assertions.assertEquals("twenty to nine", timeConvertor.convertTimeToBritish(8, 40));
        Assertions.assertEquals("ten to eleven", timeConvertor.convertTimeToBritish(10, 50));
        Assertions.assertEquals("five to twelve", timeConvertor.convertTimeToBritish(11, 55));
    }

    @Test
    void testSingleDigitHour() {
        Assertions.assertEquals("two o'clock", timeConvertor.convertTimeToBritish(14, 0)); // 14:00 → 2 o'clock
    }
}
