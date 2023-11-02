package orders;

import org.junit.Test;
import parts.Product;

import static org.junit.Assert.*;

public class RequestTest {


    @Test
    public void RequestTest() {

        Request request = new Request(new Product("p", "p1", "ct", 10, "des"), "cust1", "bmw", "2012", "20/5/2024", false);


    }

}