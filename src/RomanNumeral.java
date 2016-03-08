import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RomanNumeral {

    private int arabic;
    private String roman;
    private NavigableMap<Integer, String> navMap;
    private StringBuilder romanString = new StringBuilder();
    private int arabicNum = 0;

    public RomanNumeral(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;

//        declare, instantiate, intialize with constructor
//        for loop - initialize, terminate, increment
//        for each loop - for each (A in c)

//  The outer pair of braces means that you are declaring and initializing an anonymous inner class that extends TreeMap. The inner pair of braces represents an instance initializer, code that is run when an instance is created.

        navMap = new TreeMap<Integer, String>() {
            {
                put(1000, "M");
                put(900, "CM");
                put(500, "D");
                put(400, "CD");
                put(100, "C");
                put(90, "XC");
                put(50, "L");
                put(40, "XL");
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(1, "I");
            }
        }.descendingMap();

    }

    public String convertArabic() {
        for(Map.Entry<Integer, String> entry : navMap.entrySet()) {
            buildString(entry.getKey(), entry.getValue());
        }
        return romanString.toString();
    }
//    Better to use StringBuilder because String is an immutable class and it can not be modified when created. String concatenation results in creating a new instance of the String class with the modified string.

    private void buildString(int key, String value) {
        int repeat = arabic / key;
        for(int i = 0; i < repeat; i++) {
            romanString.append(value);
        }
        arabic %= key;
    }


    public int convertRoman() {
        for (Map.Entry<Integer, String> entry : navMap.entrySet()) {
            onMatchAddKey(entry.getKey(), entry.getValue());
        }
        return arabicNum;
    }

    private void onMatchAddKey(Integer key, String value) {
        while (roman.startsWith(value)) {
            arabicNum += key;
            subtractString(value.length());
        }
    }

    private void subtractString(int chars) {
        roman = roman.substring(chars);
    }
}
