import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.equals("abhinav")){
            System.out.println("You typed abhinav");
        } else if(s.equals("java")){
            System.out.println("You typed java");
        } else {
            System.out.println("You typed smething");
        }

        sc.close();
    }
}
