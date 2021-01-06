import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public static void main(String args[]) {
        Map<Long, String> charMap = new HashMap<>();
        long idBucket = 0;

        charMap.put(idBucket++, getH());
        charMap.put(idBucket++, getE());
        charMap.put(idBucket++, getL1());
        charMap.put(idBucket++, getL2());
        charMap.put(idBucket++, getO());
        charMap.put(idBucket++, getBlank());
        charMap.put(idBucket++, getW());
        charMap.put(idBucket++, getO2());
        charMap.put(idBucket++, getR());
        charMap.put(idBucket++, getL3());
        charMap.put(idBucket++, getD());
        charMap.put(idBucket, getEnd());

        for (long a = 0; a <= idBucket; a++) {
            System.out.print(charMap.get(a));
        }
    }
    
    public static String getH() {
         return "H";
    }
    
    public static String getE() {
         return "e";
    }
    
    public static String getL1() {
         return "l";
    }
    
    public static String getL2() {
         return "l";
    }
    
    public static String getO() {
         return "o";
    }
    
    public static String getBlank() {
         return " ";
    }
    
    public static String getW() {
         return "W";
    }
    
    public static String getO2() {
         return "o";
    }
    
    public static String getR() {
         return "r";
    }
    
    public static String getL3() {
         return "l";
    }
    
    public static String getD() {
         return "d";
    }
    
    public static String getEnd() {
         return "!";
    }
}
