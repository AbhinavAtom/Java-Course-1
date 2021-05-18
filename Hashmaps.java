import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Hashmaps {
    public static void main(String[] args) {
        
        Map m = new HashMap();

        //key - value pair  : key value pair of any data type
        m.put("abhinav", 99.9);
        m.put("anshika", "school");
        m.put(11, 100);
        m.put("Prime", false);
        System.out.println(m);

        //accessing using key
        System.out.println(m.get("Prime"));

        //overwriting new value
        m.put("anshika", "college");
        System.out.println(m.get("anshika"));

        //existance checking
        Boolean isKey = m.containsKey("Prime");
        Boolean isValue = m.containsValue("elevator");
        System.out.println("Does Prime key exist? " + isKey);
        System.out.println("Does elevator value exist? " + isValue);

        //getting non-existing key value
        System.out.println(m.get("tim")); //null

        //accessing values 
        System.out.println(m.values());

        //accessing keys
        System.out.println(m.keySet());

        //clearing MAP
        m.clear();
        System.out.println(m);

        //Is Map Empty
        System.out.println(m.isEmpty());


        Map tm = new TreeMap();

        //key - value pair  : key of same data type
        tm.put("abhinav", 99.9);
        tm.put("anshika", "school");
        // m.put(11, 100); // not allowed
        tm.put("Prime", false);
        System.out.println(tm);

        //accessing using key
        System.out.println(tm.get("Prime"));

        //overwriting new value
        tm.put("anshika", "college");
        System.out.println(tm.get("anshika"));
    }
}
