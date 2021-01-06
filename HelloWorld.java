import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public static void main(String args[]) {
        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<String> characters = new ArrayList<>();
        // Map<Long, String> charMap = new HashMap<>();
        long length = 0;

        characters.add(getH());
        indexes.add(0);
        length = length + 1;
        characters.add(getE());
        indexes.add(1);
        length = length + 1;
        characters.add(getL1());
        indexes.add(2);
        length = length + 1;
        characters.add(getL2());
        indexes.add(3);
        length = length + 1;
        characters.add(getO());
        indexes.add(4);
        length = length + 1;
        characters.add(getBlank());
        indexes.add(5);
        length = length + 1;
        characters.add(getW());
        indexes.add(6);
        length = length + 1;
        characters.add(getO2());
        indexes.add(7);
        length = length + 1;
        characters.add(getR());
        indexes.add(8);
        length = length + 1;
        characters.add(getL3());
        indexes.add(9);
        length = length + 1;
        characters.add(getD());
        indexes.add(10);
        length = length + 1;
        characters.add(getEnd());
        indexes.add(11);
        length = length + 1;

        for (long a = 0; a < length; a++) {
            long c = Integer.parseInt("00");
            
            for (long b = 0; b < length; b++) {
                if (indexes.get((int) b) == a) {
                    c = b;
                }
            }
            
            System.out.print(characters.get((int) c));
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
