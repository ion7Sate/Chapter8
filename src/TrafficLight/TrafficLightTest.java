package TrafficLight;

public class TrafficLightTest {
    public static void main(String[] args) {
        for (TrafficLight trafficLight: TrafficLight.values()) {
            System.out.printf("%6s%3d%n",trafficLight,trafficLight.getDuration());
        }
    }
}
