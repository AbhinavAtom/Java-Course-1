// related file to Vehicle.java

public class Car implements Vehicle {
    private int gear=0;
    private int speed=0;

    public void changeGear(int gear){
        this.gear = gear;
    }

    public void speedUp(int change){
        this.speed += change;
    }

    public void slowDown(int change){
        this.speed -= change;
    }

    public void display(){
        System.out.println("I am a car, going " + this.speed + "km/h and I am in gear " + this.gear);
        out();
    }


    public static void main(String[] args) {
        Car ford =  new Car();
        ford.changeGear(2);
        ford.speedUp(12);
        ford.display();

        int x = Vehicle.math(5);
        System.out.println(x);
    }
}


