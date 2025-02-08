public class Main {
    public static void main(String[] args) {

        HeavyDrone heavyDrone = new HeavyDrone("HD-001");
        LightDrone lightDrone = new LightDrone("LD-001");


        heavyDrone.setStatus("Delivering");
        lightDrone.setStatus("Idle");

        System.out.println("Heavy Drone ID: " + heavyDrone.getId());
        System.out.println("Status: " + heavyDrone.getStatus());
        System.out.println("Cargo Capacity: " + heavyDrone.getCargoCapacity() + " kg");
        System.out.println("Estimated Fly Time for 100 km: " + heavyDrone.flyTime(100) + " hours\n");

        System.out.println("Light Drone ID: " + lightDrone.getId());
        System.out.println("Status: " + lightDrone.getStatus());
        System.out.println("Cargo Capacity: " + lightDrone.getCargoCapacity() + " kg");
        System.out.println("Estimated Fly Time for 100 km: " + lightDrone.flyTime(100) + " hours");
    }
}
