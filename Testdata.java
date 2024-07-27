import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testdata {
    @Test
    public void test1() {
        assertEquals("Invalid Input", Waterpark.TicketPrice(0.3, 3));
    }
    @Test
    public void test2() {
        assertEquals("Invalid Input", Waterpark.TicketPrice(0.5, 8));
    }
    @Test
    public void test3() {
        assertEquals("0", Waterpark.TicketPrice(0.5, 3));
    }
    @Test
    public void test4() {
        assertEquals("150000", Waterpark.TicketPrice(0.9, 3));
    }
    @Test
    public void test5() {
        assertEquals("180000", Waterpark.TicketPrice(1.8, 3));
    }
    @Test
    public void test6() {
        assertEquals("20000", Waterpark.TicketPrice(0.5, 7));
    }
    @Test
    public void test7() {
        assertEquals("170000", Waterpark.TicketPrice(0.9, 7));
    }
    @Test
    public void test8() {
        assertEquals("200000", Waterpark.TicketPrice(1.8, 7));
    }

}
