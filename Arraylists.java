
import java.util.*;

public class Arraylists {
    public static void main(String[] args) {
    
        ArrayList<Integer> t = new ArrayList<Integer>();

        //adding new value
        t.add(5);
        t.add(7);
        t.add(3);
        t.add(9);
        System.out.println(t);

        //removing a value : indexing
        t.remove(0); 
        System.out.println(t);

        //getting a value : indexing
        System.out.println(t.get(0));

        //finding size
        System.out.println(t.size());

        //getting subList
        System.out.println(t.subList(0, 2));

        //setting a value
        t.set(0, 11);
        System.out.println(t);
        
    }
}
