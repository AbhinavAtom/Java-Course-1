import java.util.Scanner;
public class Loop {
        public static void main(String[] args) {
            
            //for loop
            int[]  arr = {1, 5, 3, 4, 5};

            for(int i=0 ; i<arr.length ; i++){
                if(arr[i] == 5){
                    System.out.println("Found a 5! at index " + i );
                }
            }

            //for loop : loop through
            int count = 0;
            for(int element:arr){
                System.out.println(element + " " + count);
                count++;
            }

            //for loop : used as to take user input
            Scanner sc = new Scanner(System.in);
            String[] names = new String[5];

            for(int i=0 ; i<5 ; i++){
                System.out.print("Input: ");
                String name = sc.nextLine();
                names[i] = name;
            }

            for(String n:names){
                System.out.println(n);
            }


            // break in loop
            for(String n: names){
                System.out.println(n);
                if(n.equals("tim"))
                    break;
            }

            //while loop
            System.out.print("Type a number: ");
            int x = sc.nextInt();

            int cnt = 0;
            while(x != 10){
                System.out.println("Type 10...");
                System.out.print("Type a number: ");
                x = sc.nextInt();
                cnt++;
            }
            System.out.println("You tried " + cnt + " times.");


            //do while loop
            do {
                System.out.println("Type 10...");
                System.out.print("Type a number: ");
                x = sc.nextInt();
            }while(x != 10);
            sc.close();
        }
}
