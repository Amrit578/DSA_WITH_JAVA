package DSA.OOPS.Interfaces.InterfaceExample;

public class Car implements Engine,Breake, Media{

    @Override
    public void start()
    {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void breake() {
        System.out.println("I break like a normal car");
    }

    @Override
    public void stop()
    {
        System.out.println("I stop engine like a normal car");
    }
}
