public class OutClass {
    public void inner(){
        class InClass{
            public void display(){
                System.out.println("Inner Class");
            }
        }

        InClass in = new InClass();
        in.display();
    }   


    public static void main(String[] args) {
        OutClass out = new OutClass();
        out.inner();
        
    }   
}
