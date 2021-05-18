public class Outerclass {
    private class Innerclass{
        public void display(){
            System.out.println("This is an Inner class!");
        }
    }

    public void Inner(){
        Innerclass in = new Innerclass();
        in.display();
    }
    
    public static void main(String[] args) {
        Outerclass out = new Outerclass();
        Outerclass.Innerclass in = out.new Innerclass();

        out.Inner();    //method 1 
        in.display();   //method 2
    }
}


