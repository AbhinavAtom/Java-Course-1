public class Comparision {
    public static void main(String[] args) {
        
        /* Comparision operatos

            >  <   >=   <=  ==  !=  
        */

        int x = 4;
        int y = 5;
        
        Boolean compare = x > y;
        System.out.println(compare);

        compare = x < y;
        System.out.println(compare);

        compare = x <= 4;
        System.out.println(compare);

        compare = y >= 6;
        System.out.println(compare);

        compare = x == y;
        System.out.println(compare);

        compare = x != y;
        System.out.println(compare);

        /* 
            Logical Operators

            &&  ||  !
        */

        compare =  x>y && y>10;
        System.out.println(compare);

        compare = x == 10 || y != 10;
        System.out.println(compare);

        compare = !(x > y);
        System.out.println(compare);
    }
}
