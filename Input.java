import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);

        //String Input
        // String name = sc.next();
        // System.out.println(name);

        //Integer Input
        // int num = sc.nextInt();
        // System.out.println(num);

        //Double Input
        // double dbl = sc.nextDouble();
        // System.out.println(dbl);

        //Boolean Input
        // Boolean bool = sc.nextBoolean();
        // System.out.println(bool);

        //Coversio of 'String' into 'Integer'
        String value = sc.next();
        int x = Integer.parseInt(value);
        System.out.println(x * 2);

        sc.close();
    }
}
