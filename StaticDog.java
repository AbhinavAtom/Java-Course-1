public class StaticDog {

    protected static int count = 0;
    protected String name;
    protected int age;

    public StaticDog(String name, int age){

        this.name = name;
        this.age = age;

        //this is not recommended
        // this.count += 1;

        StaticDog.count += 1;
        StaticDog.display();
        this.display2();
    }

    public static void display(){
        System.out.println("I am a dog!");
    }

    public void display2(){
        System.out.println("I am a DOG!");
    }

    public static void main(String[] args) {
        StaticDog tim = new StaticDog("tim", 9);
        StaticDog bill = new StaticDog("bill", 10);

        System.out.println(tim.name);
        System.out.println(tim.age);
        // System.out.println(tim.count);
        System.out.println(StaticDog.count);
    }

}

