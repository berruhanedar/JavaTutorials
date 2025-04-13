package _09_ForLoop;

public class NestedLoop {
    public static void main(String[] args) {
        // Outer Loop
        for (int i = 0; i < 4; i++) {
            System.out.println("Outer :" + i);

            // Inner Loop
            for (int j = 0; j < 2; j++) {
                System.out.println("  Inner :" + j);
            }
        }
    }
}
