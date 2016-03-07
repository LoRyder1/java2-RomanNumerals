import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class convertArabicTest {

    private RomanNumeral number;

    private void setArabic(int num) {
        number = new RomanNumeral(num, null);
    }

    @Test
    public void passOneAndReturnsNumeralI() {
        setArabic(1);
        assertEquals("I", number.convertArabic());
    }

    @Test
    public void passTwoAndReturnsNumeralII() {
        setArabic(2);
        assertEquals("II", number.convertArabic());
    }

    @Test
    public void passThreeAndReturnsAppendedStringIII() {
        setArabic(3);
        assertEquals("III", number.convertArabic());
    }

    @Test
    public void passingFourStopsHashEntryAfterFirstEntry() {
        setArabic(4);
        assertEquals("IV", number.convertArabic());
    }

    @Test
    public void canReturnNumeralAppendedWithDifferentEntries() {
        setArabic(6);
        assertEquals("VI", number.convertArabic());
    }

    @Test
    public void passEightAndReturnNumeralVIII() {
        setArabic(8);
        assertEquals("VIII", number.convertArabic());
    }

    @Test
    public void passLargeNumberAndIterateOverAllValues() {
        setArabic(1066);
        assertEquals("MLXVI", number.convertArabic());
    }

    @Test
    public void passAVeryLargeNumberAndIterate() {
        setArabic(1989);
        assertEquals("MCMLXXXIX", number.convertArabic());
    }

}
