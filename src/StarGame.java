public class StarGame {
    public static void main(String[] args) {
        simpleStar();
        int numberOfStars = 8;
        horizontalLine(numberOfStars);
        System.out.println();
        System.out.println("Vertical Stars");
        numberOfStars = 3;
        verticalLine(numberOfStars);
    }

    private static void verticalLine(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            System.out.println("*");
        }
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
