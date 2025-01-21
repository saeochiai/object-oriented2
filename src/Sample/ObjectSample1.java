package Sample;

public class ObjectSample1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(100);
        car.setBodyColor("yello");
        System.out.println("スピードは"+car.getSpeed()+"km/h");
    }

}
