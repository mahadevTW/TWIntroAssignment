/**
 * Created by mahadev on 24/05/16.
 */
public class StarGame {
    public static void main(String[] args) {
        simpleStar();
        int numberOfStars = 8;
        horizontalLine(numberOfStars);
    }

    private static void horizontalLine(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
    }

    private static void simpleStar() {
        System.out.println("*");
    }
}
