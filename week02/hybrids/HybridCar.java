public class HybridCar {

    public static void main(String[] args) {
        Hybrid aHybrid = new Hybrid();

        double miles = 300;
        aHybrid.setElectricMiles(miles);
        aHybrid.setTotalkWh(70.0);

        double MPGe = aHybrid.calcMPGe();
        System.out.println(MPGe);

    }

}