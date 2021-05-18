public class Array {
    public static void main(String[] args) {
        
        //Declaring array of 5 size
        String[] newArray = new String[5];

        //initializing array
        newArray[0] = "Joe";
        newArray[1] = "David";
        newArray[2] = "Sam";
        newArray[3] = "Tim";

        //accessing value of array
        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
        System.out.println(newArray[4]);    //null
        // System.out.println(newArray[5]); //error

        //int type array
        int[] newInt = {1, 2, 3, 4, 5};
        System.out.println(newInt[0]);
        System.out.println(newInt[1]);

        //double type array
        double[] newDouble = new double[3];
        newDouble[0] = 1;
        System.out.println(newDouble[0]);
        System.out.println(newDouble[1]);

    }
}
