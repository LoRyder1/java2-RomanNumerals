import org.junit.Test;

public class convertArabicTest {

    @Test
    public void convertArabicIsPassedOneAndReturnsNumeralI() {
        RomanNumeral number = new RomanNumeral(1);
        assertEquals("I", number.convertArabic());
    }
}
