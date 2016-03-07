import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class convertArabicTest {

    private RomanNumeral number;

    private void setArabic(int num) {
        number = new RomanNumeral(num);
    }

    @Test
    public void convertArabicIsPassedOneAndReturnsNumeralI() {
        setArabic(1);
        assertEquals("I", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedTwoAndReturnsNumeralII() {
        setArabic(2);
        assertEquals("II", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedThreeAndReturnsAppendedStringIII() {
        setArabic(3);
        assertEquals("III", number.convertArabic());
    }
}
