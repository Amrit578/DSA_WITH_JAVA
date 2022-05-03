package DSA.OOPS.Interfaces.InterfaceExample;

public class Main {
    public static void main(String[] args) {

//        Engine car = new Car();
//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.UpgradeEngine();
        car.start();
        car.stop();
    }
}
