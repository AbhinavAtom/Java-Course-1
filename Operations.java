public class Operations {
    public static void main(String[] args) {
        
        //declaration only
        int x;

        //initialization after declaration only
        x = 6;

        //declaration and initialization
        int y = 12;

        //addition of x and y
        int sum = x + y;
        System.out.println("Sum of "+ x + " and " + y + " is: " + sum);

        //subtraction of x and y
        int sub = x - y;
        System.out.println("Subtraction of " + x + " and " + y + " is: " + sub);

        //multiplication of x and y
        int mult = x * y;
        System.out.println("Mutiplication of " + x + " and " + y + " is: " + mult);

        //division of x and y 
        double div = (double) x / y;
        System.out.println("Division of " + x + " by " + y + " is: " + div);

        //modulo of x and y
        int mod = x % y;
        System.out.println("Modulo of " + x +" by " + y + " is: " + mod );
    }
}
