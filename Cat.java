public class Cat extends Dog {

    private int food;

    public Cat(String name, int age, int food){
       super(name, age);
        this.food = food;
    }
    public Cat(String name, int age){
        super(name, age);
         this.food = 50;
     }
     public Cat(String name){
        super(name, 0);
         this.food = 0;
     }
     
    public void speak(){
        System.out.println("Meow my name is " + this.name + " and I get fed " + this.food ) ;
    }

    public void eat(int x){
        this.food -= x;
    }

    public static void main(String[] args) {
        Cat tim = new Cat("tim", 10, 100);
        Cat mike = new Cat("mike", 15);
        Cat joe = new Cat("joe");

        tim.speak();
        mike.speak();
        joe.speak();
    }


}
