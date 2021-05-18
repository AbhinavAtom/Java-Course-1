import java.util.Set;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        
        Set<Integer> t = new HashSet<Integer>();

        // inserting data into set
        t.add(5);
        t.add(15);
        t.add(25);
        t.add(52);
        t.add(5);
        System.out.println(t);

        //deleting data from set
        t.remove(25);
        System.out.println(t);

        //finding size of the set
        int len = t.size();
        System.out.println("Size is "  + len);

        //finding any element
        Boolean x = t.contains(5);
        System.out.println("Set contains 5: " + x);

        //check empty 
        Boolean empty = t.isEmpty();
        System.out.println("Is Set Empty? " + empty);
        
        //clearing the Set
        t.clear();
        System.out.println(t);


    }
}
