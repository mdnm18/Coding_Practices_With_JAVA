
import java.util.*;

public class p7 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("LETS COMPUTE THE VOLUME OF EARTH :->");
            System.out.println("ENTER THE YOUR NAME : ");
            String name = sc.next();
            float volume = 4.0f / 3.0f;
            float radiusInKM = 6378;
            float radiusInMIles = 6378 * 0.621371f;
            double volumeEarthKM = volume * (float) Math.PI * radiusInKM * radiusInKM * radiusInKM;
            double volumeEarthMiles = volume * (float) Math.PI * radiusInMIles * radiusInMIles * radiusInMIles;
            System.out.println("HI " + name + ",\nTHE VOLUME OF EARTH IN CUBIC KILOMETERS IS " + volumeEarthKM + " AND CUBIC MILES IS " + volumeEarthMiles);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
