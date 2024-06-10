package SolarSystem;

public class SolarSystem {
    public static void main(String[] args) {
        SolarSystemBase solar = new SolarSystemBase();
        solar.sun = "1";
        solar.planet = "2";
        solar.star = "2";
        System.out.println("the solar system is ready");

        // ....................................

        FeatureSun xros = new FeatureSun();
        xros.color = "Pink";
        xros.temp = "12344kv";
        xros.size = "12km";

        // ....................................

        Planet2 perox = new Planet2();
        perox.color = "Green";
        perox.size = "12m";
        perox.radius = "3m";


    }
}
