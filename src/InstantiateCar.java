public class InstantiateCar {

    public static void main(String[] args) {
        Car estima = new Car();

        estima.speed = 30;
        estima.setSpeed (30);
        estima.setName  ("エスティマ");

        System.out.println("スピードは"+ estima.speed);
        System.out.println("スピードは"+estima.getSpeed());
        System.out.println("社名は");
    }
}
