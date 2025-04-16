package _11_JavaMath;

public class JavaMath {
    public static void main(String[] args) {

        // The Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println("Math.max(5,10): " + Math.max(5, 10));

        // The Math.min(x,y) method can be used to find the lowest value of x and y:
        System.out.println("Math.min(5,10): " + Math.min(5, 10));

        // The Math.sqrt(x) method returns the square root of x
        System.out.println("Math.sqrt(64): " + Math.sqrt(64));

        // The Math.abs(x) method returns the absolute (positive) value of x
        System.out.println("Math.abs(-10.4): " + Math.abs(-10.4));

        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println("Math.random(): " + Math.random());

        // Math.random() = 0-10
        System.out.println("Math.random(): " + Math.random() * 10);

        // Math.random() = 0-100
        System.out.println("Math.random(): " + Math.random() * 100);

        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.println(randomNum);

    }
}
