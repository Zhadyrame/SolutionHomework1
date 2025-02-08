public class LightDrone extends Drone{
    private double speed;
    public LightDrone(String id){
        super(id,30);
        this.speed=150;
    }
    @Override
    public double flyTime(double distance) {
        return distance/speed;
    }
}
