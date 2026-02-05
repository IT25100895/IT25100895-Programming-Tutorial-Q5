public class IT25100895 {

    // Add method
    public static int add(int a, int b) {
        return a + b;
    }

    // Multiply method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Square method
    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        // Expression 1: (3 * 4 + 5 * 7)^2
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        // Output results
        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}
