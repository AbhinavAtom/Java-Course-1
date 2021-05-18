public class Dog {
    

    // private String name;
    // private int age;

    //public: to access from Cat class
    // public String name;
    // public int age;
    
    //protected: to inherit it from inherited class
    protected String name;
    protected int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

    // public int getAge(){
    //     return this.age;
    // }

    // Inheritance Case
    protected int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void add2(){
        this.age += 2;
    }


    public static void main(String[] args) {
        Dog d = new Dog("tim", 2);

        d.speak();
        d.setAge(5);
        d.speak();


        //creating another instance
        Dog p = new Dog("mike", 7);

        p.speak();
        int age = p.getAge();
        System.out.println("age : " + age);

        p.add2();
        p.speak();
    }
}
