// Overloading Example

public class Student implements Comparable<Student>{
    
    private String name;
    public Student(String name){

        this.name = name;
    }

    public boolean equals(Student other){
        if(this.name == other.name)
            return true;
        else 
            return false;
    }

    public int compareTo(Student other ){
        return this.name.compareTo(other.name);
    }

    public String toString(){
        return "Student('" + this.name + "')";
    }

    public static void main(String[] args) {
        Student tim  = new Student("tim"); 
        Student joe  = new Student("joe");
        Student cook  = new Student("joe");

        //comparing actual objects
        System.out.println(tim  == joe);    //false
        System.out.println(cook  == joe);   //false

        //comapring using funtions
        System.out.println(joe.equals(tim));    //true
        System.out.println(joe.equals(cook));   //false

        //returns a integer value
        System.out.println(joe.compareTo(tim) > 0);
        System.out.println(joe.compareTo(tim) < 0);

        //memory location of objects: when toString not created
        System.out.println(tim);

        System.out.println(cook);

        System.out.println(cook.toString());
    }
}
