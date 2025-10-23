import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testFinnishBundle() {
        Locale myLocale = new Locale("fi", "FI");
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        assertEquals("Montako tuotetta?", rb.getString("first"));
    }

    @Test
    public void testEnglishBundle() {
        Locale myLocale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        assertEquals("Total price: ", rb.getString("total"));
    }

    @Test
    public void testJapaneseBundle() {
        Locale myLocale = new Locale("ja", "JP");
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        assertEquals("総費用 ", rb.getString("total"));
    }

    @Test
    public void testSwedishBundle() {
        Locale myLocale = new Locale("sv", "SE");
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        assertEquals("Totalkostnad ", rb.getString("total"));
    }

    @Test
    public void testCalculateTotal() {
        List<Integer> price = new ArrayList<>();
        List<Integer> quantity = new ArrayList<>();
        price.add(2);
        price.add(4);
        quantity.add(1);
        quantity.add(2);
        assertEquals(10, Main.calculateTotal(price, quantity), 0.01);
    }
}