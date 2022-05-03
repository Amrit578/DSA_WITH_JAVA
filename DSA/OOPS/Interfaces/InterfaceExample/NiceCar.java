package DSA.OOPS.Interfaces.InterfaceExample;

public class NiceCar {
    public Engine engine;
    public Media player = new CDPlayer();




    public NiceCar()
    {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start()
    {
        engine.start();
    }

    public void stop()
    {
        engine.stop();
    }

    public void startMusic()
    {
        player.start();
    }
    public void stopMusic()
    {
        player.start();
    }

    public void UpgradeEngine()
    {
        this.engine = new ElectricEngine();
    }


}
