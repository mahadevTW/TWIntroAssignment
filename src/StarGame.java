public class StarGame {
    public static void main(String[] args) {
        simpleStar();
        int numberOfStars = 8;
        horizontalLine(numberOfStars);
        System.out.println();
        System.out.println("Vertical Stars");
        numberOfStars = 3;
        verticalLine(numberOfStars);
        System.out.println("Right Angle trangle");
        rightTrangle(numberOfStars);
        System.out.println("Isosceles Triangle");
        IsoscelesTriangle(numberOfStars);
    }

    private static void IsoscelesTriangle(int numberOfStars) {
        for (int i = 1; i <=numberOfStars; i++) {
            for (int j = 0; j < (numberOfStars-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*i-1) ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void rightTrangle(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
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
