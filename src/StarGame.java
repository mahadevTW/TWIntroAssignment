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
        isoscelesTriangle(numberOfStars);
        System.out.println("Diamond");
        diamond(numberOfStars);
        System.out.println("Diamond with bill");
        diamondWithBill(numberOfStars);
        fizzBuzz(100);
        System.out.println("Prime Factors of 100");
        generatePrimeFactors(100);

    }

    private static void generatePrimeFactors(int number) {
        for (int i = 2; i <number/2 ; i++) {
            if(isPrime(i) &&number%i == 0){
                System.out.print(i +" ");
            }
        }
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i < number / 2; i++) {
            if(number%i == 0)
                return false;
        }
        return true;
    }

    private static void fizzBuzz(int number) {
        for (int i = 1; i <=number ; i++) {
            if(i%5 == 0 && i%3 == 0){
                System.out.println("FIZZ BUZZ");
            }
            else if (i%3 == 0){
                System.out.println("FIZZ");
            }else if (i%5 == 0){
                System.out.println("BUZZ");
            }else {
                System.out.println(i);
            }
        }
    }

    private static void diamondWithBill(int numberOfStars) {
        for (int i = 1; i <=numberOfStars; i++) {
            for (int j = 0; j < (numberOfStars-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*i-1)-1 ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("BILL");
        for (int i = 1; i <=numberOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=(numberOfStars-(2*i-1) ) ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void diamond(int numberOfStars) {
        for (int i = 1; i <=numberOfStars; i++) {
            for (int j = 0; j < (numberOfStars-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*i-1) ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       for (int i = 1; i <=numberOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=(numberOfStars-(2*i-1) ) ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    private static void isoscelesTriangle(int numberOfStars) {
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
