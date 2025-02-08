public class HeavyDrone extends Drone{
    private double speed;
    public HeavyDrone(String id){
        super(id,150);
        this.speed=50;


    } @Override
    public double flyTime(double distance) {
        return distance/speed;

    }
}
