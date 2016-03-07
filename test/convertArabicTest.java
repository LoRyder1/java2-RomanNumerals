import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class convertArabicTest {

    @Test
    public void convertArabicIsPassedOneAndReturnsNumeralI() {
        RomanNumeral number = new RomanNumeral(1);
        assertEquals("I", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedTwoAndReturnsNumeralII() {
        RomanNumeral number = new RomanNumeral(2);
        assertEquals("II", number.convertArabic());
    }
}
