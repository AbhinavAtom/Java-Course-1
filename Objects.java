public class Objects {
    public static void main(String[] args) {
        
        String h = "Hello";
        // h is an object of String : length() is a method
        System.out.println(h.length()); 

        sayHello();
        System.out.println(hi());
        System.out.println(name("Abhinav"));
        System.out.println(add2(5));
    }

    //return void, no argument(s) accepting
    public static void sayHello(){
        System.out.println("Hello Java.");
    }

    //return String, no argument(s) accepting
    public static String hi(){
        return "Hi";
    }

    //return String, String accepting
    public static String name(String n){
        return n + "!";
    }

    //return int, int accepting
    public static int add2(int n){
        return n + 2;
    }
}
