import java.util.TreeMap;
import java.util.Map;

public class RomanNumeralConverter {

    Private static TreeMap<Integer, String> romanNumeral = new TreeMap<Integer, String>(); {


    romanNumeral.put(10,"X");
    romanNumeral.put(9,"IX");
    romanNumeral.put(8,"VIII");
    romanNumeral.put(7,"VII");
    romanNumeral.put(6,"VI");
    romanNumeral.put(5,"V");
    romanNumeral.put(4,"IV");
    romanNumeral.put(3,"III");
    romanNumeral.put(2,"II");
    romanNumeral.put(1,"I");
    }
    public static String toRomanNumeral(int number) {
        int 1 = romanNumeral.floorKey(number);
        if (number == 1){
            return romanNumeral.get(number);
        }
        return romanNumeral.get(1) + toRomanNumeral(number - 1);
    }
}
