package co.za.applicafro.sivuyile;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test(expected = NullPointerException.class)
    public void testException(){
        App app = new App(null);
    }
}
