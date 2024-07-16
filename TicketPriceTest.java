import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicketPriceTest {

    @Test
    public void test1() {
        assertEquals("Invalid Input", Waterpark.TicketPrice(0.39, 1));
    }

    @Test
    public void test2() {
        assertEquals("Invalid Input", Waterpark.TicketPrice(0.41, 8));
    }

    @Test
    public void test3() {
        assertEquals("0", Waterpark.TicketPrice(0.45, 4));
    }

    @Test
    public void test4() {
        assertEquals("20000", Waterpark.TicketPrice(0.45, 7));
    }

    @Test
    public void test5() {
        assertEquals("150000", Waterpark.TicketPrice(1.34, 4));
    }

    @Test
    public void test6() {
        assertEquals("170000", Waterpark.TicketPrice(1.34, 7));
    }

    @Test
    public void test7() {
        assertEquals("180000", Waterpark.TicketPrice(1.8, 4));
    }

    @Test
    public void test8() {
        assertEquals("200000", Waterpark.TicketPrice(1.8, 7));
    }
}
